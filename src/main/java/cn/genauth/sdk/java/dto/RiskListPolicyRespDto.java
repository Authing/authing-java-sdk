package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RiskListPolicyRespDto {
    /**
     * ID
     */
    @JsonProperty("id")
    private String id;
    /**
     * 策略操作对象，目前只有 ip
     */
    @JsonProperty("optObject")
    private OptObject optObject;
    /**
     * 操作IP的范围, ALL-所有，NOT_IN_WHITE_LIST-不在白名单中，与 userRange 二者取一个
     */
    @JsonProperty("ipRange")
    private IpRange ipRange;
    /**
     * 操作USER的范围, ALL-所有，NOT_IN_WHITE_LIST-不在白名单中，与 ipRange 二者取一个
     */
    @JsonProperty("userRange")
    private UserRange userRange;
    /**
     * IP条件, NO_LIMIT-不限制，ONE-单个IP，与 userCond 二者取一个
     */
    @JsonProperty("ipCond")
    private IpCond ipCond;
    /**
     * IP条件, NO_LIMIT-不限制，ONE-单个用户，与 ipCond 二者取一个
     */
    @JsonProperty("userCond")
    private UserCond userCond;
    /**
     * 时间范围，最近多少分钟
     */
    @JsonProperty("timeRange")
    private Integer timeRange;
    /**
     * 次数阈值
     */
    @JsonProperty("countThr")
    private Integer countThr;
    /**
     * 事件状态类型，password_wrong-密码错误，account_wrong-账号错误
     */
    @JsonProperty("eventStateType")
    private EventStateType eventStateType;
    /**
     * 移除类型，MANUAL-手动，SCHEDULE-策略, 目前只有手动
     */
    @JsonProperty("removeType")
    private RemoveType removeType;
    /**
     * 策略动作, ADD_IP_BLACK_LIST-添加IP黑名单，ADD_USER_BLACK_LIST-添加用户黑名单
     */
    @JsonProperty("action")
    private Action action;
    /**
     * 限制类型列表,FORBID_LOGIN-禁止登录，FORBID_REGISTER-禁止注册
     */
    @JsonProperty("limitList")
    private LimitList limitList;
    /**
     * 创建时间，
     */
    @JsonProperty("createdAt")
    private String createdAt;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public OptObject getOptObject() {
        return optObject;
    }
    public void setOptObject(OptObject optObject) {
        this.optObject = optObject;
    }

    public IpRange getIpRange() {
        return ipRange;
    }
    public void setIpRange(IpRange ipRange) {
        this.ipRange = ipRange;
    }

    public UserRange getUserRange() {
        return userRange;
    }
    public void setUserRange(UserRange userRange) {
        this.userRange = userRange;
    }

    public IpCond getIpCond() {
        return ipCond;
    }
    public void setIpCond(IpCond ipCond) {
        this.ipCond = ipCond;
    }

    public UserCond getUserCond() {
        return userCond;
    }
    public void setUserCond(UserCond userCond) {
        this.userCond = userCond;
    }

    public Integer getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(Integer timeRange) {
        this.timeRange = timeRange;
    }

    public Integer getCountThr() {
        return countThr;
    }
    public void setCountThr(Integer countThr) {
        this.countThr = countThr;
    }

    public EventStateType getEventStateType() {
        return eventStateType;
    }
    public void setEventStateType(EventStateType eventStateType) {
        this.eventStateType = eventStateType;
    }

    public RemoveType getRemoveType() {
        return removeType;
    }
    public void setRemoveType(RemoveType removeType) {
        this.removeType = removeType;
    }

    public Action getAction() {
        return action;
    }
    public void setAction(Action action) {
        this.action = action;
    }

    public LimitList getLimitList() {
        return limitList;
    }
    public void setLimitList(LimitList limitList) {
        this.limitList = limitList;
    }

    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * 策略操作对象，目前只有 ip
     */
    public static enum OptObject {

        @JsonProperty("IP")
        IP("IP"),

        @JsonProperty("USER")
        USER("USER"),
        ;

        private String value;

        OptObject(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 操作IP的范围, ALL-所有，NOT_IN_WHITE_LIST-不在白名单中，与 userRange 二者取一个
     */
    public static enum IpRange {

        @JsonProperty("ALL")
        ALL("ALL"),

        @JsonProperty("NOT_IN_WHITE_LIST")
        NOT_IN_WHITE_LIST("NOT_IN_WHITE_LIST"),
        ;

        private String value;

        IpRange(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 操作USER的范围, ALL-所有，NOT_IN_WHITE_LIST-不在白名单中，与 ipRange 二者取一个
     */
    public static enum UserRange {

        @JsonProperty("ALL")
        ALL("ALL"),

        @JsonProperty("NOT_IN_WHITE_LIST")
        NOT_IN_WHITE_LIST("NOT_IN_WHITE_LIST"),
        ;

        private String value;

        UserRange(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * IP条件, NO_LIMIT-不限制，ONE-单个IP，与 userCond 二者取一个
     */
    public static enum IpCond {

        @JsonProperty("NO_LIMIT")
        NO_LIMIT("NO_LIMIT"),

        @JsonProperty("ONE")
        ONE("ONE"),
        ;

        private String value;

        IpCond(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * IP条件, NO_LIMIT-不限制，ONE-单个用户，与 ipCond 二者取一个
     */
    public static enum UserCond {

        @JsonProperty("NO_LIMIT")
        NO_LIMIT("NO_LIMIT"),

        @JsonProperty("ONE")
        ONE("ONE"),
        ;

        private String value;

        UserCond(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 事件状态类型，password_wrong-密码错误，account_wrong-账号错误
     */
    public static enum EventStateType {

        @JsonProperty("password_wrong")
        PASSWORD_WRONG("password_wrong"),

        @JsonProperty("account_wrong")
        ACCOUNT_WRONG("account_wrong"),
        ;

        private String value;

        EventStateType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 移除类型，MANUAL-手动，SCHEDULE-策略, 目前只有手动
     */
    public static enum RemoveType {

        @JsonProperty("MANUAL")
        MANUAL("MANUAL"),

        @JsonProperty("SCHEDULE")
        SCHEDULE("SCHEDULE"),
        ;

        private String value;

        RemoveType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 策略动作, ADD_IP_BLACK_LIST-添加IP黑名单，ADD_USER_BLACK_LIST-添加用户黑名单
     */
    public static enum Action {

        @JsonProperty("ADD_IP_BLACK_LIST")
        ADD_IP_BLACK_LIST("ADD_IP_BLACK_LIST"),

        @JsonProperty("ADD_USER_BLACK_LIST")
        ADD_USER_BLACK_LIST("ADD_USER_BLACK_LIST"),
        ;

        private String value;

        Action(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 限制类型列表,FORBID_LOGIN-禁止登录，FORBID_REGISTER-禁止注册
     */
    public static enum LimitList {

        @JsonProperty("FORBID_LOGIN")
        FORBID_LOGIN("FORBID_LOGIN"),

        @JsonProperty("FORBID_REGISTER")
        FORBID_REGISTER("FORBID_REGISTER"),
        ;

        private String value;

        LimitList(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}