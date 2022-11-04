package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetAuthorizedResourcesTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetAuthorizedResourcesDto request = new GetAuthorizedResourcesDto();
        request.setTargetType("targetType_5800");
        request.setTargetIdentifier("targetIdentifier_2451");
        request.setNamespace("namespace_7543");
        request.setResourceType("resourceType_7408");
        request.setResourceList("resourceList_7277");
        request.setWithDenied(Boolean.TRUE);

        AuthorizedResourcePaginatedRespDto response = client.getAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }

}