package test;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.authentication.IOidcParams;
import cn.authing.sdk.java.model.AuthenticationClientOptions;

import java.io.IOException;
import java.text.ParseException;

public class BuildAuthorizeUrlTest {

    private static final String APP_ID = "YOUR_APP_ID";
    private static final String APP_SECRET = "YOUR_APP_SECRET";
    private static final String REDIRECT_URI = "YOUR_REDIRECT_URI";

    public static void main(String[] args) throws IOException, ParseException {
        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions(APP_ID, APP_SECRET, REDIRECT_URI);
        AuthenticationClient client = new AuthenticationClient(clientOptions);

        IOidcParams params = new IOidcParams();
        params.setAppId("AppId");
        params.setNonce("Nonce");
        params.setScope("Scope");
        params.setState("State");
        params.setRedirectUri("RedirectUri");
        params.setResponseMode("ResponseMode");
        params.setResponseType("ResponseType");

        String oidcString = client.buildAuthorizeUrl(params);
        System.out.println(oidcString);
    }
}
