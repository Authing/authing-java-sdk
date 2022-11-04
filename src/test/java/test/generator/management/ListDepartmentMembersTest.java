package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListDepartmentMembersTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListDepartmentMembersDto request = new ListDepartmentMembersDto();
        request.setOrganizationCode("organizationCode_4349");
        request.setDepartmentId("departmentId_7477");
        request.setSortBy("sortBy_4553");
        request.setOrderBy("orderBy_9054");
        request.setDepartmentIdType("departmentIdType_3732");
        request.setIncludeChildrenDepartments(Boolean.TRUE);
        request.setPage(0);
        request.setLimit(0);
        request.setWithCustomData(Boolean.TRUE);
        request.setWithIdentities(Boolean.TRUE);
        request.setWithDepartmentIds(Boolean.TRUE);

        UserPaginatedRespDto response = client.listDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}