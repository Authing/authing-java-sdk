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
    private String operationType;
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
    private String resourceType;
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

    public String getOperationType() {
        return operationType;
    }
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getResourceType() {
        return resourceType;
    }
    public void setResourceType(String resourceType) {
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

}