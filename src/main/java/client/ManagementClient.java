package client;

import cn.hutool.core.util.StrUtil;
import dto.GetManagementAccessTokenDto;
import dto.GetManagementTokenRespDto;
import dto.AppListRespDto;
import dto.AuthorizedResourcePaginatedRespDto;
import dto.CreateUserBatchReqDto;
import dto.CreateUserReqDto;
import dto.DeleteUsersBatchDto;
import dto.GetUserAccessibleAppsReqDto;
import dto.GetUserAuthorizedResourcesDto;
import dto.GetUserBatchDto;
import dto.GetUserCustomDataDto;
import dto.GetUserDepartmentsDto;
import dto.GetUserDto;
import dto.GetUserGroupsDto;
import dto.GetUserIdentitiesDto;
import dto.GetUserLoggedInAppsReqDto;
import dto.GetUserLoginHistoryDto;
import dto.GetUserMfaInfoDto;
import dto.GetUserPrincipalAuthenticationInfoDto;
import dto.GetUserRolesDto;
import dto.GroupPaginatedRespDto;
import dto.HasAnyRoleDto;
import dto.HasAnyRoleRespDto;
import dto.IdentityListRespDto;
import dto.IsSuccessRespDto;
import dto.IsUserExistsReqDto;
import dto.IsUserExistsRespDto;
import dto.KickUsersDto;
import dto.ListArchivedUsersDto;
import dto.ListArchivedUsersSingleRespDto;
import dto.ListUsersDto;
import dto.PrincipalAuthenticationInfoPaginatedRespDto;
import dto.ResetUserPrincipalAuthenticationInfoDto;
import dto.RolePaginatedRespDto;
import dto.SetUserCustomDataDto;
import dto.SetUserCustomDataRespDto;
import dto.SetUserDepartmentsDto;
import dto.UpdateUserReqDto;
import dto.UserDepartmentPaginatedRespDto;
import dto.UserListRespDto;
import dto.UserLoggedInAppsListRespDto;
import dto.UserLoginHistoryPaginatedRespDto;
import dto.UserMfaSingleRespDto;
import dto.UserPaginatedRespDto;
import dto.UserSingleRespDto;
import dto.AddGroupMembersReqDto;
import dto.AuthorizedResourceListRespDto;
import dto.CreateGroupBatchReqDto;
import dto.CreateGroupReqDto;
import dto.DeleteGroupsReqDto;
import dto.GetGroupAuthorizedResourcesDto;
import dto.GetGroupDto;
import dto.GroupListRespDto;
import dto.GroupSingleRespDto;
import dto.ListGroupMembersDto;
import dto.ListGroupsDto;
import dto.RemoveGroupMembersReqDto;
import dto.UpdateGroupReqDto;
import dto.AssignRoleBatchDto;
import dto.AssignRoleDto;
import dto.CreateRoleDto;
import dto.CreateRolesBatch;
import dto.DeleteRoleDto;
import dto.GetRoleDto;
import dto.ListRoleDepartmentDto;
import dto.ListRoleDto;
import dto.ListRoleMemberDto;
import dto.RevokeRoleBatchDto;
import dto.RevokeRoleDto;
import dto.RoleAuthorizedResourcesDto;
import dto.RoleSingleRespDto;
import dto.UpdateRoleDto;
import dto.AddDepartmentMembersReqDto;
import dto.CreateDepartmentReqDto;
import dto.CreateOrganizationReqDto;
import dto.DeleteDepartmentReqDto;
import dto.DeleteOrganizationReqDto;
import dto.DepartmentListRespDto;
import dto.DepartmentPaginatedRespDto;
import dto.DepartmentSingleRespDto;
import dto.GetDepartmentReqDto;
import dto.GetParentDepartmentReqDto;
import dto.ListChildrenDepartmentsReqDto;
import dto.ListDepartmentMembersReqDto;
import dto.ListOrganizationsReqDto;
import dto.OrganizationPaginatedRespDto;
import dto.OrganizationSingleRespDto;
import dto.SearchDepartmentsReqDto;
import dto.UpdateDepartmentReqDto;
import dto.UpdateOrganizationReqDto;
import dto.CreateExtIdpConnDto;
import dto.CreateExtIdpDto;
import dto.DeleteExtIdpConnDto;
import dto.DeleteExtIdpDto;
import dto.EnableExtIdpConnDto;
import dto.ExtIdpConnDetail;
import dto.ExtIdpDto;
import dto.GetExtIdpDto;
import dto.TenantIdDto;
import dto.UpdateExtIdpConnDto;
import dto.UpdateExtIdpDto;
import dto.CustomFieldListRespDto;
import dto.GetUserDefinedFieldsDto;
import dto.SetCustomFieldsReqDto;
import dto.AuthorizeResourcesDto;
import dto.CreateNamespaceDto;
import dto.CreateNamespacesBatchDto;
import dto.CreateResourceDto;
import dto.CreateResourcesBatchDto;
import dto.DeleteNamespaceDto;
import dto.DeleteNamespacesBatchDto;
import dto.DeleteResourceDto;
import dto.DeleteResourcesBatchDto;
import dto.GetAuthorizedResourcesDto;
import dto.GetNamespaceDto;
import dto.GetNamespacesBatchDto;
import dto.GetResourceDto;
import dto.GetResourcesBatchDto;
import dto.ListResourcesDto;
import dto.NamespaceDto;
import dto.NamespaceListRespDto;
import dto.NamespaceRespDto;
import dto.ResourceDto;
import dto.ResourceListRespDto;
import dto.ResourcePaginatedRespDto;
import dto.ResourceRespDto;
import dto.UpdateNamespaceDto;
import dto.UpdateResourceDto;

import model.AuthingRequestConfig;
import model.ManagementClientOptions;


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
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserSingleRespDto.class);
    }

    public UserListRespDto getUserBatch(GetUserBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
    }

    public UserPaginatedRespDto listUsers(ListUsersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-users");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
    }

    public IdentityListRespDto getUserIdentities(GetUserIdentitiesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-identities");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IdentityListRespDto.class);
    }

    public Object getUserCustomData(GetUserCustomDataDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-custom-data");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, Object.class);
    }

    public SetUserCustomDataRespDto setUserCustomData(SetUserCustomDataDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-user-custom-data");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, SetUserCustomDataRespDto.class);
    }

    public RolePaginatedRespDto getUserRoles(GetUserRolesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-roles");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, RolePaginatedRespDto.class);
    }

    public PrincipalAuthenticationInfoPaginatedRespDto getPrincipalAuthenticationInfo(GetUserPrincipalAuthenticationInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-principal-authentication-info");
        config.setBody(reqDto);
        config.setMethod("POST");
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
        config.setMethod("POST");
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
        config.setMethod("POST");
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
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserMfaSingleRespDto.class);
    }

    public ListArchivedUsersSingleRespDto listArchivedUsers(ListArchivedUsersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-archived-users");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ListArchivedUsersSingleRespDto.class);
    }

    public IsUserExistsRespDto kickUsers(KickUsersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/kick-users");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsUserExistsRespDto.class);
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

    public AppListRespDto getUserAccessibleApps(GetUserAccessibleAppsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-accessible-apps");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, AppListRespDto.class);
    }

    public AppListRespDto getUserAuthorizedApps(GetUserAccessibleAppsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-authorized-apps");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, AppListRespDto.class);
    }

    public HasAnyRoleRespDto hasAnyRole(HasAnyRoleDto reqDto) {
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
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserLoginHistoryPaginatedRespDto.class);
    }

    public UserLoggedInAppsListRespDto getUserLoggedInApps(GetUserLoggedInAppsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-loggedin-apps");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserLoggedInAppsListRespDto.class);
    }

    public AuthorizedResourcePaginatedRespDto getUserAuthorizedResources(GetUserAuthorizedResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, AuthorizedResourcePaginatedRespDto.class);
    }

    public GroupSingleRespDto getGroup(GetGroupDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-group");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GroupSingleRespDto.class);
    }

    public GroupPaginatedRespDto getGroupList(ListGroupsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-groups");
        config.setBody(reqDto);
        config.setMethod("POST");
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

    public UserListRespDto listGroupMembers(ListGroupMembersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-group-members");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
    }

    public AuthorizedResourceListRespDto getGroupAuthorizedResources(GetGroupAuthorizedResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-group-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, AuthorizedResourceListRespDto.class);
    }

    public RoleSingleRespDto getRole(GetRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-role");
        config.setBody(reqDto);
        config.setMethod("POST");
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

    public IsSuccessRespDto getRoleAuthorizedResources(RoleAuthorizedResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-role-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }

    public UserListRespDto listRoleMembers(ListRoleMemberDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-role-members");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
    }

    public UserListRespDto listDepartments(ListRoleDepartmentDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-role-departments");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
    }

    public RoleSingleRespDto createRole(CreateRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-role");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, RoleSingleRespDto.class);
    }

    public RolePaginatedRespDto listRoles(ListRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-roles");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, RolePaginatedRespDto.class);
    }

    public IsSuccessRespDto deleteRoles(DeleteRoleDto reqDto) {
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

    public OrganizationPaginatedRespDto listOrganizations(ListOrganizationsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-organizations");
        config.setBody(reqDto);
        config.setMethod("POST");
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

    public DepartmentSingleRespDto getDepartment(GetDepartmentReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-department");
        config.setBody(reqDto);
        config.setMethod("POST");
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

    public DepartmentPaginatedRespDto listChildrenDepartments(ListChildrenDepartmentsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-children-departments");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DepartmentPaginatedRespDto.class);
    }

    public UserListRespDto listDepartmentMembers(ListDepartmentMembersReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-department-members");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
    }

    public Object listDepartmentMemberIds(ListChildrenDepartmentsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-department-member-ids");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, Object.class);
    }

    public IsSuccessRespDto addDepartmentMembers(AddDepartmentMembersReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/add-department-members");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }

    public IsSuccessRespDto removeDepartmentMembers(AddDepartmentMembersReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/remove-department-members");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }

    public DepartmentSingleRespDto getParentDepartment(GetParentDepartmentReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-parent-department");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DepartmentSingleRespDto.class);
    }

    public ExtIdpDto listExtIdp(TenantIdDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-ext-idp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpDto.class);
    }

    public ExtIdpDto getExtIdp(GetExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-ext-idp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpDto.class);
    }

    public ExtIdpDto createExtIdp(CreateExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-ext-idp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpDto.class);
    }

    public ExtIdpDto updateExtIdp(UpdateExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-ext-idp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpDto.class);
    }

    public ExtIdpDto deleteExtIdp(DeleteExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-ext-idp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpDto.class);
    }

    public ExtIdpConnDetail createExtIdpConn(CreateExtIdpConnDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-ext-idp-conn");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpConnDetail.class);
    }

    public ExtIdpConnDetail updateExtIdpConn(UpdateExtIdpConnDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-ext-idp-conn");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ExtIdpConnDetail.class);
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

    public CustomFieldListRespDto getCustomFields(GetUserDefinedFieldsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-custom-fields");
        config.setBody(reqDto);
        config.setMethod("POST");
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
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResourceRespDto.class);
    }

    public ResourceListRespDto getResourcesBatch(GetResourcesBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-resources-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResourceListRespDto.class);
    }

    public ResourcePaginatedRespDto listResources(ListResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-resources");
        config.setBody(reqDto);
        config.setMethod("POST");
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
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, NamespaceRespDto.class);
    }

    public NamespaceListRespDto getNamespacesBatch(GetNamespacesBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-namespaces-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, NamespaceListRespDto.class);
    }

    public NamespaceDto updateNamespace(UpdateNamespaceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-namespace");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, NamespaceDto.class);
    }

    public IsSuccessRespDto deketeNamespace(DeleteNamespaceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-namespace");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }

    public IsSuccessRespDto deketeNamespacesBatch(DeleteNamespacesBatchDto reqDto) {
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
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }

}