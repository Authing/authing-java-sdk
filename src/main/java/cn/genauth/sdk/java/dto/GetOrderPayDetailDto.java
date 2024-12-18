package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetOrderPayDetailDto {
    /**
     * 订单号
     */
    @JsonProperty("orderNo")
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }



}