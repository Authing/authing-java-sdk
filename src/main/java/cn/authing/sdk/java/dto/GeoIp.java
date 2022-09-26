package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.GeoIpLocation;

public class GeoIp {
    /**
     * 地理位置
     */
    @JsonProperty("location")
    private GeoIpLocation location;
    /**
     * Country Name
     */
    @JsonProperty("country_name")
    private String countryName;
    /**
     * Country Code 2
     */
    @JsonProperty("country_code2")
    private String countryCode2;
    /**
     * Country Code 3
     */
    @JsonProperty("country_code3")
    private String countryCode3;
    /**
     * Region Name
     */
    @JsonProperty("region_name")
    private String regionName;
    /**
     * Region Code
     */
    @JsonProperty("region_code")
    private String regionCode;
    /**
     * 城市名称
     */
    @JsonProperty("city_name")
    private String cityName;
    /**
     * Continent Code
     */
    @JsonProperty("continent_code")
    private String continentCode;
    /**
     * 时区
     */
    @JsonProperty("timezone")
    private String timezone;

    public GeoIpLocation getLocation() {
        return location;
    }
    public void setLocation(GeoIpLocation location) {
        this.location = location;
    }

    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode2() {
        return countryCode2;
    }
    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }
    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

    public String getRegionName() {
        return regionName;
    }
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionCode() {
        return regionCode;
    }
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getContinentCode() {
        return continentCode;
    }
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }



}