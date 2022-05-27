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
        request.setOrganizationCode("organizationCode_8798");
        request.setParentDepartmentId("parentDepartmentId_2683");
        request.setDepartmentId("departmentId_991");
        request.setCode("code_514");
        request.setLeaderUserId("leaderUserId_5255");
        request.setName("name_2164");
        request.setDepartmentIdType(cn.authing.sdk.java.dto.UpdateDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);

        DepartmentSingleRespDto response = client.updateDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}