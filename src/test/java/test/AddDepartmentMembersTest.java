import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class AddDepartmentMembersTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        AddDepartmentMembersReqDto request = new AddDepartmentMembersReqDto();
        request.setDepartmentId("departmentId_9612");
        request.setOrganizationCode("organizationCode_5264");
        request.setUserIds(Collections.singletonList("String_8146"));

        IsSuccessRespDto response = client.addDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}