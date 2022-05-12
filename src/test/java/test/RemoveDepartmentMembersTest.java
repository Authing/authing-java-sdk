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

        AddDepartmentMembersReqDto request = new AddDepartmentMembersReqDto();
        request.setDepartmentId("departmentId_1799");
        request.setOrganizationCode("organizationCode_4346");
        request.setUserIds(Collections.singletonList("String_2218"));

        IsSuccessRespDto response = client.removeDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}