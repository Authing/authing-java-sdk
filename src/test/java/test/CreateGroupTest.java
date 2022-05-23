import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateGroupTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateGroupReqDto request = new CreateGroupReqDto();
        request.setDescription("description_9536");
        request.setName("name_4100");
        request.setCode("code_7080");

        GroupSingleRespDto response = client.createGroup(request);
        System.out.println(JsonUtils.serialize(response));
    }

}