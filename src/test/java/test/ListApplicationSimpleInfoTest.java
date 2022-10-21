package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListApplicationSimpleInfoTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListApplicationSimpleInfoDto request = new ListApplicationSimpleInfoDto();
        request.setPage(0);
        request.setLimit(0);
        request.setIsIntegrateApp(Boolean.TRUE);
        request.setIsSelfBuiltApp(Boolean.TRUE);
        request.setSsoEnabled(Boolean.TRUE);
        request.setKeyword("keyword_3512");

        ApplicationSimpleInfoSingleRespDto response = client.listApplicationSimpleInfo(request);
        System.out.println(JsonUtils.serialize(response));
    }

}