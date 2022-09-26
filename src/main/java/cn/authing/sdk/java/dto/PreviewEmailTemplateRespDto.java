package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.PreviewEmailTemplateDataDto;

public class PreviewEmailTemplateRespDto {
    /**
     * 响应数据
     */
    @JsonProperty("data")
    private PreviewEmailTemplateDataDto data;

    public PreviewEmailTemplateDataDto getData() {
        return data;
    }
    public void setData(PreviewEmailTemplateDataDto data) {
        this.data = data;
    }



}