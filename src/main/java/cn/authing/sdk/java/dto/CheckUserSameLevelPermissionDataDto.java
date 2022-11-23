package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.CheckUserSameLevelPermissionDto;

public class CheckUserSameLevelPermissionDataDto {
    /**
     * 响应结果列表
     */
    @JsonProperty("checkLevelResultList")
    private List<CheckUserSameLevelPermissionDto> checkLevelResultList;

    public List<CheckUserSameLevelPermissionDto> getCheckLevelResultList() {
        return checkLevelResultList;
    }
    public void setCheckLevelResultList(List<CheckUserSameLevelPermissionDto> checkLevelResultList) {
        this.checkLevelResultList = checkLevelResultList;
    }



}