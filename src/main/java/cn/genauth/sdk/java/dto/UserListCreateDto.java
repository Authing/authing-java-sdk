package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserListCreateDto {
    /**
     * 过期时间
     */
    @JsonProperty("expireAt")
    private Integer expireAt;
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
     * 用户名单类型，WHITE-白名单，BLACK-黑名单
     */
    @JsonProperty("userListType")
    private String userListType;
    /**
     * userId, 多个 userId 以逗号分割
     */
    @JsonProperty("userIds")
    private List<String> userIds;

    public Integer getExpireAt() {
        return expireAt;
    }
    public void setExpireAt(Integer expireAt) {
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

    public String getUserListType() {
        return userListType;
    }
    public void setUserListType(String userListType) {
        this.userListType = userListType;
    }

    public List<String> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }



}