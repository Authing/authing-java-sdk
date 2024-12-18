package cn.genauth.sdk.java.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SignInFastpassDto {
    /**
     * 可选参数
     */
    @JsonProperty("options")
    private SignInFastpassOptionsDto options;

    public SignInFastpassOptionsDto getOptions() {
        return options;
    }
    public void setOptions(SignInFastpassOptionsDto options) {
        this.options = options;
    }



}