import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateResourceTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateResourceDto request = new UpdateResourceDto();
        request.setCode("code_4418");
        request.setDescription("description_9055");
        request.setActions(Collections.singletonList(new cn.authing.sdk.java.dto.ResourceAction()));
        request.setApiIdentifier("apiIdentifier_4675");
        request.setNamespace("namespace_8168");
        request.setType(cn.authing.sdk.java.dto.UpdateResourceDto.Type.DATA);

        ResourceRespDto response = client.updateResource(request);
        System.out.println(JsonUtils.serialize(response));
    }

}