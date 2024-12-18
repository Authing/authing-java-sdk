package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAuthorizedTargetDataDto {
    /**
     * 总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 元素列表
     */
    @JsonProperty("list")
    private List<ResourcePermissionAssignmentDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ResourcePermissionAssignmentDto> getList() {
        return list;
    }
    public void setList(List<ResourcePermissionAssignmentDto> list) {
        this.list = list;
    }



}