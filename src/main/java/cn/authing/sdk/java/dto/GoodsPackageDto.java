package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GoodsPackageDto {
    /**
     * 套餐包名称 name
     */
    @JsonProperty("name")
    private String name;
    /**
     * 套餐包名称 nameEn
     */
    @JsonProperty("nameEn")
    private String nameEn;
    /**
     * 套餐包单价
     */
    @JsonProperty("unitPrice")
    private String unitPrice;
    /**
     * 套餐包编码 code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 套餐包版本
     */
    @JsonProperty("group")
    private String group;
    /**
     * 套餐包场景编码
     */
    @JsonProperty("sceneCode")
    private String sceneCode;
    /**
     * 套餐包 MAU 数量
     */
    @JsonProperty("amount")
    private String amount;

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

    public String getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public String getSceneCode() {
        return sceneCode;
    }
    public void setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
    }

    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }



}