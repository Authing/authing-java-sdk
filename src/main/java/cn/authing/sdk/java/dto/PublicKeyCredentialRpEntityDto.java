package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PublicKeyCredentialRpEntityDto {
    /**
     * 信赖方 domain
     */
    @JsonProperty("id")
    private String id;
    /**
     * 信赖方名称
     */
    @JsonProperty("name")
    private String name;

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



}