package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class IsUserExistsDto {
    /**
     * 用户是否存在
     */
    @JsonProperty("exists")
    private Boolean exists;

    public Boolean getExists() {
        return exists;
    }
    public void setExists(Boolean exists) {
        this.exists = exists;
    }



}