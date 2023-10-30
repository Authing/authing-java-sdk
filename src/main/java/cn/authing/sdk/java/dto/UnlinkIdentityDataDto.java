package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UnlinkIdentityDataDto {
    /**
     * 是否操作成功
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