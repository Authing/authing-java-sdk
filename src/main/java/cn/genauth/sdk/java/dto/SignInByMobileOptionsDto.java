package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SignInByMobileOptionsDto {
    /**
     * 需要请求的权限，必须包含 openid。如果需要获取手机号和 email 需要包含 phone email；如果需要 refresh_token 需要包含 offline_access。多个 scope 请用空格分隔。id_token 解码后的内容中会包含这些 scope 对应的用户信息相关的字段。
     * - `openid`: 必须包含。
     * - `profile`: 返回 birthdate，family_name，gender，given_name，locale，middle_name，name，nickname，picture，preferred_username，profile，updated_at，website，zoneinfo 字段。
     * - `username`: 返回 username。
     * - `email`: 返回 email，email_verified。
     * - `phone`: 返回 phone_number, phone_number_verified。
     * - `offline_access`: 如果存在此参数，token 接口会返回 refresh_token 字段。
     * - `roles`: 返回用户的角色列表。
     * - `external_id`: 用户在原有系统的用户 ID。
     * - `extended_fields`: 返回用户的扩展字段信息，内容为一个对象，key 为扩展字段名，value 为扩展字段值。
     * - `tenant_id`: 返回用户的租户 ID。
     *
     */
    @JsonProperty("scope")
    private String scope;
    /**
     * 额外请求上下文，将会传递到认证前和认证后的 [Pipeline](https://docs.authing.cn/v2/guides/pipeline/) 的 `context` 对象中。了解[如何在 Pipeline 的 `context` 参数中获取传入的额外 context](https://docs.authing.cn/v2/guides/pipeline/context-object.html)。
     */
    @JsonProperty("context")
    private Object context;
    /**
     * 租户 ID
     */
    @JsonProperty("tenantId")
    private String tenantId;
    /**
     * 设置额外的用户自定义数据，你需要先在 Authing 控制台[配置自定义数据](https://docs.authing.cn/v2/guides/users/user-defined-field/)。
     */
    @JsonProperty("customData")
    private Object customData;

    public String getScope() {
        return scope;
    }
    public void setScope(String scope) {
        this.scope = scope;
    }

    public Object getContext() {
        return context;
    }
    public void setContext(Object context) {
        this.context = context;
    }

    public String getTenantId() {
        return tenantId;
    }
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Object getCustomData() {
        return customData;
    }
    public void setCustomData(Object customData) {
        this.customData = customData;
    }



}