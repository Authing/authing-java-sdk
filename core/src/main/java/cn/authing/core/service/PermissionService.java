package cn.authing.core.service;

import javax.annotation.Nonnull;

import cn.authing.core.http.Call;
import cn.authing.core.param.AssignRoleToUserParam;
import cn.authing.core.param.CreateRoleParam;
import cn.authing.core.param.ReadPermissionsParam;
import cn.authing.core.param.ReadRolesParam;
import cn.authing.core.param.RemoveUserFromRoleParam;
import cn.authing.core.param.UpdateRoleParam;
import cn.authing.core.result.ReadPermissionsResult;
import cn.authing.core.result.ReadRolesResult;
import cn.authing.core.result.RoleInfoResult;

public interface PermissionService {
    Call<ReadRolesResult> readRoles(@Nonnull ReadRolesParam param);

    Call<ReadPermissionsResult> readPermissions(@Nonnull ReadPermissionsParam param);

    Call<RoleInfoResult> createRole(@Nonnull CreateRoleParam param);

    Call<RoleInfoResult> updateRoleInfo(@Nonnull UpdateRoleParam param);

    Call<ReadRolesResult> assiginRoleToUser(@Nonnull AssignRoleToUserParam param);

    Call<Object> removeUserFromRole(@Nonnull RemoveUserFromRoleParam param);
}
