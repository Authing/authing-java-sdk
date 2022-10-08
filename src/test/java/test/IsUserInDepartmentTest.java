import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class IsUserInDepartmentTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        IsUserInDepartmentDto request = new IsUserInDepartmentDto();
        request.setUserId("userId_1573");
        request.setOrganizationCode("organizationCode_8504");
        request.setDepartmentId("departmentId_9939");
        request.setDepartmentIdType("departmentIdType_8779");
        request.setIncludeChildrenDepartments(Boolean.TRUE);

        IsUserInDepartmentRespDto response = client.isUserInDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}