package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IpListRespDto {
    /**
     * ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * ip
     */
    @JsonProperty("ip")
    private String ip;
    /**
     * ip类型，WHITE-白名单，BLACK-黑名单
     */
    @JsonProperty("ipType")
    private String ipType;
    /**
     * 添加类型，MANUAL-手动，SCHEDULE-策略添加
     */
    @JsonProperty("addType")
    private String addType;
    /**
     * 删除类型，MANUAL-手动，SCHEDULE-策略删除
     */
    @JsonProperty("removeType")
    private String removeType;
    /**
     * 限制类型，FORBID_LOGIN-禁止登录，FORBID_REGISTER-禁止注册，SKIP_MFA-跳过 MFA
     */
    @JsonProperty("limitList")
    private List<String> limitList;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpType() {
        return ipType;
    }
    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public String getAddType() {
        return addType;
    }
    public void setAddType(String addType) {
        this.addType = addType;
    }

    public String getRemoveType() {
        return removeType;
    }
    public void setRemoveType(String removeType) {
        this.removeType = removeType;
    }

    public List<String> getLimitList() {
        return limitList;
    }
    public void setLimitList(List<String> limitList) {
        this.limitList = limitList;
    }



}