package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.GeoIp;
import cn.authing.sdk.java.dto.ParsedUserAgent;

public class AdminAuditLogDto {
    /**
     * 管理员的用户 ID
     */
    @JsonProperty("adminUserId")
    private String adminUserId;
    /**
     * 管理员用户头像
     */
    @JsonProperty("adminUserAvatar")
    private String adminUserAvatar;
    /**
     * 管理员用户显示名称，按照以下用户字段顺序进行展示：nickname > username > name > givenName > familyName -> email -> phone -> id
     */
    @JsonProperty("adminUserDisplayName")
    private String adminUserDisplayName;
    /**
     * 客户端 IP，可根据登录时的客户端 IP 进行筛选。默认不传获取所有登录 IP 的登录历史。
     */
    @JsonProperty("clientIp")
    private String clientIp;
    /**
     * 操作类型：
     * - `create`: 创建
     * - `delete`: 删除
     * - `import`: 导入
     * - `export`: 导出
     * - `update`: 修改
     * - `refresh`: 刷新
     * - `sync`: 同步
     * - `invite`: 邀请
     * - `resign`: 离职
     * - `recover`: 恢复
     * - `disable`: 禁用
     * - `userEnable`: 启用
     *
     */
    @JsonProperty("operationType")
    private OperationType operationType;
    /**
     * 事件类型：
     * - `user`: 用户
     * - `userpool`: 用户池
     * - `tenant`: 租户
     * - `userLoginState`: 用户登录态
     * - `userAccountState`: 用户账号状态
     * - `userGroup`: 用户分组
     * - `fieldEncryptState`: 字段加密状态
     * - `syncTask`: 同步任务
     * - `socialConnection`: 社会化身份源
     * - `enterpriseConnection`: 社会化身份源
     * - `customDatabase`: 自定义数据库
     * - `org`: 组织机构
     * - `cooperator`: 协作管理员
     * - `application`: 应用
     * - `resourceNamespace`: 权限分组
     * - `resource`: 资源
     * - `role`: 角色
     * - `roleAssign`: 角色授权
     * - `policy`: 策略
     *
     */
    @JsonProperty("resourceType")
    private ResourceType resourceType;
    /**
     * 事件详情
     */
    @JsonProperty("eventDetail")
    private String eventDetail;
    /**
     * 具体的操作参数
     */
    @JsonProperty("operationParam")
    private String operationParam;
    /**
     * 原始值
     */
    @JsonProperty("originValue")
    private String originValue;
    /**
     * 新值
     */
    @JsonProperty("targetValue")
    private String targetValue;
    /**
     * 是否成功
     */
    @JsonProperty("success")
    private Boolean success;
    /**
     * User Agent
     */
    @JsonProperty("userAgent")
    private String userAgent;
    /**
     * 解析过后的 User Agent
     */
    @JsonProperty("parsedUserAgent")
    private ParsedUserAgent parsedUserAgent;
    /**
     * 地理位置
     */
    @JsonProperty("geoip")
    private GeoIp geoip;
    /**
     * 时间
     */
    @JsonProperty("timestamp")
    private String timestamp;
    /**
     * 请求 ID
     */
    @JsonProperty("requestId")
    private String requestId;

    public String getAdminUserId() {
        return adminUserId;
    }
    public void setAdminUserId(String adminUserId) {
        this.adminUserId = adminUserId;
    }

    public String getAdminUserAvatar() {
        return adminUserAvatar;
    }
    public void setAdminUserAvatar(String adminUserAvatar) {
        this.adminUserAvatar = adminUserAvatar;
    }

    public String getAdminUserDisplayName() {
        return adminUserDisplayName;
    }
    public void setAdminUserDisplayName(String adminUserDisplayName) {
        this.adminUserDisplayName = adminUserDisplayName;
    }

    public String getClientIp() {
        return clientIp;
    }
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public OperationType getOperationType() {
        return operationType;
    }
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }
    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public String getEventDetail() {
        return eventDetail;
    }
    public void setEventDetail(String eventDetail) {
        this.eventDetail = eventDetail;
    }

    public String getOperationParam() {
        return operationParam;
    }
    public void setOperationParam(String operationParam) {
        this.operationParam = operationParam;
    }

    public String getOriginValue() {
        return originValue;
    }
    public void setOriginValue(String originValue) {
        this.originValue = originValue;
    }

    public String getTargetValue() {
        return targetValue;
    }
    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getUserAgent() {
        return userAgent;
    }
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public ParsedUserAgent getParsedUserAgent() {
        return parsedUserAgent;
    }
    public void setParsedUserAgent(ParsedUserAgent parsedUserAgent) {
        this.parsedUserAgent = parsedUserAgent;
    }

    public GeoIp getGeoip() {
        return geoip;
    }
    public void setGeoip(GeoIp geoip) {
        this.geoip = geoip;
    }

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }


    /**
     * 操作类型：
     * - `create`: 创建
     * - `delete`: 删除
     * - `import`: 导入
     * - `export`: 导出
     * - `update`: 修改
     * - `refresh`: 刷新
     * - `sync`: 同步
     * - `invite`: 邀请
     * - `resign`: 离职
     * - `recover`: 恢复
     * - `disable`: 禁用
     * - `userEnable`: 启用
     *
     */
    public static enum OperationType {

        @JsonProperty("all")
        ALL("all"),

        @JsonProperty("create")
        CREATE("create"),

        @JsonProperty("delete")
        DELETE("delete"),

        @JsonProperty("import")
        IMPORT("import"),

        @JsonProperty("export")
        EXPORT("export"),

        @JsonProperty("update")
        UPDATE("update"),

        @JsonProperty("refresh")
        REFRESH("refresh"),

        @JsonProperty("sync")
        SYNC("sync"),

        @JsonProperty("invite")
        INVITE("invite"),

        @JsonProperty("resign")
        RESIGN("resign"),

        @JsonProperty("recover")
        RECOVER("recover"),

        @JsonProperty("disable")
        DISABLE("disable"),

        @JsonProperty("enable")
        ENABLE("enable"),

        @JsonProperty("activate")
        ACTIVATE("activate"),

        @JsonProperty("deactivate")
        DEACTIVATE("deactivate"),

        @JsonProperty("add")
        ADD("add"),

        @JsonProperty("remove")
        REMOVE("remove"),

        @JsonProperty("query")
        QUERY("query"),
        ;

        private String value;

        OperationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 事件类型：
     * - `user`: 用户
     * - `userpool`: 用户池
     * - `tenant`: 租户
     * - `userLoginState`: 用户登录态
     * - `userAccountState`: 用户账号状态
     * - `userGroup`: 用户分组
     * - `fieldEncryptState`: 字段加密状态
     * - `syncTask`: 同步任务
     * - `socialConnection`: 社会化身份源
     * - `enterpriseConnection`: 社会化身份源
     * - `customDatabase`: 自定义数据库
     * - `org`: 组织机构
     * - `cooperator`: 协作管理员
     * - `application`: 应用
     * - `resourceNamespace`: 权限分组
     * - `resource`: 资源
     * - `role`: 角色
     * - `roleAssign`: 角色授权
     * - `policy`: 策略
     *
     */
    public static enum ResourceType {

        @JsonProperty("all")
        ALL("all"),

        @JsonProperty("user")
        USER("user"),

        @JsonProperty("userpool")
        USERPOOL("userpool"),

        @JsonProperty("tenant")
        TENANT("tenant"),

        @JsonProperty("userLoginState")
        USER_LOGIN_STATE("userLoginState"),

        @JsonProperty("userAccountState")
        USER_ACCOUNT_STATE("userAccountState"),

        @JsonProperty("userGroup")
        USER_GROUP("userGroup"),

        @JsonProperty("fieldEncryptState")
        FIELD_ENCRYPT_STATE("fieldEncryptState"),

        @JsonProperty("syncTask")
        SYNC_TASK("syncTask"),

        @JsonProperty("socialConnection")
        SOCIAL_CONNECTION("socialConnection"),

        @JsonProperty("enterpriseConnection")
        ENTERPRISE_CONNECTION("enterpriseConnection"),

        @JsonProperty("customDatabase")
        CUSTOM_DATABASE("customDatabase"),

        @JsonProperty("org")
        ORG("org"),

        @JsonProperty("cooperator")
        COOPERATOR("cooperator"),

        @JsonProperty("application")
        APPLICATION("application"),

        @JsonProperty("resourceNamespace")
        RESOURCE_NAMESPACE("resourceNamespace"),

        @JsonProperty("resource")
        RESOURCE("resource"),

        @JsonProperty("role")
        ROLE("role"),

        @JsonProperty("roleAssign")
        ROLE_ASSIGN("roleAssign"),

        @JsonProperty("policy")
        POLICY("policy"),

        @JsonProperty("customDomain")
        CUSTOM_DOMAIN("customDomain"),

        @JsonProperty("permitSpace")
        PERMIT_SPACE("permitSpace"),

        @JsonProperty("generalResource")
        GENERAL_RESOURCE("generalResource"),

        @JsonProperty("generalResourceAuthorization")
        GENERAL_RESOURCE_AUTHORIZATION("generalResourceAuthorization"),

        @JsonProperty("roleSubject")
        ROLE_SUBJECT("roleSubject"),

        @JsonProperty("subjectOfRole")
        SUBJECT_OF_ROLE("subjectOfRole"),

        @JsonProperty("dataResource")
        DATA_RESOURCE("dataResource"),

        @JsonProperty("dataPolicy")
        DATA_POLICY("dataPolicy"),

        @JsonProperty("authorization")
        AUTHORIZATION("authorization"),

        @JsonProperty("userAuthorization")
        USER_AUTHORIZATION("userAuthorization"),
        ;

        private String value;

        ResourceType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}