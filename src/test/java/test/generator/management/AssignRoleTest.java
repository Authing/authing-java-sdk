package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class AssignRoleTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        AssignRoleDto request = new AssignRoleDto();
        request.setTargets(Collections.singletonList(new cn.authing.sdk.java.dto.TargetDto()));
        request.setCode("code_2262");
        request.setNamespace("namespace_2178");

        IsSuccessRespDto response = client.assignRole(request);
        System.out.println(JsonUtils.serialize(response));
    }

}