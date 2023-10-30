package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RiskListItemDto {
    /**
     * ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * userId
     */
    @JsonProperty("userId")
    private String userId;
    /**
     * 添加类型，MANUAL-手动，SCHEDULE-策略添加
     */
    @JsonProperty("addType")
    private String addType;
    /**
     * ip类型，WHITE-白名单，BLACK-黑名单
     */
    @JsonProperty("userListType")
    private String userListType;
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
    /**
     * 添加时间
     */
    @JsonProperty("addAt")
    private String addAt;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddType() {
        return addType;
    }
    public void setAddType(String addType) {
        this.addType = addType;
    }

    public String getUserListType() {
        return userListType;
    }
    public void setUserListType(String userListType) {
        this.userListType = userListType;
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

    public String getAddAt() {
        return addAt;
    }
    public void setAddAt(String addAt) {
        this.addAt = addAt;
    }



}