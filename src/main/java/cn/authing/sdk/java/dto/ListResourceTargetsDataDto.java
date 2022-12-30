package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ListResourceTargetsDtoResp;

public class ListResourceTargetsDataDto {
    /**
     * 用户授权列表
     */
    @JsonProperty("authUserList")
    private List<ListResourceTargetsDtoResp> authUserList;

    public List<ListResourceTargetsDtoResp> getAuthUserList() {
        return authUserList;
    }
    public void setAuthUserList(List<ListResourceTargetsDtoResp> authUserList) {
        this.authUserList = authUserList;
    }



}