package test;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class SearchDepartmentMembersTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        SearchDepartmentMembersDto request = new SearchDepartmentMembersDto();
        request.setOrganizationCode("organizationCode_2608");
        request.setDepartmentId("departmentId_6637");
        request.setKeywords("keywords_6673");
        request.setPage(0);
        request.setLimit(0);
        request.setDepartmentIdType("departmentIdType_4382");
        request.setIncludeChildrenDepartments(Boolean.TRUE);
        request.setWithCustomData(Boolean.TRUE);
        request.setWithIdentities(Boolean.TRUE);
        request.setWithDepartmentIds(Boolean.TRUE);

        UserPaginatedRespDto response = client.searchDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }

}