package cn.authing.sdk.java.client;

import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.AuthingRequestConfig;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.hutool.core.util.StrUtil;


public class ManagementClient extends BaseClient {
    
    public ManagementClient(ManagementClientOptions options) {
        super(options);
        // 必要参数校验
        if (StrUtil.isBlank(options.getAccessKeyId())) {
            throw new IllegalArgumentException("accessKeyId is required");
        }
        if (StrUtil.isBlank(options.getAccessKeySecret())) {
            throw new IllegalArgumentException("accessKeySecret is required");
        }
    }
    
    public GetManagementTokenRespDto getManagementToken(GetManagementAccessTokenDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-management-token");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetManagementTokenRespDto.class);
    }
    
    
    public UserSingleRespDto getUser(GetUserDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserSingleRespDto.class);
    }
    
    
    public UserListRespDto getUserBatch(GetUserBatchDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
    }
    
    
    public UserPaginatedRespDto listUsers(ListUsersDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-users");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
    }
    
    
    public IdentityListRespDto getUserIdentities(GetUserIdentitiesDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-identities");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, IdentityListRespDto.class);
    }
    
    
    public RolePaginatedRespDto getUserRoles(GetUserRolesDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-roles");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RolePaginatedRespDto.class);
    }
    
    
    public PrincipalAuthenticationInfoPaginatedRespDto getPrincipalAuthenticationInfo(GetUserPrincipalAuthenticationInfoDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-principal-authentication-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PrincipalAuthenticationInfoPaginatedRespDto.class);
    }
    
    
    public IsSuccessRespDto resetPrincipalAuthenticationInfo(ResetUserPrincipalAuthenticationInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/reset-user-principal-authentication-info");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public UserDepartmentPaginatedRespDto getUserDepartments(GetUserDepartmentsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-departments");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserDepartmentPaginatedRespDto.class);
    }
    
    
    public IsSuccessRespDto setUserDepartment(SetUserDepartmentsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-user-departments");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public GroupPaginatedRespDto getUserGroups(GetUserGroupsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-groups");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GroupPaginatedRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteUserBatch(DeleteUsersBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-users-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public UserMfaSingleRespDto getUserMfaInfo(GetUserMfaInfoDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-mfa-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserMfaSingleRespDto.class);
    }
    
    
    public ListArchivedUsersSingleRespDto listArchivedUsers(ListArchivedUsersDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-archived-users");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ListArchivedUsersSingleRespDto.class);
    }
    
    
    public IsSuccessRespDto kickUsers(KickUsersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/kick-users");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsUserExistsRespDto isUserExists(IsUserExistsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/is-user-exists");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsUserExistsRespDto.class);
    }
    
    
    public UserSingleRespDto createUser(CreateUserReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-user");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserSingleRespDto.class);
    }
    
    
    public UserListRespDto createUserBatch(CreateUserBatchReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-users-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
    }
    
    
    public UserSingleRespDto updateUser(UpdateUserReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-user");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserSingleRespDto.class);
    }
    
    
    public AppListRespDto getUserAccessibleApps(GetUserAccessibleAppsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-accessible-apps");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AppListRespDto.class);
    }
    
    
    public AppListRespDto getUserAuthorizedApps(GetUserAuthorizedAppsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-authorized-apps");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AppListRespDto.class);
    }
    
    
    public HasAnyRoleRespDto hasAnyRole(HasAnyRoleReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/has-any-role");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, HasAnyRoleRespDto.class);
    }
    
    
    public UserLoginHistoryPaginatedRespDto getUserLoginHistory(GetUserLoginHistoryDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-login-history");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserLoginHistoryPaginatedRespDto.class);
    }
    
    
    public UserLoggedInAppsListRespDto getUserLoggedInApps(GetUserLoggedinAppsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-loggedin-apps");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserLoggedInAppsListRespDto.class);
    }
    
    
    public AuthorizedResourcePaginatedRespDto getUserAuthorizedResources(GetUserAuthorizedResourcesDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AuthorizedResourcePaginatedRespDto.class);
    }
    
    
    public GroupSingleRespDto getGroup(GetGroupDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-group");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GroupSingleRespDto.class);
    }
    
    
    public GroupPaginatedRespDto getGroupList(ListGroupsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-groups");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GroupPaginatedRespDto.class);
    }
    
    
    public GroupSingleRespDto createGroup(CreateGroupReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-group");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GroupSingleRespDto.class);
    }
    
    
    public GroupListRespDto createGroupBatch(CreateGroupBatchReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-groups-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GroupListRespDto.class);
    }
    
    
    public GroupSingleRespDto updateGroup(UpdateGroupReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-group");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GroupSingleRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteGroups(DeleteGroupsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-groups-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto addGroupMembers(AddGroupMembersReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/add-group-members");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto removeGroupMembers(RemoveGroupMembersReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/remove-group-members");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public UserPaginatedRespDto listGroupMembers(ListGroupMembersDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-group-members");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
    }
    
    
    public AuthorizedResourceListRespDto getGroupAuthorizedResources(GetGroupAuthorizedResourcesDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-group-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AuthorizedResourceListRespDto.class);
    }
    
    
    public RoleSingleRespDto getRole(GetRoleDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-role");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RoleSingleRespDto.class);
    }
    
    
    public IsSuccessRespDto assignRole(AssignRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/assign-role");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto assignRoleBatch(AssignRoleBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/assign-role-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto revokeRole(RevokeRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/revoke-role");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto revokeRoleBatch(RevokeRoleBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/revoke-role-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public RoleAuthorizedResourcePaginatedRespDto getRoleAuthorizedResources(GetRoleAuthorizedResourcesDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-role-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RoleAuthorizedResourcePaginatedRespDto.class);
    }
    
    
    public UserPaginatedRespDto listRoleMembers(ListRoleMembersDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-role-members");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
    }
    
    
    public RoleDepartmentListPaginatedRespDto listRoleDepartments(ListRoleDepartmentsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-role-departments");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RoleDepartmentListPaginatedRespDto.class);
    }
    
    
    public RoleSingleRespDto createRole(CreateRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-role");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, RoleSingleRespDto.class);
    }
    
    
    public RolePaginatedRespDto listRoles(ListRolesDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-roles");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, RolePaginatedRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteRolesBatch(DeleteRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-roles-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto createRolesBatch(CreateRolesBatch reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-roles-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto updateRole(UpdateRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-role");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public OrganizationPaginatedRespDto listOrganizations(ListOrganizationsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-organizations");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OrganizationPaginatedRespDto.class);
    }
    
    
    public OrganizationSingleRespDto createOrganization(CreateOrganizationReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-organization");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, OrganizationSingleRespDto.class);
    }
    
    
    public OrganizationSingleRespDto updateOrganization(UpdateOrganizationReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-organization");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, OrganizationSingleRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteOrganization(DeleteOrganizationReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-organization");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public DepartmentSingleRespDto getDepartment(GetDepartmentDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-department");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
    }
    
    
    public DepartmentSingleRespDto createDepartment(CreateDepartmentReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-department");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
    }
    
    
    public DepartmentSingleRespDto updateDepartment(UpdateDepartmentReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-department");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteDepartment(DeleteDepartmentReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-department");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public DepartmentListRespDto searchDepartments(SearchDepartmentsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/search-departments");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DepartmentListRespDto.class);
    }
    
    
    public DepartmentPaginatedRespDto listChildrenDepartments(ListChildrenDepartmentsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-children-departments");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, DepartmentPaginatedRespDto.class);
    }
    
    
    public UserListRespDto listDepartmentMembers(ListDepartmentMembersDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-department-members");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
    }
    
    
    public UserIdListRespDto listDepartmentMemberIds(ListDepartmentMemberIdsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-department-member-ids");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserIdListRespDto.class);
    }
    
    
    public IsSuccessRespDto addDepartmentMembers(AddDepartmentMembersReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/add-department-members");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto removeDepartmentMembers(RemoveDepartmentMembersReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/remove-department-members");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public DepartmentSingleRespDto getParentDepartment(GetParentDepartmentDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-parent-department");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
    }
    
    
    public ExtIdpListPaginatedRespDto listExtIdp(ListExtIdpDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-ext-idp");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ExtIdpListPaginatedRespDto.class);
    }
    
    
    public ExtIdpDetailSingleRespDto getExtIdp(GetExtIdpDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-ext-idp");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ExtIdpDetailSingleRespDto.class);
    }
    
    
    public ExtIdpSingleRespDto createExtIdp(CreateExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-ext-idp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpSingleRespDto.class);
    }
    
    
    public ExtIdpSingleRespDto updateExtIdp(UpdateExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-ext-idp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpSingleRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteExtIdp(DeleteExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-ext-idp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public ExtIdpConnDetailSingleRespDto createExtIdpConn(CreateExtIdpConnDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-ext-idp-conn");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpConnDetailSingleRespDto.class);
    }
    
    
    public ExtIdpConnDetailSingleRespDto updateExtIdpConn(UpdateExtIdpConnDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-ext-idp-conn");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpConnDetailSingleRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteExtIdpConn(DeleteExtIdpConnDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-ext-idp-conn");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto changeConnState(EnableExtIdpConnDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/enable-ext-idp-conn");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public CustomFieldListRespDto getCustomFields(GetCustomFieldsDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-custom-fields");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CustomFieldListRespDto.class);
    }
    
    
    public CustomFieldListRespDto setCustomFields(SetCustomFieldsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-custom-fields");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CustomFieldListRespDto.class);
    }
    
    
    public IsSuccessRespDto setCustomData(SetCustomDataReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-custom-data");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public GetCustomDataRespDto getCustomData(GetCustomDataDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-custom-data");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetCustomDataRespDto.class);
    }
    
    
    public ResourceRespDto createResource(CreateResourceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-resource");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResourceRespDto.class);
    }
    
    
    public IsSuccessRespDto createResourcesBatch(CreateResourcesBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-resources-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public ResourceRespDto getResource(GetResourceDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-resource");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ResourceRespDto.class);
    }
    
    
    public ResourceListRespDto getResourcesBatch(GetResourcesBatchDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-resources-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ResourceListRespDto.class);
    }
    
    
    public ResourcePaginatedRespDto listResources(ListResourcesDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ResourcePaginatedRespDto.class);
    }
    
    
    public ResourceRespDto updateResource(UpdateResourceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-resource");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResourceRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteResource(DeleteResourceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-resource");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteResourcesBatch(DeleteResourcesBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-resources-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public ResourceDto createNamespace(CreateNamespaceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-namespace");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResourceDto.class);
    }
    
    
    public IsSuccessRespDto createNamespacesBatch(CreateNamespacesBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-namespaces-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public NamespaceRespDto getNamespace(GetNamespaceDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-namespace");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, NamespaceRespDto.class);
    }
    
    
    public NamespaceListRespDto getNamespacesBatch(GetNamespacesBatchDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-namespaces-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, NamespaceListRespDto.class);
    }
    
    
    public UpdateNamespaceRespDto updateNamespace(UpdateNamespaceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-namespace");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UpdateNamespaceRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteNamespace(DeleteNamespaceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-namespace");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto deleteNamespacesBatch(DeleteNamespacesBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-namespaces-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto authorizeResources(AuthorizeResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/authorize-resources");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
    public IsSuccessRespDto getTargetAuthorizedResources(GetAuthorizedResourcesDto reqDto) {
        
        
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }
    
    
}