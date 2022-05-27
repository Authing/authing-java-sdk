
func TestClient_GetResource(t *testing.T) {
    request := dto.GetResourceDto{
            Code: "code_3373",
            Namespace: "namespace_6254",
    }
    response := client.GetResource(&request)
    fmt.Println(response)
}


func TestClient_GetNamespace(t *testing.T) {
    request := dto.GetNamespaceDto{
            Code: "code_1335",
    }
    response := client.GetNamespace(&request)
    fmt.Println(response)
}


func TestClient_HasAnyRole(t *testing.T) {
    request := dto.HasAnyRoleReqDto{
            Roles: nil,
            UserId: "userId_3868",
    }
    response := client.HasAnyRole(&request)
    fmt.Println(response)
}


func TestClient_SetCustomData(t *testing.T) {
    request := dto.SetCustomDataReqDto{
            List: nil,
            TargetIdentifier: "targetIdentifier_9468",
            TargetType: ,
            Namespace: "namespace_4136",
    }
    response := client.SetCustomData(&request)
    fmt.Println(response)
}


func TestClient_GetCustomData(t *testing.T) {
    request := dto.GetCustomDataDto{
            TargetType: "targetType_4930",
            TargetIdentifier: "targetIdentifier_5664",
            Namespace: "namespace_6211",
    }
    response := client.GetCustomData(&request)
    fmt.Println(response)
}


func TestClient_DeleteNamespace(t *testing.T) {
    request := dto.DeleteNamespaceDto{
            Code: "code_4611",
    }
    response := client.DeleteNamespace(&request)
    fmt.Println(response)
}


func TestClient_AuthorizeResources(t *testing.T) {
    request := dto.AuthorizeResourcesDto{
            List: nil,
            Namespace: "namespace_3067",
    }
    response := client.AuthorizeResources(&request)
    fmt.Println(response)
}


func TestClient_GetManagementToken(t *testing.T) {
    request := dto.GetManagementAccessTokenDto{
            AccessKeySecret: "accessKeySecret_7021",
            AccessKeyId: "accessKeyId_4717",
    }
    response := client.GetManagementToken(&request)
    fmt.Println(response)
}


func TestClient_GetUser(t *testing.T) {
    request := dto.GetUserDto{
            UserId: "userId_6520",
            WithCustomData: false,
            WithIdentities: false,
            WithDepartmentIds: false,
            Phone: "phone_1889",
            Email: "email_1688",
            Username: "username_6931",
            ExternalId: "externalId_4495",
    }
    response := client.GetUser(&request)
    fmt.Println(response)
}


func TestClient_ListUsers(t *testing.T) {
    request := dto.ListUsersDto{
            Page: 0,
            Limit: 0,
            WithCustomData: false,
            WithIdentities: false,
            WithDepartmentIds: false,
    }
    response := client.ListUsers(&request)
    fmt.Println(response)
}


func TestClient_GetUserBatch(t *testing.T) {
    request := dto.GetUserBatchDto{
            UserIds: "userIds_7230",
            WithCustomData: false,
            WithIdentities: false,
            WithDepartmentIds: false,
    }
    response := client.GetUserBatch(&request)
    fmt.Println(response)
}


func TestClient_GetUserIdentities(t *testing.T) {
    request := dto.GetUserIdentitiesDto{
            UserId: "userId_7225",
    }
    response := client.GetUserIdentities(&request)
    fmt.Println(response)
}


func TestClient_CreateOrganization(t *testing.T) {
    request := dto.CreateOrganizationReqDto{
            OrganizationName: "organizationName_2027",
            OrganizationCode: "organizationCode_2270",
            OpenDepartmentId: "openDepartmentId_1674",
    }
    response := client.CreateOrganization(&request)
    fmt.Println(response)
}


func TestClient_UpdateExtIdpConn(t *testing.T) {
    request := dto.UpdateExtIdpConnDto{
            Fields: nil,
            DisplayName: "displayName_8594",
            Id: "id_5185",
            Logo: "logo_8928",
            LoginOnly: false,
    }
    response := client.UpdateExtIdpConn(&request)
    fmt.Println(response)
}


func TestClient_DeleteOrganization(t *testing.T) {
    request := dto.DeleteOrganizationReqDto{
            OrganizationCode: "organizationCode_7953",
    }
    response := client.DeleteOrganization(&request)
    fmt.Println(response)
}


func TestClient_ChangeConnState(t *testing.T) {
    request := dto.EnableExtIdpConnDto{
            AppId: "appId_8921",
            Enabled: false,
            Id: "id_2921",
            TenantId: "tenantId_7497",
    }
    response := client.ChangeConnState(&request)
    fmt.Println(response)
}


func TestClient_UpdateOrganization(t *testing.T) {
    request := dto.UpdateOrganizationReqDto{
            OrganizationCode: "organizationCode_3319",
            OpenDepartmentId: "openDepartmentId_8572",
            OrganizationNewCode: "organizationNewCode_530",
            OrganizationName: "organizationName_4419",
    }
    response := client.UpdateOrganization(&request)
    fmt.Println(response)
}


func TestClient_SetCustomFields(t *testing.T) {
    request := dto.SetCustomFieldsReqDto{
            List: nil,
    }
    response := client.SetCustomFields(&request)
    fmt.Println(response)
}


func TestClient_AssignRole(t *testing.T) {
    request := dto.AssignRoleDto{
            Targets: nil,
            Code: "code_1735",
            Namespace: "namespace_7758",
    }
    response := client.AssignRole(&request)
    fmt.Println(response)
}


func TestClient_CreateGroupBatch(t *testing.T) {
    request := dto.CreateGroupBatchReqDto{
            List: nil,
    }
    response := client.CreateGroupBatch(&request)
    fmt.Println(response)
}


func TestClient_GetUserMfaInfo(t *testing.T) {
    request := dto.GetUserMfaInfoDto{
            UserId: "userId_2063",
    }
    response := client.GetUserMfaInfo(&request)
    fmt.Println(response)
}


func TestClient_GetRole(t *testing.T) {
    request := dto.GetRoleDto{
            Code: "code_3595",
            Namespace: "namespace_68",
    }
    response := client.GetRole(&request)
    fmt.Println(response)
}


func TestClient_UpdateUser(t *testing.T) {
    request := dto.UpdateUserReqDto{
            UserId: "userId_8460",
            PhoneCountryCode: "phoneCountryCode_8091",
            Name: "name_8726",
            Nickname: "nickname_6206",
            Photo: "photo_7414",
            ExternalId: "externalId_3102",
            Status: ,
            EmailVerified: false,
            PhoneVerified: false,
            Birthdate: "birthdate_4429",
            Country: "country_7148",
            Province: "province_2823",
            City: "city_5141",
            Address: "address_1292",
            StreetAddress: "streetAddress_1482",
            PostalCode: "postalCode_2354",
            Gender: ,
            Username: "username_1579",
            PasswordEncryptType: ,
            Email: "email_358",
            Phone: "phone_5766",
            Password: "password_6386",
            CustomData: nil,
    }
    response := client.UpdateUser(&request)
    fmt.Println(response)
}


func TestClient_AddGroupMembers(t *testing.T) {
    request := dto.AddGroupMembersReqDto{
            UserIds: nil,
            Code: "code_9093",
    }
    response := client.AddGroupMembers(&request)
    fmt.Println(response)
}


func TestClient_RevokeRoleBatch(t *testing.T) {
    request := dto.RevokeRoleBatchDto{
            Targets: nil,
            Roles: nil,
    }
    response := client.RevokeRoleBatch(&request)
    fmt.Println(response)
}


func TestClient_DeleteDepartment(t *testing.T) {
    request := dto.DeleteDepartmentReqDto{
            OrganizationCode: "organizationCode_7898",
            DepartmentId: "departmentId_8897",
            DepartmentIdType: ,
    }
    response := client.DeleteDepartment(&request)
    fmt.Println(response)
}


func TestClient_GetResourcesBatch(t *testing.T) {
    request := dto.GetResourcesBatchDto{
            CodeList: "codeList_1627",
            Namespace: "namespace_2983",
    }
    response := client.GetResourcesBatch(&request)
    fmt.Println(response)
}


func TestClient_CreateRole(t *testing.T) {
    request := dto.CreateRoleDto{
            Code: "code_70",
            Namespace: "namespace_5167",
            Description: "description_3228",
    }
    response := client.CreateRole(&request)
    fmt.Println(response)
}


func TestClient_GetNamespacesBatch(t *testing.T) {
    request := dto.GetNamespacesBatchDto{
            CodeList: "codeList_1740",
    }
    response := client.GetNamespacesBatch(&request)
    fmt.Println(response)
}


func TestClient_ListResources(t *testing.T) {
    request := dto.ListResourcesDto{
            Namespace: "namespace_3029",
            Type: "type_3240",
            Page: 0,
            Limit: 0,
    }
    response := client.ListResources(&request)
    fmt.Println(response)
}


func TestClient_GetExtIdp(t *testing.T) {
    request := dto.GetExtIdpDto{
            Id: "id_8918",
            TenantId: "tenantId_7944",
    }
    response := client.GetExtIdp(&request)
    fmt.Println(response)
}


func TestClient_ListArchivedUsers(t *testing.T) {
    request := dto.ListArchivedUsersDto{
            Page: 0,
            Limit: 0,
    }
    response := client.ListArchivedUsers(&request)
    fmt.Println(response)
}


func TestClient_DeleteRolesBatch(t *testing.T) {
    request := dto.DeleteRoleDto{
            CodeList: nil,
            Namespace: "namespace_5144",
    }
    response := client.DeleteRolesBatch(&request)
    fmt.Println(response)
}


func TestClient_CreateUser(t *testing.T) {
    request := dto.CreateUserReqDto{
            Status: ,
            Email: "email_5835",
            PasswordEncryptType: ,
            Phone: "phone_4953",
            PhoneCountryCode: "phoneCountryCode_6088",
            Username: "username_3276",
            Name: "name_3190",
            Nickname: "nickname_5535",
            Photo: "photo_1501",
            Gender: ,
            EmailVerified: false,
            PhoneVerified: false,
            Birthdate: "birthdate_2271",
            Country: "country_405",
            Province: "province_5583",
            City: "city_4082",
            Address: "address_7628",
            StreetAddress: "streetAddress_2665",
            PostalCode: "postalCode_2513",
            ExternalId: "externalId_784",
            DepartmentIds: nil,
            CustomData: nil,
            Password: "password_3785",
            TenantIds: nil,
            Identities: nil,
            Options: nil,
    }
    response := client.CreateUser(&request)
    fmt.Println(response)
}


func TestClient_SearchDepartments(t *testing.T) {
    request := dto.SearchDepartmentsReqDto{
            Search: "search_5854",
            OrganizationCode: "organizationCode_1752",
    }
    response := client.SearchDepartments(&request)
    fmt.Println(response)
}


func TestClient_GetUserGroups(t *testing.T) {
    request := dto.GetUserGroupsDto{
            UserId: "userId_789",
    }
    response := client.GetUserGroups(&request)
    fmt.Println(response)
}


func TestClient_IsUserExists(t *testing.T) {
    request := dto.IsUserExistsReqDto{
            Username: "username_9604",
            Email: "email_2780",
            Phone: "phone_7044",
            ExternalId: "externalId_6293",
    }
    response := client.IsUserExists(&request)
    fmt.Println(response)
}


func TestClient_KickUsers(t *testing.T) {
    request := dto.KickUsersDto{
            AppIds: nil,
            UserId: "userId_5104",
    }
    response := client.KickUsers(&request)
    fmt.Println(response)
}


func TestClient_CreateUserBatch(t *testing.T) {
    request := dto.CreateUserBatchReqDto{
            List: nil,
            Options: nil,
    }
    response := client.CreateUserBatch(&request)
    fmt.Println(response)
}


func TestClient_RemoveGroupMembers(t *testing.T) {
    request := dto.RemoveGroupMembersReqDto{
            UserIds: nil,
            Code: "code_9703",
    }
    response := client.RemoveGroupMembers(&request)
    fmt.Println(response)
}


func TestClient_ListRoleMembers(t *testing.T) {
    request := dto.ListRoleMembersDto{
            Code: "code_2861",
            Page: 0,
            Limit: 0,
            WithCustomData: false,
            WithIdentities: false,
            WithDepartmentIds: false,
            Namespace: "namespace_872",
    }
    response := client.ListRoleMembers(&request)
    fmt.Println(response)
}


func TestClient_CreateExtIdpConn(t *testing.T) {
    request := dto.CreateExtIdpConnDto{
            Fields: nil,
            DisplayName: "displayName_7799",
            Identifier: "identifier_6069",
            Type: ,
            ExtIdpId: "extIdpId_9458",
            LoginOnly: false,
            Logo: "logo_7996",
    }
    response := client.CreateExtIdpConn(&request)
    fmt.Println(response)
}


func TestClient_AssignRoleBatch(t *testing.T) {
    request := dto.AssignRoleBatchDto{
            Targets: nil,
            Roles: nil,
    }
    response := client.AssignRoleBatch(&request)
    fmt.Println(response)
}


func TestClient_DeleteExtIdpConn(t *testing.T) {
    request := dto.DeleteExtIdpConnDto{
            Id: "id_3553",
    }
    response := client.DeleteExtIdpConn(&request)
    fmt.Println(response)
}


func TestClient_GetGroup(t *testing.T) {
    request := dto.GetGroupDto{
            Code: "code_9948",
    }
    response := client.GetGroup(&request)
    fmt.Println(response)
}


func TestClient_GetCustomFields(t *testing.T) {
    request := dto.GetCustomFieldsDto{
            TargetType: "targetType_6791",
    }
    response := client.GetCustomFields(&request)
    fmt.Println(response)
}


func TestClient_CreateResource(t *testing.T) {
    request := dto.CreateResourceDto{
            Type: ,
            Code: "code_6877",
            Description: "description_4762",
            Actions: nil,
            ApiIdentifier: "apiIdentifier_521",
            Namespace: "namespace_519",
    }
    response := client.CreateResource(&request)
    fmt.Println(response)
}


func TestClient_UpdateResource(t *testing.T) {
    request := dto.UpdateResourceDto{
            Code: "code_3665",
            Description: "description_3254",
            Actions: nil,
            ApiIdentifier: "apiIdentifier_5164",
            Namespace: "namespace_2270",
            Type: ,
    }
    response := client.UpdateResource(&request)
    fmt.Println(response)
}


func TestClient_ListRoles(t *testing.T) {
    request := dto.ListRolesDto{
            Namespace: "namespace_8667",
            Page: 0,
            Limit: 0,
    }
    response := client.ListRoles(&request)
    fmt.Println(response)
}


func TestClient_CreateRolesBatch(t *testing.T) {
    request := dto.CreateRolesBatch{
            List: nil,
    }
    response := client.CreateRolesBatch(&request)
    fmt.Println(response)
}


func TestClient_DeleteExtIdp(t *testing.T) {
    request := dto.DeleteExtIdpDto{
            Id: "id_5139",
    }
    response := client.DeleteExtIdp(&request)
    fmt.Println(response)
}


func TestClient_CreateNamespace(t *testing.T) {
    request := dto.CreateNamespaceDto{
            Code: "code_7508",
            Name: "name_9713",
            Description: "description_8998",
    }
    response := client.CreateNamespace(&request)
    fmt.Println(response)
}


func TestClient_DeleteResource(t *testing.T) {
    request := dto.DeleteResourceDto{
            Code: "code_2243",
            Namespace: "namespace_1961",
    }
    response := client.DeleteResource(&request)
    fmt.Println(response)
}


func TestClient_GetDepartment(t *testing.T) {
    request := dto.GetDepartmentDto{
            OrganizationCode: "organizationCode_7418",
            DepartmentId: "departmentId_3675",
            DepartmentIdType: "departmentIdType_8967",
    }
    response := client.GetDepartment(&request)
    fmt.Println(response)
}


func TestClient_RevokeRole(t *testing.T) {
    request := dto.RevokeRoleDto{
            Targets: nil,
            Code: "code_1746",
            Namespace: "namespace_9387",
    }
    response := client.RevokeRole(&request)
    fmt.Println(response)
}


func TestClient_GetUserRoles(t *testing.T) {
    request := dto.GetUserRolesDto{
            UserId: "userId_8750",
            Namespace: "namespace_5251",
    }
    response := client.GetUserRoles(&request)
    fmt.Println(response)
}


func TestClient_CreateGroup(t *testing.T) {
    request := dto.CreateGroupReqDto{
            Description: "description_715",
            Name: "name_1878",
            Code: "code_6657",
    }
    response := client.CreateGroup(&request)
    fmt.Println(response)
}


func TestClient_SetUserDepartment(t *testing.T) {
    request := dto.SetUserDepartmentsDto{
            Departments: nil,
            UserId: "userId_8380",
    }
    response := client.SetUserDepartment(&request)
    fmt.Println(response)
}


func TestClient_ListOrganizations(t *testing.T) {
    request := dto.ListOrganizationsDto{
            Page: 0,
            Limit: 0,
    }
    response := client.ListOrganizations(&request)
    fmt.Println(response)
}


func TestClient_CreateExtIdp(t *testing.T) {
    request := dto.CreateExtIdpDto{
            Type: ,
            Name: "name_1550",
            TenantId: "tenantId_3102",
    }
    response := client.CreateExtIdp(&request)
    fmt.Println(response)
}


func TestClient_UpdateNamespace(t *testing.T) {
    request := dto.UpdateNamespaceDto{
            Code: "code_8527",
            Description: "description_6479",
            Name: "name_4334",
            NewCode: "newCode_8628",
    }
    response := client.UpdateNamespace(&request)
    fmt.Println(response)
}


func TestClient_DeleteUserBatch(t *testing.T) {
    request := dto.DeleteUsersBatchDto{
            UserIds: nil,
    }
    response := client.DeleteUserBatch(&request)
    fmt.Println(response)
}


func TestClient_GetGroupList(t *testing.T) {
    request := dto.ListGroupsDto{
            Page: 0,
            Limit: 0,
    }
    response := client.GetGroupList(&request)
    fmt.Println(response)
}


func TestClient_ListGroupMembers(t *testing.T) {
    request := dto.ListGroupMembersDto{
            Code: "code_9936",
            Page: 0,
            Limit: 0,
            WithCustomData: false,
            WithIdentities: false,
            WithDepartmentIds: false,
    }
    response := client.ListGroupMembers(&request)
    fmt.Println(response)
}


func TestClient_ListExtIdp(t *testing.T) {
    request := dto.ListExtIdpDto{
            TenantId: "tenantId_1328",
    }
    response := client.ListExtIdp(&request)
    fmt.Println(response)
}


func TestClient_UpdateDepartment(t *testing.T) {
    request := dto.UpdateDepartmentReqDto{
            OrganizationCode: "organizationCode_9222",
            ParentDepartmentId: "parentDepartmentId_9680",
            DepartmentId: "departmentId_4275",
            Code: "code_930",
            LeaderUserId: "leaderUserId_1549",
            Name: "name_9439",
            DepartmentIdType: ,
    }
    response := client.UpdateDepartment(&request)
    fmt.Println(response)
}


func TestClient_GetUserDepartments(t *testing.T) {
    request := dto.GetUserDepartmentsDto{
            UserId: "userId_407",
    }
    response := client.GetUserDepartments(&request)
    fmt.Println(response)
}


func TestClient_UpdateExtIdp(t *testing.T) {
    request := dto.UpdateExtIdpDto{
            Id: "id_9024",
            Name: "name_1707",
    }
    response := client.UpdateExtIdp(&request)
    fmt.Println(response)
}


func TestClient_CreateDepartment(t *testing.T) {
    request := dto.CreateDepartmentReqDto{
            OrganizationCode: "organizationCode_1237",
            Name: "name_9915",
            ParentDepartmentId: "parentDepartmentId_4526",
            OpenDepartmentId: "openDepartmentId_5397",
            Code: "code_8456",
            LeaderUserId: "leaderUserId_870",
            DepartmentIdType: ,
    }
    response := client.CreateDepartment(&request)
    fmt.Println(response)
}


func TestClient_UpdateGroup(t *testing.T) {
    request := dto.UpdateGroupReqDto{
            Description: "description_2466",
            Name: "name_9748",
            Code: "code_2809",
            NewCode: "newCode_1722",
    }
    response := client.UpdateGroup(&request)
    fmt.Println(response)
}


func TestClient_DeleteGroups(t *testing.T) {
    request := dto.DeleteGroupsReqDto{
            CodeList: nil,
    }
    response := client.DeleteGroups(&request)
    fmt.Println(response)
}


func TestClient_UpdateRole(t *testing.T) {
    request := dto.UpdateRoleDto{
            NewCode: "newCode_8752",
            Code: "code_3047",
            Namespace: "namespace_2695",
            Description: "description_376",
    }
    response := client.UpdateRole(&request)
    fmt.Println(response)
}


func TestClient_GetUserLoginHistory(t *testing.T) {
    request := dto.GetUserLoginHistoryDto{
            UserId: "userId_7246",
            AppId: "appId_6638",
            ClientIp: "clientIp_3050",
            Start: 0,
            End: 0,
            Page: 0,
            Limit: 0,
    }
    response := client.GetUserLoginHistory(&request)
    fmt.Println(response)
}


func TestClient_GetUserLoggedInApps(t *testing.T) {
    request := dto.GetUserLoggedinAppsDto{
            UserId: "userId_1810",
    }
    response := client.GetUserLoggedInApps(&request)
    fmt.Println(response)
}


func TestClient_GetUserAuthorizedApps(t *testing.T) {
    request := dto.GetUserAuthorizedAppsDto{
            UserId: "userId_9193",
    }
    response := client.GetUserAuthorizedApps(&request)
    fmt.Println(response)
}


func TestClient_GetGroupAuthorizedResources(t *testing.T) {
    request := dto.GetGroupAuthorizedResourcesDto{
            Code: "code_5382",
            Namespace: "namespace_107",
            ResourceType: "resourceType_5496",
    }
    response := client.GetGroupAuthorizedResources(&request)
    fmt.Println(response)
}


func TestClient_GetUserAccessibleApps(t *testing.T) {
    request := dto.GetUserAccessibleAppsDto{
            UserId: "userId_7524",
    }
    response := client.GetUserAccessibleApps(&request)
    fmt.Println(response)
}


func TestClient_GetUserAuthorizedResources(t *testing.T) {
    request := dto.GetUserAuthorizedResourcesDto{
            UserId: "userId_1642",
            Namespace: "namespace_8685",
            ResourceType: "resourceType_7457",
    }
    response := client.GetUserAuthorizedResources(&request)
    fmt.Println(response)
}


func TestClient_GetPrincipalAuthenticationInfo(t *testing.T) {
    request := dto.GetUserPrincipalAuthenticationInfoDto{
            UserId: "userId_7829",
    }
    response := client.GetPrincipalAuthenticationInfo(&request)
    fmt.Println(response)
}


func TestClient_ListChildrenDepartments(t *testing.T) {
    request := dto.ListChildrenDepartmentsDto{
            DepartmentId: "departmentId_2132",
            OrganizationCode: "organizationCode_5389",
            DepartmentIdType: "departmentIdType_4221",
    }
    response := client.ListChildrenDepartments(&request)
    fmt.Println(response)
}


func TestClient_GetRoleAuthorizedResources(t *testing.T) {
    request := dto.GetRoleAuthorizedResourcesDto{
            Code: "code_20",
            Namespace: "namespace_7340",
            ResourceType: "resourceType_124",
    }
    response := client.GetRoleAuthorizedResources(&request)
    fmt.Println(response)
}


func TestClient_ListDepartmentMembers(t *testing.T) {
    request := dto.ListDepartmentMembersDto{
            OrganizationCode: "organizationCode_5347",
            DepartmentId: "departmentId_2179",
            DepartmentIdType: "departmentIdType_6377",
            Page: 0,
            Limit: 0,
            WithCustomData: false,
            WithIdentities: false,
            WithDepartmentIds: false,
    }
    response := client.ListDepartmentMembers(&request)
    fmt.Println(response)
}


func TestClient_AddDepartmentMembers(t *testing.T) {
    request := dto.AddDepartmentMembersReqDto{
            UserIds: nil,
            OrganizationCode: "organizationCode_8148",
            DepartmentId: "departmentId_6842",
            DepartmentIdType: ,
    }
    response := client.AddDepartmentMembers(&request)
    fmt.Println(response)
}


func TestClient_RemoveDepartmentMembers(t *testing.T) {
    request := dto.RemoveDepartmentMembersReqDto{
            UserIds: nil,
            OrganizationCode: "organizationCode_7362",
            DepartmentId: "departmentId_6293",
            DepartmentIdType: ,
    }
    response := client.RemoveDepartmentMembers(&request)
    fmt.Println(response)
}


func TestClient_ListRoleDepartments(t *testing.T) {
    request := dto.ListRoleDepartmentsDto{
            Code: "code_4901",
            Namespace: "namespace_5508",
            Page: 0,
            Limit: 0,
    }
    response := client.ListRoleDepartments(&request)
    fmt.Println(response)
}


func TestClient_GetParentDepartment(t *testing.T) {
    request := dto.GetParentDepartmentDto{
            OrganizationCode: "organizationCode_2019",
            DepartmentId: "departmentId_3174",
            DepartmentIdType: "departmentIdType_7674",
    }
    response := client.GetParentDepartment(&request)
    fmt.Println(response)
}


func TestClient_CreateResourcesBatch(t *testing.T) {
    request := dto.CreateResourcesBatchDto{
            List: nil,
            Namespace: "namespace_996",
    }
    response := client.CreateResourcesBatch(&request)
    fmt.Println(response)
}


func TestClient_DeleteResourcesBatch(t *testing.T) {
    request := dto.DeleteResourcesBatchDto{
            CodeList: nil,
            Namespace: "namespace_9700",
    }
    response := client.DeleteResourcesBatch(&request)
    fmt.Println(response)
}


func TestClient_ListDepartmentMemberIds(t *testing.T) {
    request := dto.ListDepartmentMemberIdsDto{
            OrganizationCode: "organizationCode_4878",
            DepartmentId: "departmentId_5224",
            DepartmentIdType: "departmentIdType_8269",
    }
    response := client.ListDepartmentMemberIds(&request)
    fmt.Println(response)
}


func TestClient_CreateNamespacesBatch(t *testing.T) {
    request := dto.CreateNamespacesBatchDto{
            List: nil,
    }
    response := client.CreateNamespacesBatch(&request)
    fmt.Println(response)
}


func TestClient_ResetPrincipalAuthenticationInfo(t *testing.T) {
    request := dto.ResetUserPrincipalAuthenticationInfoDto{
            UserId: "userId_7698",
    }
    response := client.ResetPrincipalAuthenticationInfo(&request)
    fmt.Println(response)
}


func TestClient_DeleteNamespacesBatch(t *testing.T) {
    request := dto.DeleteNamespacesBatchDto{
            CodeList: nil,
    }
    response := client.DeleteNamespacesBatch(&request)
    fmt.Println(response)
}


func TestClient_GetTargetAuthorizedResources(t *testing.T) {
    request := dto.GetAuthorizedResourcesDto{
            TargetType: "targetType_9851",
            TargetIdentifier: "targetIdentifier_8941",
            Namespace: "namespace_7824",
            ResourceType: "resourceType_2521",
    }
    response := client.GetTargetAuthorizedResources(&request)
    fmt.Println(response)
}



