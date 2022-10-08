package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class AssignRoleTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        AssignRoleDto request = new AssignRoleDto();
        request.setTargets(Collections.singletonList(new cn.authing.sdk.java.dto.TargetDto()));
        request.setCode("code_1954");
        request.setNamespace("namespace_8664");

        IsSuccessRespDto response = client.assignRole(request);
        System.out.println(JsonUtils.serialize(response));
    }

}