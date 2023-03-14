package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPostByIdListDto {
    /**
     * 部门 id 列表
     */
    @JsonProperty("idList")
    private String idList;

    public String getIdList() {
        return idList;
    }
    public void setIdList(String idList) {
        this.idList = idList;
    }



}