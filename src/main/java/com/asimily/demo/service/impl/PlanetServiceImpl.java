package com.asimily.demo.service.impl;

import com.asimily.demo.client.ApiClient;
import com.asimily.demo.model.Planet;
import com.asimily.demo.service.PlanetService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanetServiceImpl implements PlanetService {

    private ApiClient apiClient;

    @Autowired
    public PlanetServiceImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public List<Planet> getPlanets() {
        List<Planet> planets = apiClient.getList();
        return planets;
    }

    @Override
    public List<String> getPlanetListByYear(int year) {
        List<Planet> planets = apiClient.getList();
        return planets.parallelStream()
                .filter(planet -> planet.getDiscoveryYear() != null && planet.getDiscoveryYear() == year)
                .map(Planet::getPlanetIdentifier).collect(Collectors.toList());
    }

    @Override
    public Planet getHottestPlanet() {
        List<Planet> planets = apiClient.getList();
        return planets.parallelStream().max(this::comparePlanetTemperature).orElse(null);
    }

    private int comparePlanetTemperature(Planet o1, Planet o2) {
        if (o1.getSurfaceTempK() == null) {
            return 1;
        }
        if (o2.getSurfaceTempK() == null) {
            return -1;
        }
        return o1.getSurfaceTempK().compareTo(o2.getSurfaceTempK());
    }

    @Override
    public long getOrphanPlanetCount() {
        List<Planet> planets = apiClient.getList();
        return planets.parallelStream().filter(this::isOrphan).count();
    }

    private boolean isOrphan(Planet planet) {
        return Strings.isEmpty(planet.getHostStarAgeGyr()) && isNull(planet.getHostStarMassSlrMass())
                && isNull(planet.getHostStarMetallicity()) && isNull(planet.getHostStarRadiusSlrRad()) &&
                isNull(planet.getHostStarTempK());
    }

    private boolean isNull(Integer param) {
        return param == null || param == 0;
    }

    private boolean isNull(Double param) {
        return param == null || param == 0;
    }
}
