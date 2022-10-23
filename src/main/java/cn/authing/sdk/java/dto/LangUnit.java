package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LangUnit {
    /**
     * 是否已开启。若开启，且控制台选择该语言，则展示该内容。（默认关闭）
     */
    @JsonProperty("enabled")
    private Boolean enabled;
    /**
     * 多语言内容
     */
    @JsonProperty("value")
    private String value;

    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }



}