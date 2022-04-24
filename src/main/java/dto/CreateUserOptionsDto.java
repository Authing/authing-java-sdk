package dto;

import java.util.List;


public class CreateUserOptionsDto {
    /**
     * 该参数一般在迁移旧有用户数据到 Authing 的时候会设置。开启这个开关，password 字段会直接写入 Authing 数据库，Authing 不会再次加密此字段。如果你的密码不是明文存储，你应该保持开启，并编写密码函数计算。
     */
    private Boolean keepPassword;
    /**
     * 是否强制要求用户在第一次的时候重置密码
     */
    private Boolean resetPasswordOnFirstLogin;

    public Boolean getKeepPassword() {
        return keepPassword;
    }
    public void setKeepPassword(Boolean keepPassword) {
        this.keepPassword = keepPassword;
    }

    public Boolean getResetPasswordOnFirstLogin() {
        return resetPasswordOnFirstLogin;
    }
    public void setResetPasswordOnFirstLogin(Boolean resetPasswordOnFirstLogin) {
        this.resetPasswordOnFirstLogin = resetPasswordOnFirstLogin;
    }



};