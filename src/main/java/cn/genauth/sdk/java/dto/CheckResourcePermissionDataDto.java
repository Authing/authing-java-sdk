package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CheckResourcePermissionDataDto {
    /**
     * 检查结果列表
     */
    @JsonProperty("checkResultList")
    private List<CheckResourcePermissionRespDto> checkResultList;

    public List<CheckResourcePermissionRespDto> getCheckResultList() {
        return checkResultList;
    }
    public void setCheckResultList(List<CheckResourcePermissionRespDto> checkResultList) {
        this.checkResultList = checkResultList;
    }



}