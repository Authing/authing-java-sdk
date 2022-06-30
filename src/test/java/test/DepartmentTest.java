package test;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;


public class DepartmentTest {

    private static final String ACCESS_KEY_ID = "62ba89c8623562103089ae41";
    private static final String ACCESS_KEY_SECRET = "3a0ca97c6b79c1971aae08c21e3fbc1c";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        clientOptions.setHost("http://8.142.39.176:3000");
        ManagementClient client = new ManagementClient(clientOptions);

        /*IsUserInDepartmentDto request = new IsUserInDepartmentDto();
        request.setDepartmentId("root");
        request.setUserId("62ba8a36213b80ca4a065362");
        request.setOrganizationCode("0");
        request.setIncludeChildrenDepartments(true);

        IsUserInDepartmentRespDto response = client.isUserInDepartment(request);*/



        /*SearchOrganizationsDto request = new SearchOrganizationsDto();
        request.setKeywords("蒸汽记忆");
        OrganizationPaginatedRespDto response = client.searchOrganizations(request);
        System.out.println(JsonUtils.serialize(response));*/

        /*CreateRoleDto request = new CreateRoleDto();
        request.setCode("maintainer");
        request.setNamespace("0");
        RoleSingleRespDto response = client.createRole(request);
        System.out.println(JsonUtils.serialize(response));*/

        /*AssignRoleDto request = new AssignRoleDto();
        request.setCode("maintainer");
        request.setNamespace("0");
        List<TargetDto> targetList = new ArrayList<>();
        TargetDto targetDto = new TargetDto();
        targetDto.setTargetIdentifier("62bd29897986f5b06339d8bd");
        targetDto.setTargetType(TargetDto.TargetType.USER);
        targetList.add(targetDto);
        request.setTargets(targetList);
        IsSuccessRespDto response = client.assignRole(request);
        System.out.println(JsonUtils.serialize(response));*/


        /*GetUserRolesDto request = new GetUserRolesDto();
        request.setUserId("62bd29897986f5b06339d8bd");
        request.setNamespace("0");
        RolePaginatedRespDto response = client.getUserRoles(request);
        System.out.println(JsonUtils.serialize(response));*/

        /*MakeRequestReqDto request = new MakeRequestReqDto();
        request.setMethod("GET");
        request.setUrl("/api/exclusive/get-organizations-by-role");
        Map<String, Object> data = new HashMap<>();
        data.put("userId", "62bd29897986f5b06339d8bd");
        data.put("roleCode", "maintainer");
        request.setData(data);
        Object response = client.makeRequest(request);
        System.out.println(JsonUtils.serialize(response));*/


        GetDepartmentDto request = new GetDepartmentDto();
        request.setOrganizationCode("0");
        request.setDepartmentId("62ba8a2b0a272115ad0b8852");
//        request.setDepartmentCode("departmentCode_7757");
//        request.setDepartmentIdType("departmentIdType_7194");
        request.setWithCustomData(Boolean.TRUE);

        DepartmentSingleRespDto response = client.getDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}