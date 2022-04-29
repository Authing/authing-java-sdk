import client.ManagementClient;
import dto.*;
import model.ManagementClientOptions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;


public class ManagementClientTest {

    @Test
    public void getResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetResourceDto request = new GetResourceDto();
        request.setCode("code_8295");
        request.setNamespace("namespace_7158");

        ResourceRespDto response = client.getResource(request);
    }


    @Test
    public void getNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetNamespaceDto request = new GetNamespaceDto();
        request.setCode("code_7475");

        NamespaceRespDto response = client.getNamespace(request);
    }


    @Test
    public void hasAnyRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        HasAnyRoleDto request = new HasAnyRoleDto();
        request.setHasAnyRole(Boolean.TRUE);

        HasAnyRoleRespDto response = client.hasAnyRole(request);
    }


    @Test
    public void getUserMfaInfoTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserMfaInfoDto request = new GetUserMfaInfoDto();
        request.setUserId("userId_1167");

        UserMfaSingleRespDto response = client.getUserMfaInfo(request);
    }


    @Test
    public void createUserTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateUserReqDto request = new CreateUserReqDto();
        request.setStatus(dto.CreateUserReqDto.Status.DELETED);
        request.setEmail("email_4403");
        request.setPhone("phone_2780");
        request.setPhoneCountryCode("phoneCountryCode_9194");
        request.setUsername("username_5398");
        request.setName("name_4629");
        request.setNickname("nickname_1706");
        request.setPhoto("photo_7864");
        request.setGender(dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setExternalId("externalId_3500");
        request.setDepartmentIds(Collections.singletonList("String_2116"));
        request.setCustomData(new ArrayList<>());
        request.setPassword("password_9284");
        request.setTenantIds(Collections.singletonList("String_5260"));
        request.setIdentities(Collections.singletonList(new dto.CreateIdentityDto()));
        request.setOptions(new dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
    }


    @Test
    public void getGroupTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetGroupDto request = new GetGroupDto();
        request.setCode("code_3585");

        GroupSingleRespDto response = client.getGroup(request);
    }


    @Test
    public void getUserTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserDto request = new GetUserDto();
        request.setUserId("userId_2108");
        request.setOptions(new dto.GetUserOptionsDto());

        UserSingleRespDto response = client.getUser(request);
    }


    @Test
    public void createGroupTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateGroupReqDto request = new CreateGroupReqDto();
        request.setDescription("description_1413");
        request.setName("name_9163");
        request.setCode("code_535");

        GroupSingleRespDto response = client.createGroup(request);
    }


    @Test
    public void getManagementTokenTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetManagementAccessTokenDto request = new GetManagementAccessTokenDto();
        request.setSecret("secret_8820");
        request.setUserPoolId("userPoolId_7968");

        GetManagementTokenRespDto response = client.getManagementToken(request);
    }


    @Test
    public void getUserIdentitiesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserIdentitiesDto request = new GetUserIdentitiesDto();
        request.setUserId("userId_7647");

        IdentityListRespDto response = client.getUserIdentities(request);
    }


    @Test
    public void listUsersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListUsersDto request = new ListUsersDto();
        request.setOptions(new dto.ListUsersOptionsDto());

        UserPaginatedRespDto response = client.listUsers(request);
    }


    @Test
    public void setUserCustomDataTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        SetUserCustomDataDto request = new SetUserCustomDataDto();
        request.setSuccess(Boolean.TRUE);

        SetUserCustomDataRespDto response = client.setUserCustomData(request);
    }


    @Test
    public void getUserDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserDepartmentsDto request = new GetUserDepartmentsDto();
        request.setUserId("userId_7458");

        UserDepartmentPaginatedRespDto response = client.getUserDepartments(request);
    }


    @Test
    public void setUserDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        SetUserDepartmentsDto request = new SetUserDepartmentsDto();
        request.setDepartments(Collections.singletonList(new dto.SetUserDepartmentDto()));
        request.setUserId("userId_9327");

        IsSuccessRespDto response = client.setUserDepartment(request);
    }


    @Test
    public void listArchivedUsersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListArchivedUsersDto request = new ListArchivedUsersDto();
        request.setOptions(new dto.ListArchivedUsersOptionsDto());

        ListArchivedUsersSingleRespDto response = client.listArchivedUsers(request);
    }


    @Test
    public void isUserExistsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        IsUserExistsReqDto request = new IsUserExistsReqDto();
        request.setUsername("username_6080");
        request.setEmail("email_3662");
        request.setPhone("phone_9850");
        request.setExternalId("externalId_8362");

        IsUserExistsRespDto response = client.isUserExists(request);
    }


    @Test
    public void getGroupListTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListGroupsDto request = new ListGroupsDto();
        request.setOptions(new dto.ListOptionsDto());

        GroupPaginatedRespDto response = client.getGroupList(request);
    }


    @Test
    public void createGroupBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateGroupBatchReqDto request = new CreateGroupBatchReqDto();
        request.setList(Collections.singletonList(new dto.CreateGroupReqDto()));

        GroupListRespDto response = client.createGroupBatch(request);
    }


    @Test
    public void updateGroupTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateGroupReqDto request = new UpdateGroupReqDto();
        request.setNewCode("newCode_6943");
        request.setDescription("description_5606");
        request.setName("name_3054");
        request.setCode("code_7668");

        GroupSingleRespDto response = client.updateGroup(request);
    }


    @Test
    public void kickUsersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        KickUsersDto request = new KickUsersDto();
        request.setAppIds(Collections.singletonList("String_9047"));
        request.setUserId("userId_4585");

        IsUserExistsRespDto response = client.kickUsers(request);
    }


    @Test
    public void getUserBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserBatchDto request = new GetUserBatchDto();
        request.setUserIds(Collections.singletonList("String_5955"));
        request.setOptions(new dto.GetUserOptionsDto());

        UserListRespDto response = client.getUserBatch(request);
    }


    @Test
    public void deleteGroupsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteGroupsReqDto request = new DeleteGroupsReqDto();
        request.setCodeList(Collections.singletonList("String_614"));

        IsSuccessRespDto response = client.deleteGroups(request);
    }


    @Test
    public void addGroupMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AddGroupMembersReqDto request = new AddGroupMembersReqDto();
        request.setUserIds(Collections.singletonList("String_5481"));
        request.setCode("code_7810");

        IsSuccessRespDto response = client.addGroupMembers(request);
    }


    @Test
    public void deleteUserBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteUsersBatchDto request = new DeleteUsersBatchDto();
        request.setUserIds(Collections.singletonList("String_9504"));

        IsSuccessRespDto response = client.deleteUserBatch(request);
    }


    @Test
    public void getUserCustomDataTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserCustomDataDto request = new GetUserCustomDataDto();
        request.setUserId("userId_2405");

        Object response = client.getUserCustomData(request);
    }


    @Test
    public void createUserBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateUserBatchReqDto request = new CreateUserBatchReqDto();
        request.setList(Collections.singletonList(new dto.CreateUserInfoDto()));
        request.setOptions(new dto.CreateUserOptionsDto());

        UserListRespDto response = client.createUserBatch(request);
    }


    @Test
    public void updateUserTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateUserReqDto request = new UpdateUserReqDto();
        request.setPhoneVerified(Boolean.TRUE);
        request.setEmailVerified(Boolean.TRUE);
        request.setGender(dto.UpdateUserReqDto.Gender.M);
        request.setUserId("userId_8759");
        request.setPhoneCountryCode("phoneCountryCode_2632");
        request.setName("name_8836");
        request.setNickname("nickname_8068");
        request.setPhoto("photo_910");
        request.setExternalId("externalId_4907");
        request.setCustomData(new ArrayList<>());
        request.setUsername("username_4629");
        request.setEmail("email_8836");
        request.setPhone("phone_5325");
        request.setPassword("password_4642");

        UserSingleRespDto response = client.updateUser(request);
    }


    @Test
    public void removeGroupMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        RemoveGroupMembersReqDto request = new RemoveGroupMembersReqDto();
        request.setUserIds(Collections.singletonList("String_1803"));
        request.setCode("code_1753");

        IsSuccessRespDto response = client.removeGroupMembers(request);
    }


    @Test
    public void getUserRolesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserRolesDto request = new GetUserRolesDto();
        request.setUserId("userId_5069");
        request.setNamespace("namespace_4733");

        RolePaginatedRespDto response = client.getUserRoles(request);
    }


    @Test
    public void getUserGroupsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserGroupsDto request = new GetUserGroupsDto();
        request.setUserId("userId_9644");

        GroupPaginatedRespDto response = client.getUserGroups(request);
    }


    @Test
    public void getExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetExtIdpDto request = new GetExtIdpDto();
        request.setId("id_2458");
        request.setTenantId("tenantId_9356");

        ExtIdpDto response = client.getExtIdp(request);
    }


    @Test
    public void createExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateExtIdpDto request = new CreateExtIdpDto();
        request.setType(dto.CreateExtIdpDto.Type.OIDC);
        request.setName("name_7749");
        request.setTenantId("tenantId_4720");

        ExtIdpDto response = client.createExtIdp(request);
    }


    @Test
    public void changeConnStateTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        EnableExtIdpConnDto request = new EnableExtIdpConnDto();
        request.setTenantId("tenantId_7234");
        request.setAppId("appId_6867");
        request.setEnabled(Boolean.TRUE);
        request.setId("id_1530");

        IsSuccessRespDto response = client.changeConnState(request);
    }


    @Test
    public void assignRoleBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AssignRoleBatchDto request = new AssignRoleBatchDto();
        request.setTargets(Collections.singletonList(new dto.TargetDto()));
        request.setRoles(Collections.singletonList(new dto.RoleCodeDto()));

        IsSuccessRespDto response = client.assignRoleBatch(request);
    }


    @Test
    public void listRolesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListRoleDto request = new ListRoleDto();
        request.setNamespace("namespace_6974");
        request.setOptions(new dto.ListRoleOptionsDto());

        RolePaginatedRespDto response = client.listRoles(request);
    }


    @Test
    public void deleteDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteDepartmentReqDto request = new DeleteDepartmentReqDto();
        request.setOrganizationCode("organizationCode_7494");
        request.setDepartmentId("departmentId_2276");

        IsSuccessRespDto response = client.deleteDepartment(request);
    }


    @Test
    public void updateRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateRoleDto request = new UpdateRoleDto();
        request.setNewCode("newCode_2208");
        request.setCode("code_2229");
        request.setNamespace("namespace_7739");
        request.setDescription("description_451");

        IsSuccessRespDto response = client.updateRole(request);
    }


    @Test
    public void authorizeResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AuthorizeResourcesDto request = new AuthorizeResourcesDto();
        request.setList(Collections.singletonList(new dto.AuthorizeResourceItem()));
        request.setNamespace("namespace_3572");

        IsSuccessRespDto response = client.authorizeResources(request);
    }


    @Test
    public void deleteOrganizationTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteOrganizationReqDto request = new DeleteOrganizationReqDto();
        request.setOrganizationCode("organizationCode_8304");

        IsSuccessRespDto response = client.deleteOrganization(request);
    }


    @Test
    public void createNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateNamespaceDto request = new CreateNamespaceDto();
        request.setCode("code_6833");
        request.setName("name_970");
        request.setDescription("description_9601");

        ResourceDto response = client.createNamespace(request);
    }


    @Test
    public void getDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetDepartmentReqDto request = new GetDepartmentReqDto();
        request.setDepartmentId("departmentId_3532");
        request.setOrganizationCode("organizationCode_3557");

        DepartmentSingleRespDto response = client.getDepartment(request);
    }


    @Test
    public void getRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetRoleDto request = new GetRoleDto();
        request.setCode("code_5331");
        request.setNamespace("namespace_720");

        RoleSingleRespDto response = client.getRole(request);
    }


    @Test
    public void assignRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AssignRoleDto request = new AssignRoleDto();
        request.setTargets(Collections.singletonList(new dto.TargetDto()));
        request.setCode("code_9876");
        request.setNamespace("namespace_4701");

        IsSuccessRespDto response = client.assignRole(request);
    }


    @Test
    public void revokeRoleBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        RevokeRoleBatchDto request = new RevokeRoleBatchDto();
        request.setTargets(Collections.singletonList(new dto.TargetDto()));
        request.setRoles(Collections.singletonList(new dto.RoleCodeDto()));

        IsSuccessRespDto response = client.revokeRoleBatch(request);
    }


    @Test
    public void listRoleMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListRoleMemberDto request = new ListRoleMemberDto();
        request.setCode("code_8953");
        request.setNamespace("namespace_5027");
        request.setOptions(new dto.ListRoleMemberOptionsDto());

        UserListRespDto response = client.listRoleMembers(request);
    }


    @Test
    public void createRolesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateRolesBatch request = new CreateRolesBatch();
        request.setList(Collections.singletonList("String_4031"));

        IsSuccessRespDto response = client.createRolesBatch(request);
    }


    @Test
    public void listGroupMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListGroupMembersDto request = new ListGroupMembersDto();
        request.setCode("code_940");
        request.setOptions(new dto.ListUsersOptionsDto());

        UserListRespDto response = client.listGroupMembers(request);
    }


    @Test
    public void createDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateDepartmentReqDto request = new CreateDepartmentReqDto();
        request.setOrganizationCode("organizationCode_8774");
        request.setName("name_1127");
        request.setParentDepartmentId("parentDepartmentId_6895");
        request.setCode("code_5254");
        request.setLeaderUserId("leaderUserId_8526");

        DepartmentSingleRespDto response = client.createDepartment(request);
    }


    @Test
    public void searchDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        SearchDepartmentsReqDto request = new SearchDepartmentsReqDto();
        request.setSearch("search_3036");
        request.setOrganizationCode("organizationCode_8149");

        DepartmentListRespDto response = client.searchDepartments(request);
    }


    @Test
    public void revokeRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        RevokeRoleDto request = new RevokeRoleDto();
        request.setTargets(Collections.singletonList(new dto.TargetDto()));
        request.setCode("code_1483");
        request.setNamespace("namespace_3425");

        IsSuccessRespDto response = client.revokeRole(request);
    }


    @Test
    public void listDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListRoleDepartmentDto request = new ListRoleDepartmentDto();
        request.setCode("code_3547");
        request.setNamespace("namespace_8835");
        request.setOptions(new dto.ListRoleDepartmentOptionsDto());

        UserListRespDto response = client.listDepartments(request);
    }


    @Test
    public void createRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateRoleDto request = new CreateRoleDto();
        request.setCode("code_3630");
        request.setNamespace("namespace_5427");
        request.setDescription("description_8846");

        RoleSingleRespDto response = client.createRole(request);
    }


    @Test
    public void deleteRolesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteRoleDto request = new DeleteRoleDto();
        request.setCodeList(Collections.singletonList("String_4001"));
        request.setNamespace("namespace_6949");

        IsSuccessRespDto response = client.deleteRoles(request);
    }


    @Test
    public void listExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        TenantIdDto request = new TenantIdDto();
        request.setTenantId("tenantId_5294");

        ExtIdpDto response = client.listExtIdp(request);
    }


    @Test
    public void updateExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateExtIdpDto request = new UpdateExtIdpDto();
        request.setId("id_5216");
        request.setName("name_5707");

        ExtIdpDto response = client.updateExtIdp(request);
    }


    @Test
    public void deleteExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteExtIdpDto request = new DeleteExtIdpDto();
        request.setId("id_4392");

        ExtIdpDto response = client.deleteExtIdp(request);
    }


    @Test
    public void deleteExtIdpConnTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteExtIdpConnDto request = new DeleteExtIdpConnDto();
        request.setId("id_1457");

        IsSuccessRespDto response = client.deleteExtIdpConn(request);
    }


    @Test
    public void listOrganizationsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListOrganizationsReqDto request = new ListOrganizationsReqDto();
        request.setOptions(new dto.ListOptionsDto());

        OrganizationPaginatedRespDto response = client.listOrganizations(request);
    }


    @Test
    public void createExtIdpConnTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateExtIdpConnDto request = new CreateExtIdpConnDto();
        request.setFields(new ArrayList<>());
        request.setLogo("logo_8019");
        request.setIdentifier("identifier_6307");
        request.setType(dto.CreateExtIdpConnDto.Type.OIDC);
        request.setExtIdpId("extIdpId_1151");
        request.setDisplayName("displayName_5088");

        ExtIdpConnDetail response = client.createExtIdpConn(request);
    }


    @Test
    public void createResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateResourceDto request = new CreateResourceDto();
        request.setActions(Collections.singletonList(new dto.ResourceAction()));
        request.setType(dto.CreateResourceDto.Type.DATA);
        request.setCode("code_9703");
        request.setDescription("description_6367");
        request.setApiIdentifier("apiIdentifier_901");
        request.setNamespace("namespace_1194");

        ResourceRespDto response = client.createResource(request);
    }


    @Test
    public void updateExtIdpConnTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateExtIdpConnDto request = new UpdateExtIdpConnDto();
        request.setLoginOnly(Boolean.TRUE);
        request.setAssociationMode("associationMode_8555");
        request.setLogo("logo_8760");
        request.setFields(new ArrayList<>());
        request.setDisplayName("displayName_1059");
        request.setId("id_6145");

        ExtIdpConnDetail response = client.updateExtIdpConn(request);
    }


    @Test
    public void getCustomFieldsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserDefinedFieldsDto request = new GetUserDefinedFieldsDto();
        request.setTargetType(dto.GetUserDefinedFieldsDto.TargetType.USER);

        CustomFieldListRespDto response = client.getCustomFields(request);
    }


    @Test
    public void getResourcesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetResourcesBatchDto request = new GetResourcesBatchDto();
        request.setCodeList(Collections.singletonList("String_1018"));
        request.setNamespace("namespace_4022");

        ResourceListRespDto response = client.getResourcesBatch(request);
    }


    @Test
    public void updateResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateResourceDto request = new UpdateResourceDto();
        request.setActions(Collections.singletonList(new dto.ResourceAction()));
        request.setType(dto.UpdateResourceDto.Type.DATA);
        request.setCode("code_7256");
        request.setDescription("description_981");
        request.setApiIdentifier("apiIdentifier_9302");
        request.setNamespace("namespace_766");

        ResourceRespDto response = client.updateResource(request);
    }


    @Test
    public void deketeNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteNamespaceDto request = new DeleteNamespaceDto();
        request.setCode("code_1234");

        IsSuccessRespDto response = client.deketeNamespace(request);
    }


    @Test
    public void listResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListResourcesDto request = new ListResourcesDto();
        request.setNamespace("namespace_6005");
        request.setType(dto.ListResourcesDto.Type.DATA);
        request.setOptions(new dto.ListResourcesOptionsDto());

        ResourcePaginatedRespDto response = client.listResources(request);
    }


    @Test
    public void createOrganizationTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateOrganizationReqDto request = new CreateOrganizationReqDto();
        request.setOrganizationName("organizationName_7543");
        request.setOrganizationCode("organizationCode_4146");

        OrganizationSingleRespDto response = client.createOrganization(request);
    }


    @Test
    public void updateOrganizationTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateOrganizationReqDto request = new UpdateOrganizationReqDto();
        request.setOrganizationCode("organizationCode_7986");
        request.setOrganizationNewCode("organizationNewCode_1488");
        request.setOrganizationName("organizationName_6599");

        OrganizationSingleRespDto response = client.updateOrganization(request);
    }


    @Test
    public void updateDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateDepartmentReqDto request = new UpdateDepartmentReqDto();
        request.setOrganizationCode("organizationCode_6484");
        request.setName("name_752");
        request.setParentDepartmentId("parentDepartmentId_8269");
        request.setDepartmentId("departmentId_9135");
        request.setCode("code_2688");
        request.setLeaderUserId("leaderUserId_7424");

        DepartmentSingleRespDto response = client.updateDepartment(request);
    }


    @Test
    public void setCustomFieldsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        SetCustomFieldsReqDto request = new SetCustomFieldsReqDto();
        request.setList(Collections.singletonList(new dto.SetCustomFieldDto()));

        CustomFieldListRespDto response = client.setCustomFields(request);
    }


    @Test
    public void getNamespacesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetNamespacesBatchDto request = new GetNamespacesBatchDto();
        request.setCodeList(Collections.singletonList("String_4156"));

        NamespaceListRespDto response = client.getNamespacesBatch(request);
    }


    @Test
    public void updateNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateNamespaceDto request = new UpdateNamespaceDto();
        request.setNewCode("newCode_878");
        request.setCode("code_5972");
        request.setDescription("description_783");
        request.setName("name_9802");

        NamespaceDto response = client.updateNamespace(request);
    }


    @Test
    public void deleteResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteResourceDto request = new DeleteResourceDto();
        request.setCode("code_4413");
        request.setNamespace("namespace_3713");

        IsSuccessRespDto response = client.deleteResource(request);
    }


    @Test
    public void removeDepartmentMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AddDepartmentMembersReqDto request = new AddDepartmentMembersReqDto();
        request.setDepartmentId("departmentId_3042");
        request.setOrganizationCode("organizationCode_7593");
        request.setUserIds(Collections.singletonList("String_738"));

        IsSuccessRespDto response = client.removeDepartmentMembers(request);
    }


    @Test
    public void createResourcesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateResourcesBatchDto request = new CreateResourcesBatchDto();
        request.setList(Collections.singletonList(new dto.CreateResourceBatchItemDto()));
        request.setNamespace("namespace_2930");

        IsSuccessRespDto response = client.createResourcesBatch(request);
    }


    @Test
    public void getUserAccessibleAppsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserAccessibleAppsReqDto request = new GetUserAccessibleAppsReqDto();
        request.setUserId("userId_4264");

        AppListRespDto response = client.getUserAccessibleApps(request);
    }


    @Test
    public void getUserAuthorizedAppsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserAccessibleAppsReqDto request = new GetUserAccessibleAppsReqDto();
        request.setUserId("userId_8226");

        AppListRespDto response = client.getUserAuthorizedApps(request);
    }


    @Test
    public void getUserLoginHistoryTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserLoginHistoryDto request = new GetUserLoginHistoryDto();
        request.setUserId("userId_9097");
        request.setAppId("appId_9922");
        request.setClientIp("clientIp_7082");
        request.setStart(0);
        request.setEnd(0);
        request.setOptions(new dto.GetUserLoginHistoryOptionsDto());

        UserLoginHistoryPaginatedRespDto response = client.getUserLoginHistory(request);
    }


    @Test
    public void getUserAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserAuthorizedResourcesDto request = new GetUserAuthorizedResourcesDto();
        request.setUserId("userId_9345");
        request.setOptions(new dto.GetUserAuthorizedResourcesOptionsDto());

        AuthorizedResourcePaginatedRespDto response = client.getUserAuthorizedResources(request);
    }


    @Test
    public void getTargetAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetAuthorizedResourcesDto request = new GetAuthorizedResourcesDto();
        request.setTargetIdentifier("targetIdentifier_7086");
        request.setTargetType(dto.GetAuthorizedResourcesDto.TargetType.USER);
        request.setNamespace("namespace_3948");
        request.setResourceType(dto.GetAuthorizedResourcesDto.ResourceType.DATA);

        IsSuccessRespDto response = client.getTargetAuthorizedResources(request);
    }


    @Test
    public void getPrincipalAuthenticationInfoTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserPrincipalAuthenticationInfoDto request = new GetUserPrincipalAuthenticationInfoDto();
        request.setUserId("userId_1850");

        PrincipalAuthenticationInfoPaginatedRespDto response = client.getPrincipalAuthenticationInfo(request);
    }


    @Test
    public void getRoleAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        RoleAuthorizedResourcesDto request = new RoleAuthorizedResourcesDto();
        request.setCode("code_5789");
        request.setNamespace("namespace_4397");
        request.setResourceType(dto.RoleAuthorizedResourcesDto.ResourceType.DATA);

        IsSuccessRespDto response = client.getRoleAuthorizedResources(request);
    }


    @Test
    public void getParentDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetParentDepartmentReqDto request = new GetParentDepartmentReqDto();
        request.setDepartmentId("departmentId_5745");
        request.setOrganizationCode("organizationCode_9645");

        DepartmentSingleRespDto response = client.getParentDepartment(request);
    }


    @Test
    public void listDepartmentMemberIdsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListChildrenDepartmentsReqDto request = new ListChildrenDepartmentsReqDto();
        request.setDepartmentId("departmentId_9011");
        request.setOrganizationCode("organizationCode_6011");

        Object response = client.listDepartmentMemberIds(request);
    }


    @Test
    public void deleteResourcesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteResourcesBatchDto request = new DeleteResourcesBatchDto();
        request.setCodeList(Collections.singletonList("String_2088"));
        request.setNamespace("namespace_8410");

        IsSuccessRespDto response = client.deleteResourcesBatch(request);
    }


    @Test
    public void listDepartmentMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListDepartmentMembersReqDto request = new ListDepartmentMembersReqDto();
        request.setDepartmentId("departmentId_6488");
        request.setOrganizationCode("organizationCode_9126");
        request.setOptions(new dto.ListDepartmentMembersOptionsDto());

        UserListRespDto response = client.listDepartmentMembers(request);
    }


    @Test
    public void listChildrenDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListChildrenDepartmentsReqDto request = new ListChildrenDepartmentsReqDto();
        request.setDepartmentId("departmentId_8371");
        request.setOrganizationCode("organizationCode_6837");

        DepartmentPaginatedRespDto response = client.listChildrenDepartments(request);
    }


    @Test
    public void getGroupAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetGroupAuthorizedResourcesDto request = new GetGroupAuthorizedResourcesDto();
        request.setCode("code_7592");
        request.setNamespace("namespace_1149");
        request.setResourceType(dto.GetGroupAuthorizedResourcesDto.ResourceType.DATA);

        AuthorizedResourceListRespDto response = client.getGroupAuthorizedResources(request);
    }


    @Test
    public void resetPrincipalAuthenticationInfoTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ResetUserPrincipalAuthenticationInfoDto request = new ResetUserPrincipalAuthenticationInfoDto();
        request.setUserId("userId_3428");

        IsSuccessRespDto response = client.resetPrincipalAuthenticationInfo(request);
    }


    @Test
    public void createNamespacesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateNamespacesBatchDto request = new CreateNamespacesBatchDto();
        request.setList(Collections.singletonList(new dto.CreateNamespacesBatchItemDto()));

        IsSuccessRespDto response = client.createNamespacesBatch(request);
    }


    @Test
    public void getUserLoggedInAppsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserLoggedInAppsReqDto request = new GetUserLoggedInAppsReqDto();
        request.setUserId("userId_784");

        UserLoggedInAppsListRespDto response = client.getUserLoggedInApps(request);
    }


    @Test
    public void deketeNamespacesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteNamespacesBatchDto request = new DeleteNamespacesBatchDto();
        request.setCodeList(Collections.singletonList("String_238"));

        IsSuccessRespDto response = client.deketeNamespacesBatch(request);
    }


    @Test
    public void addDepartmentMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AddDepartmentMembersReqDto request = new AddDepartmentMembersReqDto();
        request.setDepartmentId("departmentId_758");
        request.setOrganizationCode("organizationCode_3953");
        request.setUserIds(Collections.singletonList("String_5076"));

        IsSuccessRespDto response = client.addDepartmentMembers(request);
    }



}