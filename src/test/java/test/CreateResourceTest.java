package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateResourceTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateResourceDto request = new CreateResourceDto();
        request.setType(cn.authing.sdk.java.dto.CreateResourceDto.Type.DATA);
        request.setCode("code_2463");
        request.setDescription("description_460");
        request.setActions(Collections.singletonList(new cn.authing.sdk.java.dto.ResourceAction()));
        request.setApiIdentifier("apiIdentifier_6446");
        request.setNamespace("namespace_8336");

        ResourceRespDto response = client.createResource(request);
        System.out.println(JsonUtils.serialize(response));
    }

}