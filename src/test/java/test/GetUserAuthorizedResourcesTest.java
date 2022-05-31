import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserAuthorizedResourcesTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserAuthorizedResourcesDto request = new GetUserAuthorizedResourcesDto();
        request.setUserId("userId_8255");
        request.setNamespace("namespace_5162");
        request.setResourceType("resourceType_6182");

        AuthorizedResourcePaginatedRespDto response = client.getUserAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }

}