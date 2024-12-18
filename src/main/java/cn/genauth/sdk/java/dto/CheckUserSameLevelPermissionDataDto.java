package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckUserSameLevelPermissionDataDto {
    /**
     * 响应结果列表
     */
    @JsonProperty("checkLevelResultList")
    private List<CheckUserSameLevelPermissionRespDto> checkLevelResultList;

    public List<CheckUserSameLevelPermissionRespDto> getCheckLevelResultList() {
        return checkLevelResultList;
    }
    public void setCheckLevelResultList(List<CheckUserSameLevelPermissionRespDto> checkLevelResultList) {
        this.checkLevelResultList = checkLevelResultList;
    }



}