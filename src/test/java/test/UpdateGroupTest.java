import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateGroupTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateGroupReqDto request = new UpdateGroupReqDto();
        request.setDescription("description_47");
        request.setName("name_1390");
        request.setCode("code_931");
        request.setNewCode("newCode_4357");

        GroupSingleRespDto response = client.updateGroup(request);
        System.out.println(JsonUtils.serialize(response));
    }

}