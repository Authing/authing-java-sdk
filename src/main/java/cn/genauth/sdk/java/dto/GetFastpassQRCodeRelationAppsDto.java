package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFastpassQRCodeRelationAppsDto {
    /**
     * 关联的客户端应用信息
     */
    @JsonProperty("relationApps")
    private List<FastpassQRCodeRelationAppDto> relationApps;

    public List<FastpassQRCodeRelationAppDto> getRelationApps() {
        return relationApps;
    }
    public void setRelationApps(List<FastpassQRCodeRelationAppDto> relationApps) {
        this.relationApps = relationApps;
    }



}