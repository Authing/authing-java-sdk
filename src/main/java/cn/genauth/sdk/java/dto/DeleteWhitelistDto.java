package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteWhitelistDto {
    /**
     * 白名单类型
     */
    @JsonProperty("type")
    private Type type;
    /**
     * 类型参数
     */
    @JsonProperty("list")
    private List<String> list;

    public Type getType() {
        return type;
    }
    public void setType(Type type) {
        this.type = type;
    }

    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }


    /**
     * 白名单类型
     */
    public static enum Type {

        @JsonProperty("USERNAME")
        USERNAME("USERNAME"),

        @JsonProperty("EMAIL")
        EMAIL("EMAIL"),

        @JsonProperty("PHONE")
        PHONE("PHONE"),
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