package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CostGetOrderPayDetailRespDto {
    /**
     * 业务状态码，可以通过此状态码判断操作是否成功，200 表示成功。
     */
    @JsonProperty("statusCode")
    private Integer statusCode;
    /**
     * 描述信息
     */
    @JsonProperty("message")
    private String message;
    /**
     * 细分错误码，可通过此错误码得到具体的错误类型。
     */
    @JsonProperty("apiCode")
    private Integer apiCode;
    /**
     * 请求 ID。当请求失败时会返回。
     */
    @JsonProperty("requestId")
    private String requestId;
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

    public Integer getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getApiCode() {
        return apiCode;
    }
    public void setApiCode(Integer apiCode) {
        this.apiCode = apiCode;
    }

    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

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