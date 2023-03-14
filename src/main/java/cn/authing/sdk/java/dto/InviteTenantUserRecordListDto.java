package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.InviteTenantUserRecord;

public class InviteTenantUserRecordListDto {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 邀请用户历史记录
     */
    @JsonProperty("list")
    private List<InviteTenantUserRecord> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<InviteTenantUserRecord> getList() {
        return list;
    }
    public void setList(List<InviteTenantUserRecord> list) {
        this.list = list;
    }



}