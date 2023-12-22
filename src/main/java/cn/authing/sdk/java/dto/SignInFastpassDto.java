package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SignInFastpassOptionsDto;

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