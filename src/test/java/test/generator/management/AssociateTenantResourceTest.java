package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class AssociateTenantResourceTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        AssociateTenantResourceDto request = new AssociateTenantResourceDto();
        request.setAppId("appId_3492");
        request.setAssociation(Boolean.TRUE);
        request.setCode("code_5561");
        request.setTenantId("tenantId_3671");

        IsSuccessRespDto response = client.associateTenantResource(request);
        System.out.println(JsonUtils.serialize(response));
    }

}