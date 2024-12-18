package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListWebAuthnAuthenticatorDeviceDataDto {
    /**
     * 总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 记录条数
     */
    @JsonProperty("list")
    private List<Object> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<Object> getList() {
        return list;
    }
    public void setList(List<Object> list) {
        this.list = list;
    }



}