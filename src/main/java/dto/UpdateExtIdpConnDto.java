package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class UpdateExtIdpConnDto {
    /**
     * 身份源连接自定义参数（增量修改）
     */
    @JsonProperty("getFields")
    private Object fields;
    /**
     * 身份源连接显示名称
     */
    @JsonProperty("getDisplayName")
    private String displayName;
    /**
     * 身份源连接 ID
     */
    @JsonProperty("getId")
    private String id;
    /**
     * 身份源连接的图标
     */
    @JsonProperty("getLogo")
    private String logo;
    /**
     * 是否只支持登录
     */
    @JsonProperty("getLoginOnly")
    private Boolean loginOnly;

    public Object getFields() {
        return fields;
    }
    public void setFields(Object fields) {
        this.fields = fields;
    }

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getLoginOnly() {
        return loginOnly;
    }
    public void setLoginOnly(Boolean loginOnly) {
        this.loginOnly = loginOnly;
    }

}