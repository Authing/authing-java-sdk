package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckPermissionDataDto {
    /**
     * 检查结果列表
     */
    @JsonProperty("checkResultList")
    private List<CheckPermissionsRespDto> checkResultList;

    public List<CheckPermissionsRespDto> getCheckResultList() {
        return checkResultList;
    }
    public void setCheckResultList(List<CheckPermissionsRespDto> checkResultList) {
        this.checkResultList = checkResultList;
    }



}