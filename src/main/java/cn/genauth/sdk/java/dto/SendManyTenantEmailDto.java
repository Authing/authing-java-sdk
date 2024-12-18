package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SendManyTenantEmailDto {
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
     * 需要邮件通知的管理员
     */
    @JsonProperty("users")
    private List<SendTenantEmailDto> users;

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

    public List<SendTenantEmailDto> getUsers() {
        return users;
    }
    public void setUsers(List<SendTenantEmailDto> users) {
        this.users = users;
    }



}