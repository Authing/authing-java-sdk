package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class WebhookEventDto {
    /**
     * Webhook 名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * Webhook 英文名称
     */
    @JsonProperty("nameEn")
    private String nameEn;
    /**
     * Webhook 事件
     */
    @JsonProperty("value")
    private String value;
    /**
     * Webhook 事件分类
     */
    @JsonProperty("category")
    private String category;

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

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }



}