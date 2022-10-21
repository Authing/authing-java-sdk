package test;
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
        request.setOrganizationCode("organizationCode_232");
        request.setDepartmentId("departmentId_6076");
        request.setDepartmentIdType("departmentIdType_7490");
        request.setExcludeVirtualNode(Boolean.TRUE);
        request.setOnlyVirtualNode(Boolean.TRUE);
        request.setWithCustomData(Boolean.TRUE);

        DepartmentPaginatedRespDto response = client.listChildrenDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }

}