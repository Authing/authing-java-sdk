package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RoleAuthorizedResourcePagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 数据
     */
    @JsonProperty("list")
    private List<RoleAuthorizedResourcesRespDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<RoleAuthorizedResourcesRespDto> getList() {
        return list;
    }
    public void setList(List<RoleAuthorizedResourcesRespDto> list) {
        this.list = list;
    }



}