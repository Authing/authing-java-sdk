package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CostGetOrderPayDetail {
    /**
     * 订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;
    /**
     * 渠道订单号
     */
    @JsonProperty("channelOrderNo")
    private String channelOrderNo;
    /**
     * 渠道订单号
     */
    @JsonProperty("paidAmount")
    private String paidAmount;
    /**
     * 支付时间
     */
    @JsonProperty("paidTime")
    private String paidTime;
    /**
     * 支付账号
     */
    @JsonProperty("paidAccountNo")
    private String paidAccountNo;
    /**
     * 支付状态
     */
    @JsonProperty("payStatus")
    private String payStatus;
    /**
     * 创建时间
     */
    @JsonProperty("createTime")
    private String createTime;
    /**
     * 支付方式
     */
    @JsonProperty("payType")
    private String payType;

    public String getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getChannelOrderNo() {
        return channelOrderNo;
    }
    public void setChannelOrderNo(String channelOrderNo) {
        this.channelOrderNo = channelOrderNo;
    }

    public String getPaidAmount() {
        return paidAmount;
    }
    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPaidTime() {
        return paidTime;
    }
    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime;
    }

    public String getPaidAccountNo() {
        return paidAccountNo;
    }
    public void setPaidAccountNo(String paidAccountNo) {
        this.paidAccountNo = paidAccountNo;
    }

    public String getPayStatus() {
        return payStatus;
    }
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPayType() {
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }



}