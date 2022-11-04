package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetUserDepartmentsTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserDepartmentsDto request = new GetUserDepartmentsDto();
        request.setUserId("userId_6656");
        request.setUserIdType("userIdType_2893");
        request.setPage(0);
        request.setLimit(0);
        request.setWithCustomData(Boolean.TRUE);
        request.setSortBy("sortBy_9166");
        request.setOrderBy("orderBy_132");

        UserDepartmentPaginatedRespDto response = client.getUserDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }

}