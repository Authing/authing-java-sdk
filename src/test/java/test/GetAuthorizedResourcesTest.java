package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetAuthorizedResourcesTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetAuthorizedResourcesDto request = new GetAuthorizedResourcesDto();
        request.setTargetType("targetType_3535");
        request.setTargetIdentifier("targetIdentifier_2046");
        request.setNamespace("namespace_2977");
        request.setResourceType("resourceType_8971");
        request.setResourceList("resourceList_4668");
        request.setWithDenied(Boolean.TRUE);

        AuthorizedResourcePaginatedRespDto response = client.getAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }

}