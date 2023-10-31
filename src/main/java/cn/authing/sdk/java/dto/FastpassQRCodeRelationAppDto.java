package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class FastpassQRCodeRelationAppDto {
    /**
     * 应用 ID
     */
    @JsonProperty("id")
    private String id;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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