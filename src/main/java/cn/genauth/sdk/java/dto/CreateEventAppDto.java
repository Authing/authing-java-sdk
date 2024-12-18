package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateEventAppDto {
    /**
     * 应用 logo
     */
    @JsonProperty("logo")
    private String logo;
    /**
     * 应用名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 应用唯一标志
     */
    @JsonProperty("identifier")
    private String identifier;

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }



}