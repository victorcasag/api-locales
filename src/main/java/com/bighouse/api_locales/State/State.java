package com.bighouse.api_locales.State;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "states")
@Entity(name = "State")
public class State {
    @Id
    private Long id;
    private String name;
    private Long countryId;
    private String countryCode;
    private String countryName;
    private String stateCode;
    private String type;
    private float latitude;
    private float longitude;

    public State() {
    }

    public State(Long id, String name, Long countryId, String countryCode, String countryName, String stateCode, String type, float latitude, float longitude) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.stateCode = stateCode;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public String getStateCode() {
        return stateCode;
    }

    public String getType() {
        return type;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }
}
