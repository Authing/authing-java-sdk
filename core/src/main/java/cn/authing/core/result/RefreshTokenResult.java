package cn.authing.core.result;

import lombok.Getter;

@Getter
public class RefreshTokenResult implements ITokenResult {
    private String token;
    private int iat;
    private int exp;
}
