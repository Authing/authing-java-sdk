package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminAuditLogRespData {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 返回列表
     */
    @JsonProperty("list")
    private List<AdminAuditLogDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<AdminAuditLogDto> getList() {
        return list;
    }
    public void setList(List<AdminAuditLogDto> list) {
        this.list = list;
    }



}