package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CheckUserSameLevelPermissionDataDto;

public class CheckUserSameLevelPermissionResponseDto {
    /**
     * 响应数据
     */
    @JsonProperty("data")
    private CheckUserSameLevelPermissionDataDto data;

    public CheckUserSameLevelPermissionDataDto getData() {
        return data;
    }
    public void setData(CheckUserSameLevelPermissionDataDto data) {
        this.data = data;
    }



}