import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateExtIdpConnTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateExtIdpConnDto request = new CreateExtIdpConnDto();
        request.setFields(Collections.emptyList());
        request.setDisplayName("displayName_7320");
        request.setIdentifier("identifier_6546");
        request.setType(cn.authing.sdk.java.dto.CreateExtIdpConnDto.Type.OIDC);
        request.setExtIdpId("extIdpId_5672");
        request.setLoginOnly(Boolean.TRUE);
        request.setLogo("logo_7569");

        ExtIdpConnDetailSingleRespDto response = client.createExtIdpConn(request);
        System.out.println(JsonUtils.serialize(response));
    }

}