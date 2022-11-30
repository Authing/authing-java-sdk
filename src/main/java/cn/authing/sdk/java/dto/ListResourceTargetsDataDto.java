package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ListResourceTargetsDto;

public class ListResourceTargetsDataDto {
    /**
     * 用户授权列表
     */
    @JsonProperty("authUserList")
    private List<ListResourceTargetsDto> authUserList;

    public List<ListResourceTargetsDto> getAuthUserList() {
        return authUserList;
    }
    public void setAuthUserList(List<ListResourceTargetsDto> authUserList) {
        this.authUserList = authUserList;
    }



}