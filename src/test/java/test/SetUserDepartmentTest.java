import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class SetUserDepartmentTest {
    
    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        SetUserDepartmentsDto request = new SetUserDepartmentsDto();
        SetUserDepartmentDto setUserDepartmentDto = new SetUserDepartmentDto();
        setUserDepartmentDto.setDepartmentId("departmentId_1234");
        setUserDepartmentDto.setIsLeader(false);
        setUserDepartmentDto.setIsMainDepartment(false);
        
        request.setDepartments(Collections.singletonList(setUserDepartmentDto));
        request.setUserId("userId_1234");

        IsSuccessRespDto response = client.setUserDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}