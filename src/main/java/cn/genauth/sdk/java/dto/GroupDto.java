package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupDto {
    /**
     * 分组 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 分组 code
     */
    @JsonProperty("code")
    private String code;
    /**
     * 分组名称
     */
    @JsonProperty("name")
    private String name;
    /**
     * 分组描述
     */
    @JsonProperty("description")
    private String description;
    /**
     * 分组类型
     */
    @JsonProperty("type")
    private String type;
    /**
     * 分组元数据信息
     */
    @JsonProperty("metadataSource")
    private List<String> metadataSource;
    /**
     * 成员列表
     */
    @JsonProperty("members")
    private List<UserDto> members;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public List<String> getMetadataSource() {
        return metadataSource;
    }
    public void setMetadataSource(List<String> metadataSource) {
        this.metadataSource = metadataSource;
    }

    public List<UserDto> getMembers() {
        return members;
    }
    public void setMembers(List<UserDto> members) {
        this.members = members;
    }



}