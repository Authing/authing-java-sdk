import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetDepartmentTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetDepartmentDto request = new GetDepartmentDto();
        request.setOrganizationCode("organizationCode_5394");
        request.setDepartmentId("departmentId_5519");
        request.setDepartmentIdType("departmentIdType_2300");

        DepartmentSingleRespDto response = client.getDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}