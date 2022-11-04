package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ChangeExtIdpConnStateTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ChangeExtIdpConnStateDto request = new ChangeExtIdpConnStateDto();
        request.setAppId("appId_6987");
        request.setEnabled(Boolean.TRUE);
        request.setId("id_7265");
        request.setTenantId("tenantId_4359");
        request.setAppIds(Collections.singletonList("String_6039"));

        IsSuccessRespDto response = client.changeExtIdpConnState(request);
        System.out.println(JsonUtils.serialize(response));
    }

}