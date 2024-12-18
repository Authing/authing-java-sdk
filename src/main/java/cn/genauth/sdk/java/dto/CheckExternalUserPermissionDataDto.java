package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckExternalUserPermissionDataDto {
    /**
     * 检查结果列表
     */
    @JsonProperty("checkResultList")
    private List<CheckExternalUserPermissionsRespDto> checkResultList;

    public List<CheckExternalUserPermissionsRespDto> getCheckResultList() {
        return checkResultList;
    }
    public void setCheckResultList(List<CheckExternalUserPermissionsRespDto> checkResultList) {
        this.checkResultList = checkResultList;
    }



}