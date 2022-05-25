package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetCustomFieldsDto {
    /**
     * 主体类型，目前支持用户、角色、分组和部门
     */
    @JsonProperty("target_type")
    private String targetType;

    public String getTargetType() {
        return targetType;
    }
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }



}