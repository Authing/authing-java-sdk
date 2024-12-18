package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ValidatePasswordResultDto {
    /**
     * 密码是否正确
     */
    @JsonProperty("valid")
    private Boolean valid;

    public Boolean getValid() {
        return valid;
    }
    public void setValid(Boolean valid) {
        this.valid = valid;
    }



}