package com.bighouse.api_locales.City;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "cities")
@Entity(name = "City")
public class City {
    @Id
    private Long id;
    private String name;
    private Long stateId;
    private String stateCode;
    private String stateName;
    private Long countryId;
    private String countryCode;
    private String countryName;
    private float latitude;
    private float longitude;
    private String wikiDataId;

    public City() {
    }

    public City(Long id, String name, Long stateId, String stateCode, String stateName, Long countryId, String countryCode, String countryName, float latitude, float longitude, String wikiDataId) {
        this.id = id;
        this.name = name;
        this.stateId = stateId;
        this.stateCode = stateCode;
        this.stateName = stateName;
        this.countryId = countryId;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.wikiDataId = wikiDataId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getStateId() {
        return stateId;
    }

    public String getStateCode() {
        return stateCode;
    }

    public String getStateName() {
        return stateName;
    }

    public Long getCountryId() {
        return countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getWikiDataId() {
        return wikiDataId;
    }
}
