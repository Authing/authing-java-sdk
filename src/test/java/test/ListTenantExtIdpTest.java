package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListTenantExtIdpTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListTenantExtIdpDto request = new ListTenantExtIdpDto();
        request.setTenantId("tenantId_6855");
        request.setAppId("appId_8874");
        request.setType("type_7807");
        request.setPage("page_2737");
        request.setLimit("limit_9343");

        ExtIdpListPaginatedRespDto response = client.listTenantExtIdp(request);
        System.out.println(JsonUtils.serialize(response));
    }

}