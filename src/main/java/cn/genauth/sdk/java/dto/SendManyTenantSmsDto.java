package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SendManyTenantSmsDto {
    /**
     * 管理员名
     */
    @JsonProperty("adminName")
    private String adminName;
    /**
     * 导入 id
     */
    @JsonProperty("importId")
    private Integer importId;
    /**
     * 需要短信通知的管理员
     */
    @JsonProperty("users")
    private List<SendTenantSmsDto> users;

    public String getAdminName() {
        return adminName;
    }
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Integer getImportId() {
        return importId;
    }
    public void setImportId(Integer importId) {
        this.importId = importId;
    }

    public List<SendTenantSmsDto> getUsers() {
        return users;
    }
    public void setUsers(List<SendTenantSmsDto> users) {
        this.users = users;
    }



}