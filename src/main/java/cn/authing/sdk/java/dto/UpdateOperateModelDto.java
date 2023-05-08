package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateOperateModelDto {
    /**
     * id
     */
    @JsonProperty("id")
    private String id;
    /**
     * 是否展示
     */
    @JsonProperty("show")
    private Boolean show;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Boolean getShow() {
        return show;
    }
    public void setShow(Boolean show) {
        this.show = show;
    }



}