package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetCustomDataDto {
    /**
     * 字段 key，不能和内置字段的 key 冲突
     */
    @JsonProperty("key")
    private String key;
    /**
     * 自定义数据，可以为任意类型，但是必须和创建时定义的自定义字段类型匹配，否则将设置失败。
     */
    @JsonProperty("value")
    private String value;

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }



}