package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EventAppDto {
    /**
     * 唯一标识
     */
    @JsonProperty("identifier")
    private String identifier;
    /**
     * 应用名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 应用 logo
     */
    @JsonProperty("logo")
    private String logo;

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }



}