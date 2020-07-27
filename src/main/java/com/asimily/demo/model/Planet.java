

package com.asimily.demo.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Planet {

    @JsonProperty("PlanetIdentifier")
    private String planetIdentifier;
    @JsonProperty("TypeFlag")
    private Integer typeFlag;
    @JsonProperty("PlanetaryMassJpt")
    private String planetaryMassJpt;
    @JsonProperty("RadiusJpt")
    private Double radiusJpt;
    @JsonProperty("PeriodDays")
    private Double periodDays;
    @JsonProperty("SemiMajorAxisAU")
    private String semiMajorAxisAU;
    @JsonProperty("Eccentricity")
    private String eccentricity;
    @JsonProperty("PeriastronDeg")
    private String periastronDeg;
    @JsonProperty("LongitudeDeg")
    private String longitudeDeg;
    @JsonProperty("AscendingNodeDeg")
    private String ascendingNodeDeg;
    @JsonProperty("InclinationDeg")
    private String inclinationDeg;
    @JsonProperty("SurfaceTempK")
    private String surfaceTempK;
    @JsonProperty("AgeGyr")
    private String ageGyr;
    @JsonProperty("DiscoveryMethod")
    private String discoveryMethod;
    @JsonProperty("DiscoveryYear")
    private Integer discoveryYear;
    @JsonProperty("LastUpdated")
    private String lastUpdated;
    @JsonProperty("RightAscension")
    private String rightAscension;
    @JsonProperty("Declination")
    private String declination;
    @JsonProperty("DistFromSunParsec")
    private String distFromSunParsec;
    @JsonProperty("HostStarMassSlrMass")
    private Double hostStarMassSlrMass;
    @JsonProperty("HostStarRadiusSlrRad")
    private Double hostStarRadiusSlrRad;
    @JsonProperty("HostStarMetallicity")
    private Double hostStarMetallicity;
    @JsonProperty("HostStarTempK")
    private Integer hostStarTempK;
    @JsonProperty("HostStarAgeGyr")
    private String hostStarAgeGyr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("PlanetIdentifier")
    public String getPlanetIdentifier() {
        return planetIdentifier;
    }

    @JsonProperty("PlanetIdentifier")
    public void setPlanetIdentifier(String planetIdentifier) {
        this.planetIdentifier = planetIdentifier;
    }

    @JsonProperty("TypeFlag")
    public Integer getTypeFlag() {
        return typeFlag;
    }

    @JsonProperty("TypeFlag")
    public void setTypeFlag(Integer typeFlag) {
        this.typeFlag = typeFlag;
    }

    @JsonProperty("PlanetaryMassJpt")
    public String getPlanetaryMassJpt() {
        return planetaryMassJpt;
    }

    @JsonProperty("PlanetaryMassJpt")
    public void setPlanetaryMassJpt(String planetaryMassJpt) {
        this.planetaryMassJpt = planetaryMassJpt;
    }

    @JsonProperty("RadiusJpt")
    public Double getRadiusJpt() {
        return radiusJpt;
    }

    @JsonProperty("RadiusJpt")
    public void setRadiusJpt(Double radiusJpt) {
        this.radiusJpt = radiusJpt;
    }

    @JsonProperty("PeriodDays")
    public Double getPeriodDays() {
        return periodDays;
    }

    @JsonProperty("PeriodDays")
    public void setPeriodDays(Double periodDays) {
        this.periodDays = periodDays;
    }

    @JsonProperty("SemiMajorAxisAU")
    public String getSemiMajorAxisAU() {
        return semiMajorAxisAU;
    }

    @JsonProperty("SemiMajorAxisAU")
    public void setSemiMajorAxisAU(String semiMajorAxisAU) {
        this.semiMajorAxisAU = semiMajorAxisAU;
    }

    @JsonProperty("Eccentricity")
    public String getEccentricity() {
        return eccentricity;
    }

    @JsonProperty("Eccentricity")
    public void setEccentricity(String eccentricity) {
        this.eccentricity = eccentricity;
    }

    @JsonProperty("PeriastronDeg")
    public String getPeriastronDeg() {
        return periastronDeg;
    }

    @JsonProperty("PeriastronDeg")
    public void setPeriastronDeg(String periastronDeg) {
        this.periastronDeg = periastronDeg;
    }

    @JsonProperty("LongitudeDeg")
    public String getLongitudeDeg() {
        return longitudeDeg;
    }

    @JsonProperty("LongitudeDeg")
    public void setLongitudeDeg(String longitudeDeg) {
        this.longitudeDeg = longitudeDeg;
    }

    @JsonProperty("AscendingNodeDeg")
    public String getAscendingNodeDeg() {
        return ascendingNodeDeg;
    }

    @JsonProperty("AscendingNodeDeg")
    public void setAscendingNodeDeg(String ascendingNodeDeg) {
        this.ascendingNodeDeg = ascendingNodeDeg;
    }

    @JsonProperty("InclinationDeg")
    public String getInclinationDeg() {
        return inclinationDeg;
    }

    @JsonProperty("InclinationDeg")
    public void setInclinationDeg(String inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
    }

    @JsonProperty("SurfaceTempK")
    public String getSurfaceTempK() {
        return surfaceTempK;
    }

    @JsonProperty("SurfaceTempK")
    public void setSurfaceTempK(String surfaceTempK) {
        this.surfaceTempK = surfaceTempK;
    }

    @JsonProperty("AgeGyr")
    public String getAgeGyr() {
        return ageGyr;
    }

    @JsonProperty("AgeGyr")
    public void setAgeGyr(String ageGyr) {
        this.ageGyr = ageGyr;
    }

    @JsonProperty("DiscoveryMethod")
    public String getDiscoveryMethod() {
        return discoveryMethod;
    }

    @JsonProperty("DiscoveryMethod")
    public void setDiscoveryMethod(String discoveryMethod) {
        this.discoveryMethod = discoveryMethod;
    }

    @JsonProperty("DiscoveryYear")
    public Integer getDiscoveryYear() {
        return discoveryYear;
    }

    @JsonProperty("DiscoveryYear")
    public void setDiscoveryYear(Integer discoveryYear) {
        this.discoveryYear = discoveryYear;
    }

    @JsonProperty("LastUpdated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("LastUpdated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("RightAscension")
    public String getRightAscension() {
        return rightAscension;
    }

    @JsonProperty("RightAscension")
    public void setRightAscension(String rightAscension) {
        this.rightAscension = rightAscension;
    }

    @JsonProperty("Declination")
    public String getDeclination() {
        return declination;
    }

    @JsonProperty("Declination")
    public void setDeclination(String declination) {
        this.declination = declination;
    }

    @JsonProperty("DistFromSunParsec")
    public String getDistFromSunParsec() {
        return distFromSunParsec;
    }

    @JsonProperty("DistFromSunParsec")
    public void setDistFromSunParsec(String distFromSunParsec) {
        this.distFromSunParsec = distFromSunParsec;
    }

    @JsonProperty("HostStarMassSlrMass")
    public Double getHostStarMassSlrMass() {
        return hostStarMassSlrMass;
    }

    @JsonProperty("HostStarMassSlrMass")
    public void setHostStarMassSlrMass(Double hostStarMassSlrMass) {
        this.hostStarMassSlrMass = hostStarMassSlrMass;
    }

    @JsonProperty("HostStarRadiusSlrRad")
    public Double getHostStarRadiusSlrRad() {
        return hostStarRadiusSlrRad;
    }

    @JsonProperty("HostStarRadiusSlrRad")
    public void setHostStarRadiusSlrRad(Double hostStarRadiusSlrRad) {
        this.hostStarRadiusSlrRad = hostStarRadiusSlrRad;
    }

    @JsonProperty("HostStarMetallicity")
    public Double getHostStarMetallicity() {
        return hostStarMetallicity;
    }

    @JsonProperty("HostStarMetallicity")
    public void setHostStarMetallicity(Double hostStarMetallicity) {
        this.hostStarMetallicity = hostStarMetallicity;
    }

    @JsonProperty("HostStarTempK")
    public Integer getHostStarTempK() {
        return hostStarTempK;
    }

    @JsonProperty("HostStarTempK")
    public void setHostStarTempK(Integer hostStarTempK) {
        this.hostStarTempK = hostStarTempK;
    }

    @JsonProperty("HostStarAgeGyr")
    public String getHostStarAgeGyr() {
        return hostStarAgeGyr;
    }

    @JsonProperty("HostStarAgeGyr")
    public void setHostStarAgeGyr(String hostStarAgeGyr) {
        this.hostStarAgeGyr = hostStarAgeGyr;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}