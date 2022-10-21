package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetGroupAuthorizedResourcesTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetGroupAuthorizedResourcesDto request = new GetGroupAuthorizedResourcesDto();
        request.setCode("code_2491");
        request.setNamespace("namespace_5201");
        request.setResourceType("resourceType_6652");

        AuthorizedResourceListRespDto response = client.getGroupAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }

}