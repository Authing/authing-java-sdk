package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WebhookCategoryDto {
    /**
     * Webhook 类型名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * Webhook 类型英文名称
     */
    @JsonProperty("nameEn")
    private String nameEn;
    /**
     * Webhook 类型
     */
    @JsonProperty("value")
    private String value;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }



}