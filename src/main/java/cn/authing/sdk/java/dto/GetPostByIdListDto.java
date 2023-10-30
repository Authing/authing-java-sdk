package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetPostByIdListDto {
    /**
     * 部门 id 列表
     */
    @JsonProperty("idList")
    private String idList;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;

    public String getIdList() {
        return idList;
    }
    public void setIdList(String idList) {
        this.idList = idList;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }



}