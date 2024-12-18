package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PolicyCondition {
    /**
     * Condition Param
     */
    @JsonProperty("param")
    private Param param;
    /**
     * Condition Operator
     */
    @JsonProperty("operator")
    private Operator operator;
    /**
     * Condition Value
     */
    @JsonProperty("value")
    private String value;

    public Param getParam() {
        return param;
    }
    public void setParam(Param param) {
        this.param = param;
    }

    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Condition Param
     */
    public static enum Param {

        @JsonProperty("UserPoolId")
        USER_POOL_ID("UserPoolId"),

        @JsonProperty("AppId")
        APP_ID("AppId"),

        @JsonProperty("RequestFrom")
        REQUEST_FROM("RequestFrom"),

        @JsonProperty("UserId")
        USER_ID("UserId"),

        @JsonProperty("UserArn")
        USER_ARN("UserArn"),

        @JsonProperty("CurrentTime")
        CURRENT_TIME("CurrentTime"),

        @JsonProperty("EpochTime")
        EPOCH_TIME("EpochTime"),

        @JsonProperty("SourceIp")
        SOURCE_IP("SourceIp"),

        @JsonProperty("User")
        USER("User"),

        @JsonProperty("MultiFactorAuthPresent")
        MULTI_FACTOR_AUTH_PRESENT("MultiFactorAuthPresent"),

        @JsonProperty("MultiFactorAuthAge")
        MULTI_FACTOR_AUTH_AGE("MultiFactorAuthAge"),

        @JsonProperty("UserAgent")
        USER_AGENT("UserAgent"),

        @JsonProperty("Referer")
        REFERER("Referer"),

        @JsonProperty("Device")
        DEVICE("Device"),

        @JsonProperty("OS")
        OS("OS"),

        @JsonProperty("Country")
        COUNTRY("Country"),

        @JsonProperty("Province")
        PROVINCE("Province"),

        @JsonProperty("City")
        CITY("City"),

        @JsonProperty("DeviceChanged")
        DEVICE_CHANGED("DeviceChanged"),

        @JsonProperty("DeviceUntrusted")
        DEVICE_UNTRUSTED("DeviceUntrusted"),

        @JsonProperty("ProxyUntrusted")
        PROXY_UNTRUSTED("ProxyUntrusted"),

        @JsonProperty("LoggedInApps")
        LOGGED_IN_APPS("LoggedInApps"),

        @JsonProperty("Namespace")
        NAMESPACE("Namespace"),
        ;

        private String value;

        Param(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * Condition Operator
     */
    public static enum Operator {

        @JsonProperty("Bool")
        BOOL("Bool"),

        @JsonProperty("DateEquals")
        DATE_EQUALS("DateEquals"),

        @JsonProperty("DateNotEquals")
        DATE_NOT_EQUALS("DateNotEquals"),

        @JsonProperty("DateLessThan")
        DATE_LESS_THAN("DateLessThan"),

        @JsonProperty("DateLessThanEquals")
        DATE_LESS_THAN_EQUALS("DateLessThanEquals"),

        @JsonProperty("DateGreaterThan")
        DATE_GREATER_THAN("DateGreaterThan"),

        @JsonProperty("DateGreaterThanEquals")
        DATE_GREATER_THAN_EQUALS("DateGreaterThanEquals"),

        @JsonProperty("IpAddress")
        IP_ADDRESS("IpAddress"),

        @JsonProperty("NotIpAddress")
        NOT_IP_ADDRESS("NotIpAddress"),

        @JsonProperty("NumericEquals")
        NUMERIC_EQUALS("NumericEquals"),

        @JsonProperty("NumericNotEquals")
        NUMERIC_NOT_EQUALS("NumericNotEquals"),

        @JsonProperty("NumericLessThan")
        NUMERIC_LESS_THAN("NumericLessThan"),

        @JsonProperty("NumericLessThanEquals")
        NUMERIC_LESS_THAN_EQUALS("NumericLessThanEquals"),

        @JsonProperty("NumericGreaterThan")
        NUMERIC_GREATER_THAN("NumericGreaterThan"),

        @JsonProperty("NumericGreaterThanEquals")
        NUMERIC_GREATER_THAN_EQUALS("NumericGreaterThanEquals"),

        @JsonProperty("StringEquals")
        STRING_EQUALS("StringEquals"),

        @JsonProperty("StringNotEquals")
        STRING_NOT_EQUALS("StringNotEquals"),

        @JsonProperty("StringEqualsIgnoreCase")
        STRING_EQUALS_IGNORE_CASE("StringEqualsIgnoreCase"),

        @JsonProperty("StringNotEqualsIgnoreCase")
        STRING_NOT_EQUALS_IGNORE_CASE("StringNotEqualsIgnoreCase"),

        @JsonProperty("StringLike")
        STRING_LIKE("StringLike"),

        @JsonProperty("StringNotLike")
        STRING_NOT_LIKE("StringNotLike"),

        @JsonProperty("ListContains")
        LIST_CONTAINS("ListContains"),
        ;

        private String value;

        Operator(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}