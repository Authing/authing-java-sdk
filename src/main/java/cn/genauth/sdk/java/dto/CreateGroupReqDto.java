package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateGroupReqDto {
    /**
     * 分组类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * 分组描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 分组名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 分组 code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 自定义数据，传入的对象中的 key 必须先在用户池定义相关自定义字段
     */
    @JsonProperty("customData")
    private Object customData;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
    }



}