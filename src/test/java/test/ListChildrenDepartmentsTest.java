package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListChildrenDepartmentsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListChildrenDepartmentsDto request = new ListChildrenDepartmentsDto();
        request.setOrganizationCode("organizationCode_3455");
        request.setDepartmentId("departmentId_3777");
        request.setDepartmentIdType("departmentIdType_8166");
        request.setExcludeVirtualNode(Boolean.TRUE);
        request.setOnlyVirtualNode(Boolean.TRUE);
        request.setWithCustomData(Boolean.TRUE);

        DepartmentPaginatedRespDto response = client.listChildrenDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }

}