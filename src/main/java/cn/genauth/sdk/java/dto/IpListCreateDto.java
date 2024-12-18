package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IpListCreateDto {
    /**
     * 添加时间
     */
    @JsonProperty("expireAt")
    private String expireAt;
    /**
     * 限制类型，FORBID_LOGIN-禁止登录，FORBID_REGISTER-禁止注册，SKIP_MFA-跳过 MFA
     */
    @JsonProperty("limitList")
    private List<String> limitList;
    /**
     * 删除类型，MANUAL-手动，SCHEDULE-策略删除
     */
    @JsonProperty("removeType")
    private String removeType;
    /**
     * 添加类型，MANUAL-手动，SCHEDULE-策略添加
     */
    @JsonProperty("addType")
    private String addType;
    /**
     * ip类型，WHITE-白名单，BLACK-黑名单
     */
    @JsonProperty("ipType")
    private String ipType;
    /**
     * ip, 多个IP以逗号分割
     */
    @JsonProperty("ips")
    private String ips;

    public String getExpireAt() {
        return expireAt;
    }
    public void setExpireAt(String expireAt) {
        this.expireAt = expireAt;
    }

    public List<String> getLimitList() {
        return limitList;
    }
    public void setLimitList(List<String> limitList) {
        this.limitList = limitList;
    }

    public String getRemoveType() {
        return removeType;
    }
    public void setRemoveType(String removeType) {
        this.removeType = removeType;
    }

    public String getAddType() {
        return addType;
    }
    public void setAddType(String addType) {
        this.addType = addType;
    }

    public String getIpType() {
        return ipType;
    }
    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public String getIps() {
        return ips;
    }
    public void setIps(String ips) {
        this.ips = ips;
    }



}