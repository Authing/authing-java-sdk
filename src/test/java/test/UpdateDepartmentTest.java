import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateDepartmentTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateDepartmentReqDto request = new UpdateDepartmentReqDto();
        request.setOrganizationCode("organizationCode_2050");
        request.setParentDepartmentId("parentDepartmentId_5953");
        request.setDepartmentId("departmentId_8852");
        request.setCode("code_5374");
        request.setLeaderUserId("leaderUserId_1674");
        request.setName("name_5362");
        request.setDepartmentIdType(cn.authing.sdk.java.dto.UpdateDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);

        DepartmentSingleRespDto response = client.updateDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}