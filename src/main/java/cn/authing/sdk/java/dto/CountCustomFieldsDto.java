package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CountCustomFieldsDto {
    /**
     * 记录总数
     */
    @JsonProperty("all")
    private Integer all;
    /**
     * 计数
     */
    @JsonProperty("userVisible")
    private Integer userVisible;
    /**
     * 计数
     */
    @JsonProperty("adminVisible")
    private Integer adminVisible;

    public Integer getAll() {
        return all;
    }
    public void setAll(Integer all) {
        this.all = all;
    }

    public Integer getUserVisible() {
        return userVisible;
    }
    public void setUserVisible(Integer userVisible) {
        this.userVisible = userVisible;
    }

    public Integer getAdminVisible() {
        return adminVisible;
    }
    public void setAdminVisible(Integer adminVisible) {
        this.adminVisible = adminVisible;
    }



}