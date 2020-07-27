package com.asimily.demo.service;

import com.asimily.demo.model.Planet;

import java.util.List;

public interface PlanetService {
    List<Planet> getPlanets();
    List<String> getPlanetListByYear(int year);
    Planet getHottestPlanet();
    long getOrphanPlanetCount();
}
