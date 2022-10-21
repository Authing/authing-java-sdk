package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ExtIdpConnStateByAppsTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ExtIdpConnAppsDto request = new ExtIdpConnAppsDto();
        request.setId("id_8398");
        request.setTenantId("tenantId_6896");
        request.setAppId("appId_933");
        request.setType("type_8844");

        ExtIdpListPaginatedRespDto response = client.extIdpConnStateByApps(request);
        System.out.println(JsonUtils.serialize(response));
    }

}