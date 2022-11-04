package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListNamespaceRolesTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListNamespaceRolesDto request = new ListNamespaceRolesDto();
        request.setCode("code_7187");
        request.setPage(0);
        request.setLimit(0);
        request.setKeywords("keywords_7744");

        NamespaceRolesListPaginatedRespDto response = client.listNamespaceRoles(request);
        System.out.println(JsonUtils.serialize(response));
    }

}