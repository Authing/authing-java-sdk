package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserAuthorizedResourcesTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserAuthorizedResourcesDto request = new GetUserAuthorizedResourcesDto();
        request.setUserId("userId_708");
        request.setUserIdType("userIdType_1900");
        request.setNamespace("namespace_2126");
        request.setResourceType("resourceType_935");

        AuthorizedResourcePaginatedRespDto response = client.getUserAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }

}