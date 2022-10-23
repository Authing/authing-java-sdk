package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrderItem {
    /**
     * 订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 套餐包名中文
     */
    @JsonProperty("goodsName")
    private String goodsName;
    /**
     * 套餐包名英文
     */
    @JsonProperty("goodsNameEn")
    private String goodsNameEn;
    /**
     * 单价
     */
    @JsonProperty("goodsUnitPrice")
    private String goodsUnitPrice;
    /**
     * 数量
     */
    @JsonProperty("quantity")
    private String quantity;
    /**
     * 实际金额
     */
    @JsonProperty("actualAmount")
    private String actualAmount;
    /**
     * 订单状态
     */
    @JsonProperty("status")
    private String status;
    /**
     * 订单类型
     */
    @JsonProperty("orderType")
    private String orderType;
    /**
     * 创建时间
     */
    @JsonProperty("createTime")
    private String createTime;
    /**
     * Licence：license 订单，Offline：线下交易，Eadmin：后台开通，SelfHelp：自助下单，Cdkey：Cdkey 活动兑换
     */
    @JsonProperty("source")
    private String source;

    public String getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getGoodsName() {
        return goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsNameEn() {
        return goodsNameEn;
    }
    public void setGoodsNameEn(String goodsNameEn) {
        this.goodsNameEn = goodsNameEn;
    }

    public String getGoodsUnitPrice() {
        return goodsUnitPrice;
    }
    public void setGoodsUnitPrice(String goodsUnitPrice) {
        this.goodsUnitPrice = goodsUnitPrice;
    }

    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getActualAmount() {
        return actualAmount;
    }
    public void setActualAmount(String actualAmount) {
        this.actualAmount = actualAmount;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderType() {
        return orderType;
    }
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }



}