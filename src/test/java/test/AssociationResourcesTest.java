package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class AssociationResourcesTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        AssociationResourceDto request = new AssociationResourceDto();
        request.setAppId("appId_1729");
        request.setAssociation(Boolean.TRUE);
        request.setCode("code_8593");
        request.setTenantId("tenantId_1925");

        IsSuccessRespDto response = client.associationResources(request);
        System.out.println(JsonUtils.serialize(response));
    }

}