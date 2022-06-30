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
        request.setOrganizationCode("organizationCode_3414");
        request.setDepartmentId("departmentId_5597");
        request.setDepartmentIdType("departmentIdType_1837");
        request.setExcludeVirtualNode(Boolean.TRUE);
        request.setWithCustomData(Boolean.TRUE);

        DepartmentPaginatedRespDto response = client.listChildrenDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }

}