package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GeoIpLocation {
    /**
     * 经度
     */
    @JsonProperty("lon")
    private Integer lon;
    /**
     * 纬度
     */
    @JsonProperty("lat")
    private Integer lat;

    public Integer getLon() {
        return lon;
    }
    public void setLon(Integer lon) {
        this.lon = lon;
    }

    public Integer getLat() {
        return lat;
    }
    public void setLat(Integer lat) {
        this.lat = lat;
    }



}