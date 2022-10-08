package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateRoleTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateRoleDto request = new UpdateRoleDto();
        request.setNewCode("newCode_3964");
        request.setCode("code_4997");
        request.setNamespace("namespace_5749");
        request.setDescription("description_1990");

        IsSuccessRespDto response = client.updateRole(request);
        System.out.println(JsonUtils.serialize(response));
    }

}