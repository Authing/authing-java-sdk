package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CurrentUsageDto {
    /**
     * 权益总量
     */
    @JsonProperty("amount")
    private String amount;
    /**
     * 权益当前使用量
     */
    @JsonProperty("current")
    private String current;
    /**
     * 是否是体验期权益
     */
    @JsonProperty("experience")
    private Boolean experience;
    /**
     * 权益编码
     */
    @JsonProperty("modelCode")
    private String modelCode;
    /**
     * 权益名称
     */
    @JsonProperty("modelName")
    private String modelName;

    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrent() {
        return current;
    }
    public void setCurrent(String current) {
        this.current = current;
    }

    public Boolean getExperience() {
        return experience;
    }
    public void setExperience(Boolean experience) {
        this.experience = experience;
    }

    public String getModelCode() {
        return modelCode;
    }
    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }



}