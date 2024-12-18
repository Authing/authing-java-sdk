package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetUserCustomDataDto {
    /**
     * 操作是否成功
     */
    @JsonProperty("success")
    private Boolean success;

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }



}