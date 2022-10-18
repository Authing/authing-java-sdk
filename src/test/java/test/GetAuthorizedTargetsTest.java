package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetAuthorizedTargetsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

//        GetResourceAuthorizedTargetsDto request = new GetAuthorizedTargetsDto();
//        request.setResource("resource_5132");
//        request.setNamespace("namespace_5778");
//        request.setResourceType(cn.authing.sdk.java.dto.GetAuthorizedTargetsDto.ResourceType.DATA);
//        request.setTargetType(cn.authing.sdk.java.dto.GetAuthorizedTargetsDto.TargetType.USER);
//        request.setActions(new cn.authing.sdk.java.dto.GetAuthorizedResourceActionDto());
//
//        GetAuthorizedTargetRespDto response = client.getResourceAuthorizedTargets(request);
//        System.out.println(JsonUtils.serialize(response));
    }

}