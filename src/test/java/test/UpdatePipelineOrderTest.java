package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdatePipelineOrderTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdatePipelineOrderDto request = new UpdatePipelineOrderDto();
        request.setOrder(Collections.singletonList("String_3115"));
        request.setScene(cn.authing.sdk.java.dto.UpdatePipelineOrderDto.Scene.PRE_REGISTER);

        CommonResponseDto response = client.updatePipelineOrder(request);
        System.out.println(JsonUtils.serialize(response));
    }

}