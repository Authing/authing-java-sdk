package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateExtIdpConnTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateExtIdpConnDto request = new UpdateExtIdpConnDto();
        request.setFields(Collections.emptyList());
        request.setDisplayName("displayName_3551");
        request.setId("id_9814");
        request.setLogo("logo_9770");
        request.setLoginOnly(Boolean.TRUE);

        ExtIdpConnDetailSingleRespDto response = client.updateExtIdpConn(request);
        System.out.println(JsonUtils.serialize(response));
    }

}