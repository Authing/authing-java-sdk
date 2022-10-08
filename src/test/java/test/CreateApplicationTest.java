package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateApplicationTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateApplicationDto request = new CreateApplicationDto();
        request.setAppName("appName_7134");
        request.setTemplate("template_5887");
        request.setTemplateData("templateData_1991");
        request.setAppIdentifier("appIdentifier_8081");
        request.setAppLogo("appLogo_5545");
        request.setAppDescription("appDescription_1324");
        request.setAppType(cn.authing.sdk.java.dto.CreateApplicationDto.AppType.WEB);
        request.setDefaultProtocol(cn.authing.sdk.java.dto.CreateApplicationDto.DefaultProtocol.OIDC);
        request.setRedirectUris(Collections.singletonList("String_2855"));
        request.setLogoutRedirectUris(Collections.singletonList("String_9162"));
        request.setInitLoginUri("initLoginUri_2124");
        request.setSsoEnabled(Boolean.TRUE);
        request.setOidcConfig(new cn.authing.sdk.java.dto.OIDCConfig());
        request.setSamlProviderEnabled(Boolean.TRUE);
        request.setSamlConfig(new cn.authing.sdk.java.dto.SamlIdpConfig());
        request.setOauthProviderEnabled(Boolean.TRUE);
        request.setOauthConfig(new cn.authing.sdk.java.dto.OauthIdpConfig());
        request.setCasProviderEnabled(Boolean.TRUE);
        request.setCasConfig(new cn.authing.sdk.java.dto.CasIdPConfig());
        request.setLoginConfig(new cn.authing.sdk.java.dto.ApplicationLoginConfigInputDto());
        request.setRegisterConfig(new cn.authing.sdk.java.dto.ApplicationRegisterConfigInputDto());
        request.setBrandingConfig(new cn.authing.sdk.java.dto.ApplicationBrandingConfigInputDto());

        ApplicationPaginatedRespDto response = client.createApplication(request);
        System.out.println(JsonUtils.serialize(response));
    }

}