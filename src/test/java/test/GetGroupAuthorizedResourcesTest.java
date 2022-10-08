package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetGroupAuthorizedResourcesTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetGroupAuthorizedResourcesDto request = new GetGroupAuthorizedResourcesDto();
        request.setCode("code_6303");
        request.setNamespace("namespace_2239");
        request.setResourceType("resourceType_2607");

        AuthorizedResourceListRespDto response = client.getGroupAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }

}