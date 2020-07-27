package com.asimily.demo.controller;

import com.asimily.demo.model.Planet;
import com.asimily.demo.service.PlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanetController {

    private PlanetService planetService;

    @Autowired
    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    @GetMapping("/")
    public List<Planet> getPlanets() {
        return planetService.getPlanets();
    }

    @GetMapping("/api/v1/planet/{discoveryYear}")
    public List<String> getPlanetListByYear(@PathVariable(name = "discoveryYear") int year) {
        return planetService.getPlanetListByYear(year);
    }

    @GetMapping("/api/v1/planet/hottest")
    public Planet getHottestPlanet() {
        return planetService.getHottestPlanet();
    }

    @GetMapping("/api/v1/planets/orphan/count")
    public long getOrphanPlanet() {
        return planetService.getOrphanPlanetCount();
    }
}
