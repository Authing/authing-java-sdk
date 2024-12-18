package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ApplicationRegisterConfigInputDto {
    /**
     * 开启的注册方式
     */
    @JsonProperty("enabledBasicRegisterMethods")
    private List<String> enabledBasicRegisterMethods;
    /**
     * 默认的注册类型
     * - `PASSWORD`: 密码类型，支持邮箱 + 密码进行登录
     * - `PASSCODE`: 验证码类型，取决于你开启的注册方式，支持手机号/邮箱 + 验证码进行登录
     *
     */
    @JsonProperty("defaultRegisterMethod")
    private DefaultRegisterMethod defaultRegisterMethod;

    public List<String> getEnabledBasicRegisterMethods() {
        return enabledBasicRegisterMethods;
    }
    public void setEnabledBasicRegisterMethods(List<String> enabledBasicRegisterMethods) {
        this.enabledBasicRegisterMethods = enabledBasicRegisterMethods;
    }

    public DefaultRegisterMethod getDefaultRegisterMethod() {
        return defaultRegisterMethod;
    }
    public void setDefaultRegisterMethod(DefaultRegisterMethod defaultRegisterMethod) {
        this.defaultRegisterMethod = defaultRegisterMethod;
    }


    /**
     * 默认的注册类型
     * - `PASSWORD`: 密码类型，支持邮箱 + 密码进行登录
     * - `PASSCODE`: 验证码类型，取决于你开启的注册方式，支持手机号/邮箱 + 验证码进行登录
     *
     */
    public static enum DefaultRegisterMethod {

        @JsonProperty("PASSCODE")
        PASSCODE("PASSCODE"),

        @JsonProperty("PASSWORD")
        PASSWORD("PASSWORD"),
        ;

        private String value;

        DefaultRegisterMethod(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}