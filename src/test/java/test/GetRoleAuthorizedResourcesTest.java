package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetRoleAuthorizedResourcesTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetRoleAuthorizedResourcesDto request = new GetRoleAuthorizedResourcesDto();
        request.setCode("code_9900");
        request.setNamespace("namespace_7571");
        request.setResourceType("resourceType_6395");

        RoleAuthorizedResourcePaginatedRespDto response = client.getRoleAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }

}