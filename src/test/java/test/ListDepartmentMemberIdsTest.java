package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListDepartmentMemberIdsTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListDepartmentMemberIdsDto request = new ListDepartmentMemberIdsDto();
        request.setOrganizationCode("organizationCode_2987");
        request.setDepartmentId("departmentId_7668");
        request.setDepartmentIdType("departmentIdType_849");

        UserIdListRespDto response = client.listDepartmentMemberIds(request);
        System.out.println(JsonUtils.serialize(response));
    }

}