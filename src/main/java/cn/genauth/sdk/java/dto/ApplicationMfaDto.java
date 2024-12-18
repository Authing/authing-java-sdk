package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationMfaDto {
    /**
     * MFA 类型
     */
    @JsonProperty("mfaPolicy")
    private String mfaPolicy;
    /**
     * MFA 状态
     */
    @JsonProperty("status")
    private Integer status;
    /**
     * MFA 排序
     */
    @JsonProperty("sort")
    private Integer sort;

    public String getMfaPolicy() {
        return mfaPolicy;
    }
    public void setMfaPolicy(String mfaPolicy) {
        this.mfaPolicy = mfaPolicy;
    }

    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }
    public void setSort(Integer sort) {
        this.sort = sort;
    }



}