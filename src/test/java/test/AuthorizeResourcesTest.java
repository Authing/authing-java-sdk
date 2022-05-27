import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class AuthorizeResourcesTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        AuthorizeResourcesDto request = new AuthorizeResourcesDto();
        request.setList(Collections.singletonList(new cn.authing.sdk.java.dto.AuthorizeResourceItem()));
        request.setNamespace("namespace_822");

        IsSuccessRespDto response = client.authorizeResources(request);
        System.out.println(JsonUtils.serialize(response));
    }

}