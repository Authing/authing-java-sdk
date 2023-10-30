package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Expand {
    /**
     * 关联的字段 key
     */
    @JsonProperty("field")
    private String field;
    /**
     * 展开哪些关联字段
     */
    @JsonProperty("select")
    private List<String> select;

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public List<String> getSelect() {
        return select;
    }
    public void setSelect(List<String> select) {
        this.select = select;
    }



}