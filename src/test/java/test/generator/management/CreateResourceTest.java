package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateResourceTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateResourceDto request = new CreateResourceDto();
        request.setType(cn.authing.sdk.java.dto.CreateResourceDto.Type.DATA);
        request.setCode("code_1127");
        request.setDescription("description_1394");
        request.setActions(Collections.singletonList(new cn.authing.sdk.java.dto.ResourceAction()));
        request.setApiIdentifier("apiIdentifier_6131");
        request.setNamespace("namespace_2406");

        ResourceRespDto response = client.createResource(request);
        System.out.println(JsonUtils.serialize(response));
    }

}