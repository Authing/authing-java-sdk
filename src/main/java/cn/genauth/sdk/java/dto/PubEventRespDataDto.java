package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PubEventRespDataDto {
    /**
     * 发送是否成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * 发送失败的错误提示
     */
    @JsonProperty("errMsg")
    private Boolean errMsg;

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(Boolean errMsg) {
        this.errMsg = errMsg;
    }



}