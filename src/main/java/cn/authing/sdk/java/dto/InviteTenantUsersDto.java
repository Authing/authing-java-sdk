package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.errorEmailMsg;
import cn.authing.sdk.java.dto.InviteTenantUserRecord;

public class InviteTenantUsersDto {
    /**
     * 错误的邮箱提示
     */
    @JsonProperty("errMsgs")
    private List<errorEmailMsg> errMsgs;
    /**
     * 邀请用户信息返回值
     */
    @JsonProperty("list")
    private List<InviteTenantUserRecord> list;

    public List<errorEmailMsg> getErrMsgs() {
        return errMsgs;
    }
    public void setErrMsgs(List<errorEmailMsg> errMsgs) {
        this.errMsgs = errMsgs;
    }

    public List<InviteTenantUserRecord> getList() {
        return list;
    }
    public void setList(List<InviteTenantUserRecord> list) {
        this.list = list;
    }



}