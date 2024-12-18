package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

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