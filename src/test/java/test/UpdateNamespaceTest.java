import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateNamespaceTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateNamespaceDto request = new UpdateNamespaceDto();
        request.setCode("code_949");
        request.setDescription("description_4545");
        request.setName("name_7018");
        request.setNewCode("newCode_8156");

        UpdateNamespaceRespDto response = client.updateNamespace(request);
        System.out.println(JsonUtils.serialize(response));
    }

}