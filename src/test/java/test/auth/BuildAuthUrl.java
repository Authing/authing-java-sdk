package test.auth;

import cn.authing.sdk.java.client.AuthenticationClient;

import cn.authing.sdk.java.dto.authentication.*;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.util.JsonUtils;


public class BuildAuthUrl {

    private static final String ACCESS_KEY_ID = "625fa4682e45fc2546331f25";
    private static final String ACCESS_KEY_SECRET = "828b4ef860797fd73a5cd62bd93881be";
    private static final String HOST = "https://test.mysql.authing-inc.co";
    private static final String REDIRECT_URI = "https://baidu.com";
    /**
     * code 只能用一次，需要每次登录后重新获取
     */
    private static final String code = "OeOVMU3MLP-7ueojcVBneYTntBYkob7_OxkjksiMpg4";
    public static void main(String[] args) throws Throwable {


        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET, HOST, REDIRECT_URI);

        AuthenticationClient client = new AuthenticationClient(clientOptions);

        BuildAuthUrlParams request = new BuildAuthUrlParams();

        AuthUrlResult response = client.buildAuthUrl(request);
        System.out.println("AuthUrlResult" + JsonUtils.serialize(response));

        LoginState loginState =  client.getLoginStateByAuthCode(code, REDIRECT_URI);

        System.out.println("loginState" + JsonUtils.serialize(loginState));
        LoginState refreshLoginState = client.refreshLoginState(loginState.getRefreshToken());

        System.out.println("refreshLoginState" + JsonUtils.serialize(refreshLoginState));

        UserInfo getUserinfo = client.getUserinfo("eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6InVlTVFVSDI1Ny1DWXQzOUFoblZNVXY2TUZrVjd1Q2xTWVU3T0VMZ1lzNzAifQ.eyJqdGkiOiJLX1h3ZWR2V1Zvd3kyQlNSSzRib0siLCJzdWIiOiI2MmEyZmU2NTg4NTMzNTM0N2IwY2IwOWUiLCJpYXQiOjE2NTUzMTA1NzAsImV4cCI6MTY1NjUyMDE3MCwic2NvcGUiOiJwcm9maWxlIG9wZW5pZCBvZmZsaW5lX2FjY2VzcyIsImlzcyI6Imh0dHBzOi8vdGVzdC5teXNxbC5hdXRoaW5nLWluYy5jby9vaWRjIiwiYXVkIjoiNjI1ZmE0NjgyZTQ1ZmMyNTQ2MzMxZjI1In0.oOLHTpWGsWH9a4GU-3-1F0cQGxCSGlfGgqeIJtA6TDGzzvQpKz_Z_bivz310iKPR_ji8vxYXHh2TzrdwV4keE-zeLv0Ct1XZlzatCyN7qK0rWfKLzPQe5G5Vg0FeX9g4HL6ReKp-T4uwFn83SH3zd-SnA4XTmQ_VKykOKKYDzp3Yow7uxngM2_qjkM3QOJuoypkr2OIsornvVFK1ceQlkHiWc4NABw1Cg-3gJMhs89a4GtY964I6UaJUmx5_WFVMu7DzlHBUVlwAP7a-TQmd6f0WblYlBrDSsZFp1CNHEIwFn1VtGdeRaXPVGsfzferajkaJDhgLNCHulRZuh1_NGA");  System.out.println("2" + JsonUtils.serialize(getUserinfo));

        System.out.println("getUserinfo" + JsonUtils.serialize(getUserinfo));

        LogoutUrlParams logoutUrlParams = new LogoutUrlParams();

        String buildLogoutUrl = client.buildLogoutUrl(logoutUrlParams);

        System.out.println("buildLogoutUrl" + buildLogoutUrl);
    }

}