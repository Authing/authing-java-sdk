package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListChildrenDepartmentsTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListChildrenDepartmentsDto request = new ListChildrenDepartmentsDto();
        request.setOrganizationCode("organizationCode_9491");
        request.setDepartmentId("departmentId_2993");
        request.setDepartmentIdType("departmentIdType_4594");
        request.setExcludeVirtualNode(Boolean.TRUE);
        request.setOnlyVirtualNode(Boolean.TRUE);
        request.setWithCustomData(Boolean.TRUE);

        DepartmentPaginatedRespDto response = client.listChildrenDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }

}