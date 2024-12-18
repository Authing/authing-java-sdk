package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SubjectDto {
    /**
     * 主体 ID ，包含用户 ID、用户组 ID、角色 ID、组织机构 ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 主体类型,包括 USER、GROUP、ROLE、ORG 四种类型
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 主体名称，包含用户名称、用户组名称、角色名称、组织机构名称
     */
    @JsonProperty("name")
    private String name;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    /**
     * 主体类型,包括 USER、GROUP、ROLE、ORG 四种类型
     */
    public static enum Type {

        @JsonProperty("USER")
        USER("USER"),

        @JsonProperty("ORG")
        ORG("ORG"),

        @JsonProperty("GROUP")
        GROUP("GROUP"),

        @JsonProperty("ROLE")
        ROLE("ROLE"),
        ;

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}