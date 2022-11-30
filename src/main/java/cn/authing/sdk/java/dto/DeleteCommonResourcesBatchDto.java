package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteCommonResourcesBatchDto {
    /**
     * 资源 id 列表
     */
    @JsonProperty("ids")
    private List<String> ids;

    public List<String> getIds() {
        return ids;
    }
    public void setIds(List<String> ids) {
        this.ids = ids;
    }



}