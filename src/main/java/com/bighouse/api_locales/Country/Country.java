package com.bighouse.api_locales.Country;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "countries")
@Entity(name = "Country")
public class Country {
    @Id
    private int id;
    private String name;
    private String iso3;
    private String iso2;
    private int numericCode;
    private int phoneCode;
    private String capital;
    private String currency;
    private String currencyName;
    private String currencySymbol;
    private String tld;
    private String nativeName;
    private String region;
    private Long regionId;
    private String subregion;
    private Long subregionId;
    private String nationality;
    private String[] timezones;
    private float latitude;
    private float longitude;
    private String emoji;
    private String emojiU;

    public Country(int id, String name, String iso3, String iso2, int numericCode, int phoneCode, String capital, String currency, String currencyName, String currencySymbol, String tld, String nativeName, String region, Long regionId, String subregion, Long subregionId, String nationality, String[] timezones, float latitude, float longitude, String emoji, String emojiU) {
        this.id = id;
        this.name = name;
        this.iso3 = iso3;
        this.iso2 = iso2;
        this.numericCode = numericCode;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.currency = currency;
        this.currencyName = currencyName;
        this.currencySymbol = currencySymbol;
        this.tld = tld;
        this.nativeName = nativeName;
        this.region = region;
        this.regionId = regionId;
        this.subregion = subregion;
        this.subregionId = subregionId;
        this.nationality = nationality;
        this.timezones = timezones;
        this.latitude = latitude;
        this.longitude = longitude;
        this.emoji = emoji;
        this.emojiU = emojiU;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIso3() {
        return iso3;
    }

    public String getIso2() {
        return iso2;
    }

    public int getNumericCode() {
        return numericCode;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public String getTld() {
        return tld;
    }

    public String getNativeName() {
        return nativeName;
    }

    public String getRegion() {
        return region;
    }

    public Long getRegionId() {
        return regionId;
    }

    public String getSubregion() {
        return subregion;
    }

    public Long getSubregionId() {
        return subregionId;
    }

    public String getNationality() {
        return nationality;
    }

    public String[] getTimezones() {
        return timezones;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getEmojiU() {
        return emojiU;
    }
}
