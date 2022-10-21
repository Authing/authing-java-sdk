package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateResourceTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateResourceDto request = new UpdateResourceDto();
        request.setCode("code_7443");
        request.setDescription("description_6193");
        request.setActions(Collections.singletonList(new cn.authing.sdk.java.dto.ResourceAction()));
        request.setApiIdentifier("apiIdentifier_3947");
        request.setNamespace("namespace_9260");
        request.setType(cn.authing.sdk.java.dto.UpdateResourceDto.Type.DATA);

        ResourceRespDto response = client.updateResource(request);
        System.out.println(JsonUtils.serialize(response));
    }

}