package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetOrdersRes {
    /**
     * 总数
     */
    @JsonProperty("totalCount")
    private String totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("list")
    private List<OrderItem> list;

    public String getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount;
    }

    public List<OrderItem> getList() {
        return list;
    }
    public void setList(List<OrderItem> list) {
        this.list = list;
    }



}