package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.SetCustomDataDto;

public class SetCustomDataReqDto {
    /**
     * 自定义数据列表
     */
    @JsonProperty("list")
    private List<SetCustomDataDto> list;
    /**
     * 主体类型的唯一标志符。如果是用户则为用户 ID，角色为角色的 code，部门为部门的 ID
     */
    @JsonProperty("targetIdentifier")
    private String targetIdentifier;
    /**
     * 主体类型，目前支持用户、角色、分组和部门
     */
    @JsonProperty("targetType")
    private TargetType targetType;
    /**
     * 所属权限分组的 code，当 target_type 为角色的时候需要填写，否则可以忽略。
     */
    @JsonProperty("namespace")
    private String namespace;

    public List<SetCustomDataDto> getList() {
        return list;
    }
    public void setList(List<SetCustomDataDto> list) {
        this.list = list;
    }

    public String getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }


    /**
     * 主体类型，目前支持用户、角色、分组和部门
     */
    public static enum TargetType {

        @JsonProperty("USER")
        USER("USER"),

        @JsonProperty("ROLE")
        ROLE("ROLE"),

        @JsonProperty("GROUP")
        GROUP("GROUP"),

        @JsonProperty("DEPARTMENT")
        DEPARTMENT("DEPARTMENT"),
        ;

        private String value;

        TargetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}