package cn.authing.core.result;

import lombok.Getter;

@Getter
public class UserOAuthData {
    private String type;
    private String oAuthUrl;
    private String image;
    private String name;
    private boolean binded;
}
