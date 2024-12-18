package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CostCurrentPackageInfo {
    /**
     * 套餐包编码
     */
    @JsonProperty("code")
    private String code;
    /**
     * 套餐结束时间
     */
    @JsonProperty("endTime")
    private String endTime;
    /**
     * 套餐逾期天数
     */
    @JsonProperty("overdueDays")
    private String overdueDays;
    /**
     * 套餐包信息
     */
    @JsonProperty("goodsPackage")
    private GoodsPackageDto goodsPackage;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getOverdueDays() {
        return overdueDays;
    }
    public void setOverdueDays(String overdueDays) {
        this.overdueDays = overdueDays;
    }

    public GoodsPackageDto getGoodsPackage() {
        return goodsPackage;
    }
    public void setGoodsPackage(GoodsPackageDto goodsPackage) {
        this.goodsPackage = goodsPackage;
    }



}