import client.ManagementClient;
import dto.*;
import dto.CreateResourceBatchItemDto.Type;
import dto.ResourceItemDto.ResourceType;
import dto.SetCustomFieldDto.DataType;
import dto.SetCustomFieldDto.TargetType;
import model.ManagementClientOptions;
import org.junit.jupiter.api.Test;
import util.JsonUtils;

import java.util.ArrayList;
import java.util.Collections;


public class ManagementClientTest {
    
    private static final String ACCESS_KEY_ID = "62760eaab33cbf3a1f4f36ca";
    private static final String ACCESS_KEY_SECRET = "6080e4414fbfe58cab6e93840a377f46";
    private static final String HOST = "https://core.dev.authing-inc.co";
    
    
    
    
    @Test
    public void getResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetResourceDto request = new GetResourceDto();
        request.setCode("resourceCode");
        request.setNamespace("namespace1");
        
        ResourceRespDto response = client.getResource(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void hasAnyRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        HasAnyRoleDto request = new HasAnyRoleDto();
        request.setHasAnyRole(Boolean.TRUE);
        
        HasAnyRoleRespDto response = client.hasAnyRole(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetNamespaceDto request = new GetNamespaceDto();
        request.setCode("code_9438");
        
        NamespaceRespDto response = client.getNamespace(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserAccessibleAppsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserAccessibleAppsReqDto request = new GetUserAccessibleAppsReqDto();
        request.setUserId("userId_8439");
        
        AppListRespDto response = client.getUserAccessibleApps(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void removeDepartmentMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        AddDepartmentMembersReqDto request = new AddDepartmentMembersReqDto();
        request.setDepartmentId("departmentId_4254");
        request.setOrganizationCode("organizationCode_8029");
        request.setUserIds(Collections.singletonList("userId_8237"));
        
        IsSuccessRespDto response = client.removeDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createResourcesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateResourceBatchItemDto itemDto = new CreateResourceBatchItemDto();
        itemDto.setCode("code");
        itemDto.setDescription("description");
        itemDto.setType(Type.DATA);
        ResourceAction action = new ResourceAction();
        action.setName("资源操作名称");
        action.setDescription("资源操作描述");
        itemDto.setActions(Collections.singletonList(action));
        itemDto.setApiIdentifier("");
        
        CreateResourcesBatchDto request = new CreateResourcesBatchDto();
        request.setList(Collections.singletonList(itemDto));
        request.setNamespace("namespace_7484");
        
        IsSuccessRespDto response = client.createResourcesBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    // todo deketeNamespacesBatchTest
    @Test
    public void deketeNamespacesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteNamespacesBatchDto request = new DeleteNamespacesBatchDto();
        request.setCodeList(Collections.singletonList("namespaceCode"));
        
        IsSuccessRespDto response = client.deketeNamespacesBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void deleteResourcesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteResourcesBatchDto request = new DeleteResourcesBatchDto();
        request.setCodeList(Collections.singletonList("resourceCode_3317"));
        request.setNamespace("namespace_8230");
        
        IsSuccessRespDto response = client.deleteResourcesBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getPrincipalAuthenticationInfoTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserPrincipalAuthenticationInfoDto request = new GetUserPrincipalAuthenticationInfoDto();
        request.setUserId("userId_4147");
        
        PrincipalAuthenticationInfoPaginatedRespDto response = client.getPrincipalAuthenticationInfo(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getTargetAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetAuthorizedResourcesDto request = new GetAuthorizedResourcesDto();
        request.setTargetIdentifier("userId_1457");
        request.setTargetType(dto.GetAuthorizedResourcesDto.TargetType.USER);
        request.setNamespace("namespace_3542");
        request.setResourceType(dto.GetAuthorizedResourcesDto.ResourceType.DATA);
        
        IsSuccessRespDto response = client.getTargetAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void resetPrincipalAuthenticationInfoTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ResetUserPrincipalAuthenticationInfoDto request = new ResetUserPrincipalAuthenticationInfoDto();
        request.setUserId("userId_3026");
        
        IsSuccessRespDto response = client.resetPrincipalAuthenticationInfo(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserAuthorizedAppsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserAccessibleAppsReqDto request = new GetUserAccessibleAppsReqDto();
        request.setUserId("userId_2489");
        
        AppListRespDto response = client.getUserAuthorizedApps(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserAuthorizedResourcesDto request = new GetUserAuthorizedResourcesDto();
        request.setUserId("userId_5341");
        request.setOptions(new dto.GetUserAuthorizedResourcesOptionsDto());
        
        AuthorizedResourcePaginatedRespDto response = client.getUserAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getParentDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetParentDepartmentReqDto request = new GetParentDepartmentReqDto();
        request.setDepartmentId("departmentId_4515");
        request.setOrganizationCode("organizationCode_1606");
        
        DepartmentSingleRespDto response = client.getParentDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getRoleAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        RoleAuthorizedResourcesDto request = new RoleAuthorizedResourcesDto();
        request.setCode("code_3814");
        request.setNamespace("namespace_8873");
        request.setResourceType(dto.RoleAuthorizedResourcesDto.ResourceType.DATA);
        
        IsSuccessRespDto response = client.getRoleAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    // todo 和 node js  options 不相同
    @Test
    public void listDepartmentMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListDepartmentMembersReqDto request = new ListDepartmentMembersReqDto();
        request.setDepartmentId("departmentId_277");
        request.setOrganizationCode("organizationCode_2813");
        request.setOptions(new dto.ListDepartmentMembersOptionsDto());
        
        UserListRespDto response = client.listDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserLoginHistoryTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserLoginHistoryDto request = new GetUserLoginHistoryDto();
        request.setUserId("userId_3457");

        
        UserLoginHistoryPaginatedRespDto response = client.getUserLoginHistory(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void addDepartmentMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        AddDepartmentMembersReqDto request = new AddDepartmentMembersReqDto();
        request.setDepartmentId("departmentId_8754");
        request.setOrganizationCode("organizationCode_3290");
        request.setUserIds(Collections.singletonList("String_8141"));
        
        IsSuccessRespDto response = client.addDepartmentMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserLoggedInAppsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserLoggedInAppsReqDto request = new GetUserLoggedInAppsReqDto();
        request.setUserId("userId_3940");
        
        UserLoggedInAppsListRespDto response = client.getUserLoggedInApps(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createNamespacesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateNamespacesBatchDto request = new CreateNamespacesBatchDto();
        CreateNamespacesBatchItemDto batchItemDto = new CreateNamespacesBatchItemDto();
        batchItemDto.setCode("code");
        batchItemDto.setName("name");
        batchItemDto.setDescription("description");
        
        request.setList(Collections.singletonList(batchItemDto));
        
        IsSuccessRespDto response = client.createNamespacesBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getGroupAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetGroupAuthorizedResourcesDto request = new GetGroupAuthorizedResourcesDto();
        request.setCode("code_4399");
        request.setNamespace("namespace_8742");
        request.setResourceType(dto.GetGroupAuthorizedResourcesDto.ResourceType.DATA);
        
        AuthorizedResourceListRespDto response = client.getGroupAuthorizedResources(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void listDepartmentMemberIdsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListChildrenDepartmentsReqDto request = new ListChildrenDepartmentsReqDto();
        request.setDepartmentId("departmentId_7606");
        request.setOrganizationCode("organizationCode_7740");
        
        Object response = client.listDepartmentMemberIds(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void listChildrenDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListChildrenDepartmentsReqDto request = new ListChildrenDepartmentsReqDto();
        request.setDepartmentId("departmentId_2539");
        request.setOrganizationCode("organizationCode_7457");
        
        DepartmentPaginatedRespDto response = client.listChildrenDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getManagementTokenTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetManagementAccessTokenDto request = new GetManagementAccessTokenDto();
        request.setSecret(ACCESS_KEY_SECRET);
        request.setUserPoolId(ACCESS_KEY_ID);
        
        GetManagementTokenRespDto response = client.getManagementToken(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserDto request = new GetUserDto();
        request.setUserId("userId_3620");
        GetUserOptionsDto options = new GetUserOptionsDto();
        options.setWithCustomData(true);
        request.setOptions(options);
        
        UserSingleRespDto response = client.getUser(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserBatchDto request = new GetUserBatchDto();
        request.setUserIds(Collections.singletonList("userId1"));
        request.setOptions(new dto.GetUserOptionsDto());
        
        UserListRespDto response = client.getUserBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void listUsersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListUsersDto request = new ListUsersDto();
        request.setOptions(new dto.ListUsersOptionsDto());
        
        UserPaginatedRespDto response = client.listUsers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserIdentitiesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserIdentitiesDto request = new GetUserIdentitiesDto();
        request.setUserId("userId_6454");
        
        IdentityListRespDto response = client.getUserIdentities(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    // 请求报文 todo 和 node js 不一致
    @Test
    public void listExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        TenantIdDto request = new TenantIdDto();
        request.setTenantId("tenantId_7803");
        
        ExtIdpDto response = client.listExtIdp(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateExtIdpDto request = new CreateExtIdpDto();
        request.setType(dto.CreateExtIdpDto.Type.AD);
        request.setName("name_4477");
        
        ExtIdpDto response = client.createExtIdp(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void deleteExtIdpConnTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteExtIdpConnDto request = new DeleteExtIdpConnDto();
        request.setId("id_5411");
        
        IsSuccessRespDto response = client.deleteExtIdpConn(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getNamespacesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetNamespacesBatchDto request = new GetNamespacesBatchDto();
        request.setCodeList(Collections.singletonList("namespaceCode"));
        
        NamespaceListRespDto response = client.getNamespacesBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void addGroupMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        AddGroupMembersReqDto request = new AddGroupMembersReqDto();
        request.setUserIds(Collections.singletonList("userId_6058"));
        request.setCode("code_2700");
        
        IsSuccessRespDto response = client.addGroupMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void updateNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        UpdateNamespaceDto request = new UpdateNamespaceDto();
        request.setNewCode("newCode_8733");
        request.setCode("code_7549");
        request.setDescription("description_6147");
        request.setName("name_9447");
        
        NamespaceDto response = client.updateNamespace(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    // todo 和nodejs options 不相同
    @Test
    public void listResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListResourcesDto request = new ListResourcesDto();
        request.setNamespace("namespace_5136");
        request.setType(dto.ListResourcesDto.Type.DATA);
        request.setOptions(new dto.ListResourcesOptionsDto());
        
        ResourcePaginatedRespDto response = client.listResources(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    // todo  deketeNamespace
    @Test
    public void deketeNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteNamespaceDto request = new DeleteNamespaceDto();
        request.setCode("code_8133");
        
        IsSuccessRespDto response = client.deketeNamespace(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void listArchivedUsersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListArchivedUsersDto request = new ListArchivedUsersDto();
        ListArchivedUsersOptionsDto optionsDto = new ListArchivedUsersOptionsDto();
        optionsDto.setPage(0);
        request.setOptions(optionsDto);
        
        ListArchivedUsersSingleRespDto response = client.listArchivedUsers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void listGroupMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListGroupMembersDto request = new ListGroupMembersDto();
        request.setCode("code_226");
        ListUsersOptionsDto optionsDto = new ListUsersOptionsDto();
        optionsDto.setPage(1);
        optionsDto.setLimit(10);
        optionsDto.setWithCustomData(false);
        optionsDto.setWithIdentities(false);
        optionsDto.setWithDepartmentIds(false);
        request.setOptions(optionsDto);
        
        UserListRespDto response = client.listGroupMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void setUserDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        SetUserDepartmentsDto request = new SetUserDepartmentsDto();
        SetUserDepartmentDto departmentDto = new SetUserDepartmentDto();
        departmentDto.setDepartmentId("departmentId");
        departmentDto.setIsLeader(false);
        departmentDto.setIsMainDepartment(false);
        
        request.setDepartments(Collections.singletonList(departmentDto));
        request.setUserId("userId_1869");
        
        IsSuccessRespDto response = client.setUserDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserMfaInfoTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserMfaInfoDto request = new GetUserMfaInfoDto();
        request.setUserId("userId_5113");
        
        UserMfaSingleRespDto response = client.getUserMfaInfo(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void updateUserTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        UpdateUserReqDto request = new UpdateUserReqDto();
        request.setPhoneVerified(Boolean.TRUE);
        request.setEmailVerified(Boolean.TRUE);
        request.setGender(dto.UpdateUserReqDto.Gender.M);
        request.setUserId("userId_1159");
        request.setPhoneCountryCode("phoneCountryCode_9440");
        request.setName("name_884");
        request.setNickname("nickname_928");
        request.setPhoto("photo_3166");
        request.setExternalId("externalId_3078");
        request.setCustomData(new ArrayList<>());
        request.setUsername("username_8818");
        request.setEmail("email_8988");
        request.setPhone("phone_4026");
        request.setPassword("password_1683");
        
        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void updateGroupTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        UpdateGroupReqDto request = new UpdateGroupReqDto();
        request.setNewCode("newCode_1472");
        request.setDescription("description_1311");
        request.setName("name_9219");
        request.setCode("code_505");
        
        GroupSingleRespDto response = client.updateGroup(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createGroupBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateGroupBatchReqDto request = new CreateGroupBatchReqDto();
        CreateGroupReqDto createGroupReqDto = new CreateGroupReqDto();
        createGroupReqDto.setDescription("description");
        createGroupReqDto.setName("name");
        createGroupReqDto.setCode("code");
        
        request.setList(Collections.singletonList(createGroupReqDto));
        
        GroupListRespDto response = client.createGroupBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void isUserExistsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        IsUserExistsReqDto request = new IsUserExistsReqDto();
        request.setUsername("bob");
        request.setEmail("test@example.com");
        request.setPhone("176xxxx6754");
        request.setExternalId("10010");
        
        IsUserExistsRespDto response = client.isUserExists(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void revokeRoleBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        RevokeRoleBatchDto request = new RevokeRoleBatchDto();
        TargetDto targetDto = new TargetDto();
        targetDto.setTargetType(dto.TargetDto.TargetType.USER);
        targetDto.setTargetIdentifier("userId");
        request.setTargets(Collections.singletonList(targetDto));
    
        RoleCodeDto roleCodeDto = new RoleCodeDto();
        roleCodeDto.setCode("roleCode");
        roleCodeDto.setNamespace("namespace");
        request.setRoles(Collections.singletonList(roleCodeDto));
        
        IsSuccessRespDto response = client.revokeRoleBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetExtIdpDto request = new GetExtIdpDto();
        request.setId("id_2404");
        request.setTenantId("tenantId_879");
        
        ExtIdpDto response = client.getExtIdp(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getGroupTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetGroupDto request = new GetGroupDto();
        request.setCode("code_2640");
        
        GroupSingleRespDto response = client.getGroup(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getCustomFieldsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserDefinedFieldsDto request = new GetUserDefinedFieldsDto();
        request.setTargetType(dto.GetUserDefinedFieldsDto.TargetType.USER);
        
        CustomFieldListRespDto response = client.getCustomFields(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateResourceDto request = new CreateResourceDto();
        ResourceAction action = new ResourceAction();
        action.setName("资源操作名称");
        action.setDescription("资源操作描述");
        
        request.setActions(Collections.singletonList(action));
        request.setType(CreateResourceDto.Type.API);
        request.setCode("code_7255");
        request.setDescription("description_7391");
        request.setApiIdentifier("apiIdentifier_5892");
        request.setNamespace("namespace_9890");
        
        ResourceRespDto response = client.createResource(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void kickUsersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        KickUsersDto request = new KickUsersDto();
        request.setAppIds(Collections.singletonList("appId_3142"));
        request.setUserId("userId_2332");
        
        IsUserExistsRespDto response = client.kickUsers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    // todo 和 node js 不一致
    @Test
    public void createExtIdpConnTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateExtIdpConnDto request = new CreateExtIdpConnDto();
        request.setFields(new ArrayList<>());
        request.setLogo("logo_6175");
        request.setIdentifier("identifier_5418");
        request.setType(dto.CreateExtIdpConnDto.Type.OIDC);
        request.setExtIdpId("extIdpId_8071");
        request.setDisplayName("displayName_8913");
        
        ExtIdpConnDetail response = client.createExtIdpConn(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getResourcesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetResourcesBatchDto request = new GetResourcesBatchDto();
        request.setCodeList(Collections.singletonList("resourceCode"));
        request.setNamespace("namespace_34");
        
        ResourceListRespDto response = client.getResourcesBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void listOrganizationsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListOrganizationsReqDto request = new ListOrganizationsReqDto();
        ListOptionsDto optionsDto = new ListOptionsDto();
        optionsDto.setPage(1);
        optionsDto.setLimit(10);
        
        request.setOptions(optionsDto);
        
        OrganizationPaginatedRespDto response = client.listOrganizations(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void updateExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        UpdateExtIdpDto request = new UpdateExtIdpDto();
        request.setId("id_9047");
        request.setName("name_2992");
        
        ExtIdpDto response = client.updateExtIdp(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void deleteGroupsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteGroupsReqDto request = new DeleteGroupsReqDto();
        request.setCodeList(Collections.singletonList("code"));
        
        IsSuccessRespDto response = client.deleteGroups(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void deleteDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteDepartmentReqDto request = new DeleteDepartmentReqDto();
        request.setOrganizationCode("organizationCode_129");
        request.setDepartmentId("departmentId_7122");
        
        IsSuccessRespDto response = client.deleteDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void deleteUserBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteUsersBatchDto request = new DeleteUsersBatchDto();
        request.setUserIds(Collections.singletonList("userId_4186"));
        
        IsSuccessRespDto response = client.deleteUserBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void updateRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        UpdateRoleDto request = new UpdateRoleDto();
        request.setNewCode("newCode_8489");
        request.setCode("code_3146");
        request.setNamespace("namespace_993");
        request.setDescription("description_6745");
        
        IsSuccessRespDto response = client.updateRole(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void setCustomFieldsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        SetCustomFieldsReqDto request = new SetCustomFieldsReqDto();
        SetCustomFieldDto fieldDto = new SetCustomFieldDto();
        fieldDto.setTargetType(TargetType.USER);
        fieldDto.setDataType(DataType.STRING);
        fieldDto.setKey("key");
        fieldDto.setLabel("label");
        fieldDto.setDescription("description");
        fieldDto.setEncrypted(false);
        CustomFieldSelectOption option = new CustomFieldSelectOption();
        option.setValue("value");
        option.setLabel("label");
        fieldDto.setOptions(Collections.singletonList(option));
        
        request.setList(Collections.singletonList(fieldDto));
        
        CustomFieldListRespDto response = client.setCustomFields(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserRolesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserRolesDto request = new GetUserRolesDto();
        request.setUserId("userId_7589");
        request.setNamespace("namespace_9855");
        
        RolePaginatedRespDto response = client.getUserRoles(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserDepartmentsDto request = new GetUserDepartmentsDto();
        request.setUserId("userId_6499");
        
        UserDepartmentPaginatedRespDto response = client.getUserDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void assignRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        AssignRoleDto request = new AssignRoleDto();
        TargetDto targetDto = new TargetDto();
        targetDto.setTargetType(dto.TargetDto.TargetType.USER);
        targetDto.setTargetIdentifier("userId");
        request.setTargets(Collections.singletonList(targetDto));
        request.setCode("code_6287");
        request.setNamespace("namespace_7540");
        
        IsSuccessRespDto response = client.assignRole(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateRoleDto request = new CreateRoleDto();
        request.setCode("code_5149");
        request.setNamespace("namespace_4680");
        request.setDescription("description_7657");
        
        RoleSingleRespDto response = client.createRole(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void deleteRolesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteRoleDto request = new DeleteRoleDto();
        request.setCodeList(Collections.singletonList("roleCode_2663"));
        request.setNamespace("namespace_2045");
        
        IsSuccessRespDto response = client.deleteRoles(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getGroupListTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListGroupsDto request = new ListGroupsDto();
        ListOptionsDto optionsDto = new ListOptionsDto();
        optionsDto.setPage(1);
        optionsDto.setLimit(10);
        request.setOptions(optionsDto);
        
        GroupPaginatedRespDto response = client.getGroupList(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    // todo options 和 node js 不一样
    @Test
    public void listRoleMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListRoleMemberDto request = new ListRoleMemberDto();
        request.setCode("code_3671");
        request.setNamespace("namespace_4639");
        request.setOptions(new dto.ListRoleMemberOptionsDto());
        
        UserListRespDto response = client.listRoleMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    @Test
    public void createRolesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        // todo 这个接口有问题
    
        CreateRolesBatch request = new CreateRolesBatch();
        request.setList(Collections.singletonList("String_7568"));
        
        IsSuccessRespDto response = client.createRolesBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createUserTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateUserReqDto request = new CreateUserReqDto();
        request.setStatus(dto.CreateUserReqDto.Status.DELETED);
        request.setEmail("email_1004");
        request.setPhone("phone_8288");
        request.setPhoneCountryCode("phoneCountryCode_5145");
        request.setUsername("username_177");
        request.setName("name_3363");
        request.setNickname("nickname_3404");
        request.setPhoto("photo_3306");
        request.setGender(dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setExternalId("externalId_4365");
        request.setDepartmentIds(Collections.singletonList("String_3157"));
        request.setCustomData(new ArrayList<>());
        request.setPassword("password_3398");
        request.setTenantIds(Collections.singletonList("String_4188"));
        request.setIdentities(Collections.singletonList(new dto.CreateIdentityDto()));
        request.setOptions(new dto.CreateUserOptionsDto());
        
        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createOrganizationTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateOrganizationReqDto request = new CreateOrganizationReqDto();
        request.setOrganizationName("organizationName_4617");
        request.setOrganizationCode("organizationCode_6183");
        
        OrganizationSingleRespDto response = client.createOrganization(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void deleteOrganizationTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteOrganizationReqDto request = new DeleteOrganizationReqDto();
        request.setOrganizationCode("organizationCode_3219");
        
        IsSuccessRespDto response = client.deleteOrganization(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void removeGroupMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        RemoveGroupMembersReqDto request = new RemoveGroupMembersReqDto();
        request.setUserIds(Collections.singletonList("userId_1873"));
        request.setCode("code_9662");
        
        IsSuccessRespDto response = client.removeGroupMembers(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void updateDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        UpdateDepartmentReqDto request = new UpdateDepartmentReqDto();
        request.setOrganizationCode("organizationCode_3801");
        request.setName("name_4074");
        request.setParentDepartmentId("parentDepartmentId_4788");
        request.setDepartmentId("departmentId_4056");
        request.setCode("code_2892");
        request.setLeaderUserId("leaderUserId_8066");
        
        DepartmentSingleRespDto response = client.updateDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserCustomDataTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserCustomDataDto request = new GetUserCustomDataDto();
        request.setUserId("userId_9740");
        
        Object response = client.getUserCustomData(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void searchDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        SearchDepartmentsReqDto request = new SearchDepartmentsReqDto();
        request.setSearch("keywords_3224");
        request.setOrganizationCode("organizationCode_2018");
        
        DepartmentListRespDto response = client.searchDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void deleteExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteExtIdpDto request = new DeleteExtIdpDto();
        request.setId("id_8119");
        
        ExtIdpDto response = client.deleteExtIdp(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    // todo 和node js 不一致
    @Test
    public void updateExtIdpConnTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        UpdateExtIdpConnDto request = new UpdateExtIdpConnDto();
        request.setLoginOnly(Boolean.TRUE);
        request.setAssociationMode("associationMode_7159");
        request.setLogo("logo_4835");
        request.setFields(new ArrayList<>());
        request.setDisplayName("displayName_3040");
        request.setId("id_410");
        
        ExtIdpConnDetail response = client.updateExtIdpConn(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void changeConnStateTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        EnableExtIdpConnDto request = new EnableExtIdpConnDto();
        request.setAppId("appId_4811");
        request.setEnabled(Boolean.TRUE);
        request.setId("id_5285");
        
        IsSuccessRespDto response = client.changeConnState(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createUserBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateUserBatchReqDto request = new CreateUserBatchReqDto();
        CreateUserInfoDto createUserInfoDto = new CreateUserInfoDto();
        createUserInfoDto.setEmail("test@example.com");
        createUserInfoDto.setPhone("176xxxx6754");
        createUserInfoDto.setUsername("bob");
        request.setList(Collections.singletonList(createUserInfoDto));
        request.setOptions(new dto.CreateUserOptionsDto());
        
        UserListRespDto response = client.createUserBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void assignRoleBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        AssignRoleBatchDto request = new AssignRoleBatchDto();
        TargetDto targetDto = new TargetDto();
        targetDto.setTargetType(dto.TargetDto.TargetType.USER);
        targetDto.setTargetIdentifier("userId");
        request.setTargets(Collections.singletonList(targetDto));
    
        RoleCodeDto roleCodeDto = new RoleCodeDto();
        roleCodeDto.setCode("roleCode");
        roleCodeDto.setNamespace("namespace");
        request.setRoles(Collections.singletonList(roleCodeDto));
        
        IsSuccessRespDto response = client.assignRoleBatch(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void updateResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        UpdateResourceDto request = new UpdateResourceDto();
        request.setActions(Collections.singletonList(new dto.ResourceAction()));
        request.setType(dto.UpdateResourceDto.Type.DATA);
        request.setCode("code_2154");
        request.setDescription("description_4894");
        request.setApiIdentifier("apiIdentifier_3676");
        request.setNamespace("namespace_5502");
        
        ResourceRespDto response = client.updateResource(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void revokeRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        RevokeRoleDto request = new RevokeRoleDto();
        TargetDto targetDto = new TargetDto();
        targetDto.setTargetType(dto.TargetDto.TargetType.USER);
        targetDto.setTargetIdentifier("userId");
        
        request.setTargets(Collections.singletonList(targetDto));
        request.setCode("code_5471");
        request.setNamespace("namespace_4537");
        
        IsSuccessRespDto response = client.revokeRole(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void setUserCustomDataTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        SetUserCustomDataDto request = new SetUserCustomDataDto();
        request.setSuccess(Boolean.TRUE);
        
        SetUserCustomDataRespDto response = client.setUserCustomData(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void deleteResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        DeleteResourceDto request = new DeleteResourceDto();
        request.setCode("code_3265");
        request.setNamespace("namespace_4814");
        
        IsSuccessRespDto response = client.deleteResource(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getUserGroupsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetUserGroupsDto request = new GetUserGroupsDto();
        request.setUserId("userId_7544");
        
        GroupPaginatedRespDto response = client.getUserGroups(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetRoleDto request = new GetRoleDto();
        request.setCode("code_7868");
        request.setNamespace("namespace_2080");
        
        RoleSingleRespDto response = client.getRole(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateNamespaceDto request = new CreateNamespaceDto();
        request.setCode("code_7426");
        request.setName("name_5618");
        request.setDescription("description_14");
        
        ResourceDto response = client.createNamespace(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    // todo listRoleDepartment 少个 s
    // todo 分页 option 和 node js 不一样
    @Test
    public void listDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListRoleDepartmentDto request = new ListRoleDepartmentDto();
        request.setCode("code_2453");
        request.setNamespace("namespace_145");
        request.setOptions(new dto.ListRoleDepartmentOptionsDto());
        
        UserListRespDto response = client.listDepartments(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void listRolesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        ListRoleDto request = new ListRoleDto();
        request.setNamespace("namespace_5930");
        ListRoleOptionsDto optionsDto = new ListRoleOptionsDto();
        optionsDto.setPage(1);
        optionsDto.setLimit(10);
        request.setOptions(optionsDto);
        RolePaginatedRespDto response = client.listRoles(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createGroupTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateGroupReqDto request = new CreateGroupReqDto();
        request.setDescription("description_5179");
        request.setName("name_5910");
        request.setCode("code_9449");
        
        GroupSingleRespDto response = client.createGroup(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void updateOrganizationTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        UpdateOrganizationReqDto request = new UpdateOrganizationReqDto();
        request.setOrganizationCode("organizationCode_1688");
        request.setOrganizationNewCode("organizationNewCode_9065");
        request.setOrganizationName("organizationName_6148");
        
        OrganizationSingleRespDto response = client.updateOrganization(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void getDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        GetDepartmentReqDto request = new GetDepartmentReqDto();
        request.setDepartmentId("departmentId_1688");
        request.setOrganizationCode("organizationCode_1485");
        
        DepartmentSingleRespDto response = client.getDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void createDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        CreateDepartmentReqDto request = new CreateDepartmentReqDto();
        request.setOrganizationCode("organizationCode_3196");
        request.setName("name_6104");
        request.setParentDepartmentId("parentDepartmentId_5218");
        request.setCode("code_6613");
        request.setLeaderUserId("leaderUserId_897");
        
        DepartmentSingleRespDto response = client.createDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
    
    
    @Test
    public void authorizeResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);
        clientOptions.setHost(HOST);
        
        AuthorizeResourcesDto request = new AuthorizeResourcesDto();
        AuthorizeResourceItem resourceItem = new AuthorizeResourceItem();
        resourceItem.setTargetType(dto.AuthorizeResourceItem.TargetType.USER);
        resourceItem.setTargetIdentifiers(Collections.singletonList("userId"));
        
        ResourceItemDto item = new ResourceItemDto();
        item.setCode("code");
        item.setActions(Collections.singletonList("action"));
        item.setResourceType(ResourceType.DATA);
        resourceItem.setResources(Collections.singletonList(item));
        
        request.setList(Collections.singletonList(resourceItem));
        request.setNamespace("namespace_5252");
        
        IsSuccessRespDto response = client.authorizeResources(request);
        System.out.println(JsonUtils.serialize(response));
    }
    
    
    
}