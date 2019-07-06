package cn.authing.core.service;

import androidx.annotation.NonNull;

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
    Call<ReadRolesResult> readRoles(@NonNull ReadRolesParam param);

    Call<ReadPermissionsResult> readPermissions(@NonNull ReadPermissionsParam param);

    Call<RoleInfoResult> createRole(@NonNull CreateRoleParam param);

    Call<RoleInfoResult> updateRoleInfo(@NonNull UpdateRoleParam param);

    Call<ReadRolesResult> assiginRoleToUser(@NonNull AssignRoleToUserParam param);

    Call<Object> removeUserFromRole(@NonNull RemoveUserFromRoleParam param);
}
