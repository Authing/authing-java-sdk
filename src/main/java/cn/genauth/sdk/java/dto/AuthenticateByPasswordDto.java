package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthenticateByPasswordDto {
    /**
     * 用户密码，默认不加密。Authing 所有 API 均通过 HTTPS 协议对密码进行安全传输，可以在一定程度上保证安全性。
     * 如果你还需要更高级别的安全性，我们还支持 `RSA256` 和国密 `SM2` 的密码加密方式。详情见可选参数 `options.passwordEncryptType`。
     *
     */
    @JsonProperty("password")
    private String password;
    /**
     * 用户账号（用户名/手机号/邮箱）
     */
    @JsonProperty("account")
    private String account;
    /**
     * 邮箱，不区分大小写。
     */
    @JsonProperty("email")
    private String email;
    /**
     * 用户名（username）
     */
    @JsonProperty("username")
    private String username;
    /**
     * 手机号
     */
    @JsonProperty("phone")
    private String phone;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }



}