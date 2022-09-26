package cn.authing.sdk.java.client;

import cn.hutool.core.util.StrUtil;
import cn.authing.sdk.java.dto.*;

import cn.authing.sdk.java.model.AuthingRequestConfig;
import cn.authing.sdk.java.model.ManagementClientOptions;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;


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

    public Object makeRequest(MakeRequestReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl(reqDto.getUrl());
        config.setBody(reqDto.getData());
        config.setMethod(reqDto.getMethod());
        String response = request(config);
        return deserialize(response, Object.class);
    }

    public GetManagementTokenRespDto getManagementToken(GetManagementAccessTokenDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-management-token");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetManagementTokenRespDto.class);
    }


    public UserPaginatedRespDto listUsers(ListUsersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-users");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
    }


    public UserPaginatedRespDto listUsersLegacy(ListUsersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-users");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
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


    public PrincipalAuthenticationInfoPaginatedRespDto getUserPrincipalAuthenticationInfo(GetUserPrincipalAuthenticationInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-principal-authentication-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PrincipalAuthenticationInfoPaginatedRespDto.class);
    }


    public IsSuccessRespDto resetUserPrincipalAuthenticationInfo(ResetUserPrincipalAuthenticationInfoDto reqDto) {
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


    public IsSuccessRespDto setUserDepartments(SetUserDepartmentsDto reqDto) {
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


    public IsSuccessRespDto deleteUsersBatch(DeleteUsersBatchDto reqDto) {
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


    public UserListRespDto createUsersBatch(CreateUserBatchReqDto reqDto) {
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


    public UserListRespDto updateUserBatch(UpdateUserBatchReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-user-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserListRespDto.class);
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


    public UserLoggedInAppsListRespDto getUserLoggedinApps(GetUserLoggedinAppsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-loggedin-apps");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserLoggedInAppsListRespDto.class);
    }


    public UserLoggedInIdentitiesRespDto getUserLoggedinIdentities(GetUserLoggedInIdentitiesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-logged-in-identities");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserLoggedInIdentitiesRespDto.class);
    }


    public ResignUserRespDto resignUser(ResignUserReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/resign-user");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResignUserRespDto.class);
    }


    public ResignUserRespDto resignUserBatch(ResignUserBatchReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/resign-user-batch");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ResignUserRespDto.class);
    }


    public AuthorizedResourcePaginatedRespDto getUserAuthorizedResources(GetUserAuthorizedResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AuthorizedResourcePaginatedRespDto.class);
    }


    public CheckSessionStatusRespDto checkSessionStatus(CheckSessionStatusDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-session-status");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CheckSessionStatusRespDto.class);
    }


    public CommonResponseDto importOtp(ImportOtpReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/import-otp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
    }


    public OrganizationSingleRespDto getOrganization(GetOrganizationDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-organization");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OrganizationSingleRespDto.class);
    }


    public OrganizationListRespDto getOrganizationsBatch(GetOrganizationBatchDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-organization-batch");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OrganizationListRespDto.class);
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


    public OrganizationPaginatedRespDto searchOrganizations(SearchOrganizationsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/search-organizations");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, OrganizationPaginatedRespDto.class);
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


    public UserPaginatedRespDto listDepartmentMembers(ListDepartmentMembersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-department-members");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
    }


    public UserIdListRespDto listDepartmentMemberIds(ListDepartmentMemberIdsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-department-member-ids");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserIdListRespDto.class);
    }


    public UserPaginatedRespDto searchDepartmentMembers(SearchDepartmentMembersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/search-department-members");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
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


    public IsUserInDepartmentRespDto isUserInDepartment(IsUserInDepartmentDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/is-user-in-department");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, IsUserInDepartmentRespDto.class);
    }


    public GroupSingleRespDto getGroup(GetGroupDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-group");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GroupSingleRespDto.class);
    }


    public GroupPaginatedRespDto listGroups(ListGroupsDto reqDto) {
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


    public GroupListRespDto createGroupsBatch(CreateGroupBatchReqDto reqDto) {
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


    public IsSuccessRespDto deleteGroupsBatch(DeleteGroupsReqDto reqDto) {
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


    public IsSuccessRespDto revokeRole(RevokeRoleDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/revoke-role");
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


    public IsSuccessRespDto changeAssociationState(AssociationExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/association-ext-idp");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }


    public ExtIdpListPaginatedRespDto listTenantExtIdp(ListTenantExtIdpDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-tenant-ext-idp");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ExtIdpListPaginatedRespDto.class);
    }


    public ExtIdpListPaginatedRespDto extIdpConnStateByApps(ExtIdpConnAppsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/ext-idp-conn-apps");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ExtIdpListPaginatedRespDto.class);
    }


    public CustomFieldListRespDto getUserBaseFields() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-base-fields");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, CustomFieldListRespDto.class);
    }


    public CustomFieldListRespDto setUserBaseFields(SetUserBaseFieldsReqDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/set-user-base-fields");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CustomFieldListRespDto.class);
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


    public NamespaceRespDto createNamespace(CreateNamespaceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-namespace");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, NamespaceRespDto.class);
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


    public AuthorizedResourcePaginatedRespDto getAuthorizedResources(GetAuthorizedResourcesDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-authorized-resources");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, AuthorizedResourcePaginatedRespDto.class);
    }


    public IsActionAllowedRespDtp isActionAllowed(IsActionAllowedDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/is-action-allowed");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsActionAllowedRespDtp.class);
    }


    public GetAuthorizedTargetRespDto getAuthorizedTargets(GetAuthorizedTargetsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-authorized-targets");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetAuthorizedTargetRespDto.class);
    }


    public UserActionLogRespDto getUserActionLogs(GetUserActionLogsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-user-action-logs");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserActionLogRespDto.class);
    }


    public AdminAuditLogRespDto getAdminAuditLogs(GetAdminAuditLogsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-admin-audit-logs");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, AdminAuditLogRespDto.class);
    }


    public GetEmailTemplatesRespDto getEmailTemplates() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-email-templates");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetEmailTemplatesRespDto.class);
    }


    public EmailTemplateSingleItemRespDto updateEmailTemplate(UpdateEmailTemplateDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-email-template");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, EmailTemplateSingleItemRespDto.class);
    }


    public PreviewEmailTemplateRespDto previewEmailTemplate(PreviewEmailTemplateDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/preview-email-template");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PreviewEmailTemplateRespDto.class);
    }


    public EmailProviderDto getEmailProvider() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-email-provier");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, EmailProviderDto.class);
    }


    public EmailProviderDto configEmailProvider(ConfigEmailProviderDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/config-email-provier");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, EmailProviderDto.class);
    }


    public ApplicationSingleRespDto getApplication(GetApplicationDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-application");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ApplicationSingleRespDto.class);
    }


    public ApplicationPaginatedRespDto listApplications(ListApplicationDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-application");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ApplicationPaginatedRespDto.class);
    }


    public ApplicationSimpleInfoSingleRespDto getApplicationSimpleInfo(GetApplicationSimpleInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-application-simple-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ApplicationSimpleInfoSingleRespDto.class);
    }


    public ApplicationSimpleInfoSingleRespDto listApplicationSimpleInfo(ListApplicationSimpleInfoDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-application-simple-info");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, ApplicationSimpleInfoSingleRespDto.class);
    }


    public ApplicationPaginatedRespDto createApplication(CreateApplicationDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-application");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ApplicationPaginatedRespDto.class);
    }


    public IsSuccessRespDto deleteApplication(DeleteApplicationDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-application");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }


    public GetApplicationSecretRespDto getApplicationSecret(GetApplicationSecretDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-application-secret");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetApplicationSecretRespDto.class);
    }


    public RefreshApplicationSecretRespDto refreshApplicationSecret(RefreshApplicationSecretDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/refresh-application-secret");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, RefreshApplicationSecretRespDto.class);
    }


    public UserPaginatedRespDto listApplicationActiveUsers(ListApplicationActiveUsersDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-application-active-users");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UserPaginatedRespDto.class);
    }


    public GetApplicationPermissionStrategyRespDto getApplicationPermissionStrategy(GetApplicationPermissionStrategyDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-application-permission-strategy");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetApplicationPermissionStrategyRespDto.class);
    }


    public IsSuccessRespDto updateApplicationPermissionStrategy(UpdateApplicationPermissionStrategyDataDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-application-permission-strategy");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }


    public IsSuccessRespDto authorizeApplicationAccess(AddApplicationPermissionRecord reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/add-application-permission-record");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }


    public IsSuccessRespDto revokeApplicationAccess(DeleteApplicationPermissionRecord reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-application-permission-record");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }


    public CheckDomainAvailableSecretRespDto checkDomainAvailable(CheckDomainAvailable reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/check-domain-available");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CheckDomainAvailableSecretRespDto.class);
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


    public IsSuccessRespDto associationResources(AssociationResourceDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/associate-tenant-resource");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, IsSuccessRespDto.class);
    }


    public PipelineFunctionSingleRespDto createPipelineFunction(CreatePipelineFunctionDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-pipeline-function");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PipelineFunctionSingleRespDto.class);
    }


    public PipelineFunctionSingleRespDto getPipelineFunction(GetPipelineFunctionDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-pipeline-function");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PipelineFunctionSingleRespDto.class);
    }


    public PipelineFunctionSingleRespDto reuploadPipelineFunction(ReUploadPipelineFunctionDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/reupload-pipeline-function");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PipelineFunctionSingleRespDto.class);
    }


    public PipelineFunctionSingleRespDto updatePipelineFunction(UpdatePipelineFunctionDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-pipeline-function");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, PipelineFunctionSingleRespDto.class);
    }


    public CommonResponseDto updatePipelineOrder(UpdatePipelineOrderDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-pipeline-order");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
    }


    public CommonResponseDto deletePipelineFunction(DeletePipelineFunctionDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-pipeline-function");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CommonResponseDto.class);
    }


    public PipelineFunctionPaginatedRespDto listPipelineFunctions(ListPipelineFunctionDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-pipeline-function");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PipelineFunctionPaginatedRespDto.class);
    }


    public PipelineFunctionPaginatedRespDto getPipelineLogs(GetPipelineLogsDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-pipeline-logs");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, PipelineFunctionPaginatedRespDto.class);
    }


    public CreateWebhookRespDto createWebhook(CreateWebhookDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/create-webhook");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, CreateWebhookRespDto.class);
    }


    public GetWebhooksRespDto listWebhooks(ListWebhooksDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/list-webhooks");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetWebhooksRespDto.class);
    }


    public UpdateWebhooksRespDto updateWebhook(UpdateWebhookDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/update-webhook");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, UpdateWebhooksRespDto.class);
    }


    public DeleteWebhookRespDto deleteWebhook(DeleteWebhookDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/delete-webhook");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, DeleteWebhookRespDto.class);
    }


    public ListWebhookLogsRespDto getWebhookLogs(ListWebhookLogs reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-webhook-logs");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, ListWebhookLogsRespDto.class);
    }


    public TriggerWebhookRespDto triggerWebhook(TriggerWebhookDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/trigger-webhook");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, TriggerWebhookRespDto.class);
    }


    public GetWebhookRespDto getWebhook(GetWebhookDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-webhook");
        config.setBody(reqDto);
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, GetWebhookRespDto.class);
    }


    public WebhookEventListRespDto getWebhookEventList() {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-webhook-event-list");
        config.setBody(new Object());
        config.setMethod("GET");
        String response = request(config);
        return deserialize(response, WebhookEventListRespDto.class);
    }


}