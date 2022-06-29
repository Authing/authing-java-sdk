import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class RemoveDepartmentMembersTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        RemoveDepartmentMembersReqDto request = new RemoveDepartmentMembersReqDto();
        request.setUserIds(Collections.singletonList("String_2535"));
        request.setOrganizationCode("organizationCode_9711");
        request.setDepartmentId("departmentId_548");
        request.setDepartmentIdType(cn.authing.sdk.java.dto.RemoveDepartmentMembersReqDto.DepartmentIdType.DEPARTMENT_ID);

        IsSuccessRespDto response = client.removeDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}