package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SignInByAdPayloadDto {
    /**
     * 用户密码，默认不加密。Authing 所有 API 均通过 HTTPS 协议对密码进行安全传输，可以在一定程度上保证安全性。
     * 如果你还需要更高级别的安全性，我们还支持 `RSA256` 和国密 `SM2` 的密码加密方式。详情见可选参数 `options.passwordEncryptType`。
     *
     */
    @JsonProperty("password")
    private String password;
    /**
     * Windows AD 用户目录中账号的 sAMAccountName
     */
    @JsonProperty("sAMAccountName")
    private String sAMAccountName;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getSAMAccountName() {
        return sAMAccountName;
    }
    public void setSAMAccountName(String sAMAccountName) {
        this.sAMAccountName = sAMAccountName;
    }



}