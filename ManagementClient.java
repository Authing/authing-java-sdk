import client.ManagementClient;
import dto.*;
import model.ManagementClientOptions;
import org.junit.jupiter.api.Test;


public class ManagementClientTest {

    @Test
    public void getManagementTokenTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetManagementAccessTokenDto arg0 = new GetManagementAccessTokenDto();
        arg0.setSecret("3532bc83-20cc-4590-b6f3-42c3c06d0fb0")
        arg0.setUserPoolId("003911e8-5dbc-4c2f-a9a3-9c176fd6804e")

        GetManagementTokenRespDto response = client.getManagementToken(arg0);
    }


    @Test
    public void getNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetNamespaceDto arg0 = new GetNamespaceDto();
        arg0.setCode("831502ed-3dd8-4e75-bcfc-e791f12147cb")

        NamespaceRespDto response = client.getNamespace(arg0);
    }


    @Test
    public void hasAnyRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        HasAnyRoleDto arg0 = new HasAnyRoleDto();
        arg0.setHasAnyRole("0d6b5807-072c-482f-9071-544cdf602a31")

        HasAnyRoleRespDto response = client.hasAnyRole(arg0);
    }


    @Test
    public void getUserAuthorizedAppsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserAccessibleAppsReqDto arg0 = new GetUserAccessibleAppsReqDto();
        arg0.setUserId("7fb32a8a-35c7-4689-9911-a8f45071ae45")

        AppListRespDto response = client.getUserAuthorizedApps(arg0);
    }


    @Test
    public void getTargetAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetAuthorizedResourcesDto arg0 = new GetAuthorizedResourcesDto();
        arg0.setTargetIdentifier("c2e67d05-fc3f-4dc0-b098-355e1883d1a3")
        arg0.setTargetType("4a3d3186-105d-42b8-8b6f-b40a39521748")
        arg0.setNamespace("7a4acfd6-a503-4bf8-b208-7ab0314d2ec1")
        arg0.setResourceType("a4737b46-01be-436f-89f6-df4203272f50")

        IsSuccessRespDto response = client.getTargetAuthorizedResources(arg0);
    }


    @Test
    public void listDepartmentMemberIdsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListChildrenDepartmentsReqDto arg0 = new ListChildrenDepartmentsReqDto();
        arg0.setDepartmentId("9bd743d9-571d-4210-ae15-5bab9393c9aa")
        arg0.setOrganizationCode("b76fffc2-090a-4e04-9757-cdc3a3291030")

        Object response = client.listDepartmentMemberIds(arg0);
    }


    @Test
    public void createNamespacesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateNamespacesBatchDto arg0 = new CreateNamespacesBatchDto();
        arg0.setList("3ad8e5db-bfe7-42e3-bfd6-29375e4a18f4")

        IsSuccessRespDto response = client.createNamespacesBatch(arg0);
    }


    @Test
    public void getGroupAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetGroupAuthorizedResourcesDto arg0 = new GetGroupAuthorizedResourcesDto();
        arg0.setCode("5766c87f-8fef-4804-bb3c-62bdc3f3efcc")
        arg0.setNamespace("bbf1751b-24a8-4ad4-a96d-097500647c1b")
        arg0.setResourceType("2bc99f4c-57b8-4d30-aeb5-d587b4bc556f")

        AuthorizedResourceListRespDto response = client.getGroupAuthorizedResources(arg0);
    }


    @Test
    public void getParentDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetParentDepartmentReqDto arg0 = new GetParentDepartmentReqDto();
        arg0.setDepartmentId("c9138c81-d96d-4c45-9281-56b7ea97f6ab")
        arg0.setOrganizationCode("1d593e69-013e-429d-8332-a8dc5a7cc3d9")

        DepartmentSingleRespDto response = client.getParentDepartment(arg0);
    }


    @Test
    public void addDepartmentMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AddDepartmentMembersReqDto arg0 = new AddDepartmentMembersReqDto();
        arg0.setDepartmentId("3d1f33d4-a5c9-4cad-a3e0-a72b7a375481")
        arg0.setOrganizationCode("893f2b7e-3a1d-4a02-99b4-7eda7601daee")
        arg0.setUserIds("3fdd514e-4918-49b2-8432-afed61e632e0")

        IsSuccessRespDto response = client.addDepartmentMembers(arg0);
    }


    @Test
    public void createResourcesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateResourcesBatchDto arg0 = new CreateResourcesBatchDto();
        arg0.setList("85eb4f20-6bd4-412a-9843-6846ef80b788")
        arg0.setNamespace("31df682e-4ea0-481a-aa73-65ddf23129be")

        IsSuccessRespDto response = client.createResourcesBatch(arg0);
    }


    @Test
    public void listChildrenDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListChildrenDepartmentsReqDto arg0 = new ListChildrenDepartmentsReqDto();
        arg0.setDepartmentId("e5612e88-b565-4acf-8921-16da784d3ddc")
        arg0.setOrganizationCode("e3d2fb7e-459b-48bb-8d07-a3d975fa56a1")

        DepartmentPaginatedRespDto response = client.listChildrenDepartments(arg0);
    }


    @Test
    public void getUserAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserAuthorizedResourcesDto arg0 = new GetUserAuthorizedResourcesDto();
        arg0.setUserId("e24cc6eb-f767-432f-a6fd-cd759edd9201")
        arg0.setOptions("ca3f9ffa-2127-481b-9a30-2c781135b2bf")

        AuthorizedResourcePaginatedRespDto response = client.getUserAuthorizedResources(arg0);
    }


    @Test
    public void getUserLoginHistoryTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserLoginHistoryDto arg0 = new GetUserLoginHistoryDto();
        arg0.setUserId("9f9f8c0f-e121-4e6e-9c71-5913de370dd3")
        arg0.setAppId("82657e47-3224-499b-a552-1c7255e61a45")
        arg0.setClientIp("219bc6c7-1ff1-46e1-9177-b984f92a46c7")
        arg0.setStart("edcaf9ee-bbb4-4f34-a19c-798a0e03e42c")
        arg0.setEnd("50847818-b696-471b-9f5e-4e61f13448dd")
        arg0.setOptions("3779a702-be9c-45b5-865a-2aca20f74f23")

        UserLoginHistoryPaginatedRespDto response = client.getUserLoginHistory(arg0);
    }


    @Test
    public void getUserAccessibleAppsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserAccessibleAppsReqDto arg0 = new GetUserAccessibleAppsReqDto();
        arg0.setUserId("06ec4581-eca7-47cd-b95d-26f75e7ece40")

        AppListRespDto response = client.getUserAccessibleApps(arg0);
    }


    @Test
    public void deleteResourcesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteResourcesBatchDto arg0 = new DeleteResourcesBatchDto();
        arg0.setCodeList("537b09c6-d9b8-4f71-835c-4c4291f86052")
        arg0.setNamespace("8cec6037-9f46-463d-b649-067ce6419537")

        IsSuccessRespDto response = client.deleteResourcesBatch(arg0);
    }


    @Test
    public void resetPrincipalAuthenticationInfoTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ResetUserPrincipalAuthenticationInfoDto arg0 = new ResetUserPrincipalAuthenticationInfoDto();
        arg0.setUserId("d5dc82e3-9f91-444e-b05f-1f2b364fb1e5")

        IsSuccessRespDto response = client.resetPrincipalAuthenticationInfo(arg0);
    }


    @Test
    public void getUserLoggedInAppsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserLoggedInAppsReqDto arg0 = new GetUserLoggedInAppsReqDto();
        arg0.setUserId("dc5fa396-1e4f-42fa-a0cb-5f430bfe5c00")

        UserLoggedInAppsListRespDto response = client.getUserLoggedInApps(arg0);
    }


    @Test
    public void getRoleAuthorizedResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        RoleAuthorizedResourcesDto arg0 = new RoleAuthorizedResourcesDto();
        arg0.setCode("5a542317-157a-43bf-832d-a6ac1702120b")
        arg0.setNamespace("ee9f747d-b172-4dda-8ccc-86440f445cd8")
        arg0.setResourceType("7de15373-8827-44ab-9487-7e28634c00c5")

        IsSuccessRespDto response = client.getRoleAuthorizedResources(arg0);
    }


    @Test
    public void listDepartmentMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListDepartmentMembersReqDto arg0 = new ListDepartmentMembersReqDto();
        arg0.setDepartmentId("f601a964-f1d9-44b0-9080-601fdabc6b8a")
        arg0.setOrganizationCode("83d37935-f981-4c65-8458-c191ebae702a")
        arg0.setOptions("6127430b-1024-4ca2-9591-d67074b26b15")

        UserListRespDto response = client.listDepartmentMembers(arg0);
    }


    @Test
    public void deketeNamespacesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteNamespacesBatchDto arg0 = new DeleteNamespacesBatchDto();
        arg0.setCodeList("ee9cd920-7f37-46e2-8937-29e725a08ac7")

        IsSuccessRespDto response = client.deketeNamespacesBatch(arg0);
    }


    @Test
    public void removeDepartmentMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AddDepartmentMembersReqDto arg0 = new AddDepartmentMembersReqDto();
        arg0.setDepartmentId("7d286ea0-10c0-46fb-b658-32e86922b5e4")
        arg0.setOrganizationCode("3ff07f94-cab0-40cf-aef0-34a84c4bbf18")
        arg0.setUserIds("48d70b16-8aaf-49f8-800e-5dbb96fd40fe")

        IsSuccessRespDto response = client.removeDepartmentMembers(arg0);
    }


    @Test
    public void getPrincipalAuthenticationInfoTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserPrincipalAuthenticationInfoDto arg0 = new GetUserPrincipalAuthenticationInfoDto();
        arg0.setUserId("e06395f7-ade6-4063-bac9-5010fa8627ea")

        PrincipalAuthenticationInfoPaginatedRespDto response = client.getPrincipalAuthenticationInfo(arg0);
    }


    @Test
    public void listUsersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListUsersDto arg0 = new ListUsersDto();
        arg0.setOptions("bc62a1b2-73bc-4ec2-993d-f100aae42b4a")

        UserPaginatedRespDto response = client.listUsers(arg0);
    }


    @Test
    public void getUserIdentitiesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserIdentitiesDto arg0 = new GetUserIdentitiesDto();
        arg0.setUserId("3c859641-ec22-4056-9c64-163962d29295")

        IdentityListRespDto response = client.getUserIdentities(arg0);
    }


    @Test
    public void getUserCustomDataTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserCustomDataDto arg0 = new GetUserCustomDataDto();
        arg0.setUserId("92a0c784-e7f7-4a0d-9fb1-7e78865ca0ec")

        Object response = client.getUserCustomData(arg0);
    }


    @Test
    public void getUserRolesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserRolesDto arg0 = new GetUserRolesDto();
        arg0.setUserId("fb889d87-9d83-4b4a-a23f-4942694bbc0e")
        arg0.setNamespace("77a76aec-0d49-465c-b8d0-2a2daab5595d")

        RolePaginatedRespDto response = client.getUserRoles(arg0);
    }


    @Test
    public void setUserCustomDataTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        SetUserCustomDataDto arg0 = new SetUserCustomDataDto();
        arg0.setSuccess("0189f565-3bf1-4084-aa38-499a3b07a0df")

        SetUserCustomDataRespDto response = client.setUserCustomData(arg0);
    }


    @Test
    public void getUserDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserDepartmentsDto arg0 = new GetUserDepartmentsDto();
        arg0.setUserId("0dfced96-a79b-47c7-b5b2-06883b4066ba")

        UserDepartmentPaginatedRespDto response = client.getUserDepartments(arg0);
    }


    @Test
    public void getUserTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserDto arg0 = new GetUserDto();
        arg0.setUserId("08495e89-4e8a-46bd-a003-7a3f78960e00")
        arg0.setOptions("99c870d3-506d-4e5d-9e59-a8119040b114")

        UserSingleRespDto response = client.getUser(arg0);
    }


    @Test
    public void setUserDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        SetUserDepartmentsDto arg0 = new SetUserDepartmentsDto();
        arg0.setDepartments("68d87d50-1d42-4ca5-a5a7-3df59a6ecaa5")
        arg0.setUserId("965e0e44-9425-4333-81ce-2d3ad4abe66b")

        IsSuccessRespDto response = client.setUserDepartment(arg0);
    }


    @Test
    public void getUserGroupsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserGroupsDto arg0 = new GetUserGroupsDto();
        arg0.setUserId("c4ed768c-2158-4626-b0cb-45f5abd0aa52")

        GroupPaginatedRespDto response = client.getUserGroups(arg0);
    }


    @Test
    public void deleteUserBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteUsersBatchDto arg0 = new DeleteUsersBatchDto();
        arg0.setUserIds("8281a7f1-cb9b-4de0-b628-376a113d71b6")

        IsSuccessRespDto response = client.deleteUserBatch(arg0);
    }


    @Test
    public void getUserMfaInfoTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserMfaInfoDto arg0 = new GetUserMfaInfoDto();
        arg0.setUserId("bf76d42f-c170-455e-82a2-149fa4a2ade6")

        UserMfaSingleRespDto response = client.getUserMfaInfo(arg0);
    }


    @Test
    public void listArchivedUsersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListArchivedUsersDto arg0 = new ListArchivedUsersDto();
        arg0.setOptions("fc07cb6f-dbb0-4389-8b76-6fe30445b4f3")

        ListArchivedUsersSingleRespDto response = client.listArchivedUsers(arg0);
    }


    @Test
    public void getUserBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserBatchDto arg0 = new GetUserBatchDto();
        arg0.setUserIds("aa9a3278-7579-42e6-a35a-d9588fbeb7ea")
        arg0.setOptions("12b0def5-8131-4b4a-b10f-4591e1114076")

        UserListRespDto response = client.getUserBatch(arg0);
    }


    @Test
    public void listDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListRoleDepartmentDto arg0 = new ListRoleDepartmentDto();
        arg0.setCode("9c58578f-7bee-481a-b1c8-5327883b6fab")
        arg0.setNamespace("7bec1e81-6b87-4606-966d-465ce542f6ba")
        arg0.setOptions("e30f4868-e780-4a15-a747-ea16a8953d82")

        UserListRespDto response = client.listDepartments(arg0);
    }


    @Test
    public void createUserTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateUserReqDto arg0 = new CreateUserReqDto();
        arg0.setStatus("7ef193d4-2567-4958-acd7-6625aca82392")
        arg0.setEmail("c48b49e2-4108-4f60-af77-239684f70388")
        arg0.setPhone("d45c10fa-7007-494e-8b3d-14e87f66c233")
        arg0.setPhoneCountryCode("0d7ab3fa-add1-477f-9ded-eb68f3808a47")
        arg0.setUsername("e67b76c8-0746-4a8a-b5b5-a6691685e562")
        arg0.setName("7477d3c2-2e58-4a68-9ec2-65620d442257")
        arg0.setNickname("78eaadde-1f24-457e-a043-314e10614997")
        arg0.setPhoto("f4d96333-35a7-4454-b9a0-4b56a9b88631")
        arg0.setGender("0d6fbe16-666e-4c8f-bcd5-f9d9b661fcc1")
        arg0.setEmailVerified("cf2feb3a-4903-460d-b661-2e008f9f1b32")
        arg0.setPhoneVerified("5a64dbce-2547-4d52-aa3b-52166f5a4511")
        arg0.setExternalId("2ef406ba-a9db-4b6b-8366-add0b4b8c334")
        arg0.setDepartmentIds("0f6230fd-8b42-45a9-902e-21caca70b0d0")
        arg0.setCustomData("8d3728ad-f1a8-467b-9983-6d46c6bd060e")
        arg0.setPassword("a2119f33-6648-429e-838f-a347340e39ca")
        arg0.setTenantIds("a0c41b46-ba87-4e51-9058-310b95e0338b")
        arg0.setIdentities("80a122e9-9583-4c8a-b90a-5358fa89c354")
        arg0.setOptions("97345c94-ad27-48c8-910b-1474226e6415")

        UserSingleRespDto response = client.createUser(arg0);
    }


    @Test
    public void createOrganizationTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateOrganizationReqDto arg0 = new CreateOrganizationReqDto();
        arg0.setOrganizationName("309e72cb-be32-4354-86e7-dfbf810a9ece")
        arg0.setOrganizationCode("a2b33400-8b08-41e2-8bbc-87f44344709c")

        OrganizationSingleRespDto response = client.createOrganization(arg0);
    }


    @Test
    public void deleteOrganizationTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteOrganizationReqDto arg0 = new DeleteOrganizationReqDto();
        arg0.setOrganizationCode("3a8d470b-240d-4051-864f-30ffb4e03779")

        IsSuccessRespDto response = client.deleteOrganization(arg0);
    }


    @Test
    public void createDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateDepartmentReqDto arg0 = new CreateDepartmentReqDto();
        arg0.setOrganizationCode("05b91437-cbf0-4888-8021-b9b45bbc2990")
        arg0.setName("a862bef6-48c7-4da5-a116-091e54cd17ab")
        arg0.setParentDepartmentId("42ef658f-65d2-43a7-b853-f4c26c6f7dde")
        arg0.setCode("19b2c843-ae71-48fc-9826-b68a3ca429b5")
        arg0.setLeaderUserId("3ec2d229-b938-4f97-a648-468842eff458")

        DepartmentSingleRespDto response = client.createDepartment(arg0);
    }


    @Test
    public void getDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetDepartmentReqDto arg0 = new GetDepartmentReqDto();
        arg0.setDepartmentId("8de77ba9-64f1-4dd6-a00e-b4b5222c2594")
        arg0.setOrganizationCode("14343544-ea92-462c-9979-02f3952cb243")

        DepartmentSingleRespDto response = client.getDepartment(arg0);
    }


    @Test
    public void searchDepartmentsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        SearchDepartmentsReqDto arg0 = new SearchDepartmentsReqDto();
        arg0.setSearch("c8b5e5f0-9724-4a5f-a7dc-228001a87f57")
        arg0.setOrganizationCode("abbfac57-e369-4653-bcd9-197874da760e")

        DepartmentListRespDto response = client.searchDepartments(arg0);
    }


    @Test
    public void listExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        TenantIdDto arg0 = new TenantIdDto();
        arg0.setTenantId("0c8aaccd-32ee-4674-91d3-c7e11c7837e2")

        ExtIdpDto response = client.listExtIdp(arg0);
    }


    @Test
    public void getExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetExtIdpDto arg0 = new GetExtIdpDto();
        arg0.setId("fb3c17c3-28a4-4670-b976-de924ea5496d")
        arg0.setTenantId("d32489fd-e8ee-4f0c-8dd1-d8dacfc936b4")

        ExtIdpDto response = client.getExtIdp(arg0);
    }


    @Test
    public void listOrganizationsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListOrganizationsReqDto arg0 = new ListOrganizationsReqDto();
        arg0.setOptions("6b6db6c1-2be4-4366-a458-5032334e61ce")

        OrganizationPaginatedRespDto response = client.listOrganizations(arg0);
    }


    @Test
    public void updateUserTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateUserReqDto arg0 = new UpdateUserReqDto();
        arg0.setPhoneVerified("71232357-84a1-4db3-b533-fb81000ef12e")
        arg0.setEmailVerified("4c297620-8e8b-48cd-9636-79ffb3b0e834")
        arg0.setGender("5d483176-fe3c-4643-8e19-b76b28c46697")
        arg0.setUserId("577fee2c-83d1-4c49-840b-ca6ce4b4dfe1")
        arg0.setPhoneCountryCode("4b31f561-46b7-4038-b157-bcad8a90844d")
        arg0.setName("465cc36e-2961-4ea2-889e-c9c3ab421d64")
        arg0.setNickname("1b7f3ebc-1ad0-4c21-a832-b02b5950cd40")
        arg0.setPhoto("0f77e72f-2185-4bb6-8a68-d07378a537b0")
        arg0.setExternalId("b185b8e6-8398-47ed-8c30-29f11bea58ca")
        arg0.setCustomData("00f99dd5-e10a-4ebc-95f4-d3ebe78ad977")
        arg0.setUsername("809c2e4e-57ee-44df-99f1-a0a534ed50cb")
        arg0.setEmail("b141b3a7-d61a-442a-af6b-608f0c9043ee")
        arg0.setPhone("a3ed225c-a069-47ff-b8b1-28f9ebcd7978")
        arg0.setPassword("00898c98-4b0c-42ce-81ae-bcc1bc853085")

        UserSingleRespDto response = client.updateUser(arg0);
    }


    @Test
    public void deleteGroupsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteGroupsReqDto arg0 = new DeleteGroupsReqDto();
        arg0.setCodeList("02846532-df10-4d13-ad09-5cfbc6ab7c09")

        IsSuccessRespDto response = client.deleteGroups(arg0);
    }


    @Test
    public void createExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateExtIdpDto arg0 = new CreateExtIdpDto();
        arg0.setType("492b7a97-3010-478f-a7c3-f8b62df4ad1f")
        arg0.setName("6ee71ada-d391-4bfd-a54a-cbf0804c387c")
        arg0.setTenantId("675222dc-f7da-465e-a62c-e3e7ff85a4eb")

        ExtIdpDto response = client.createExtIdp(arg0);
    }


    @Test
    public void updateExtIdpConnTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateExtIdpConnDto arg0 = new UpdateExtIdpConnDto();
        arg0.setLoginOnly("7988f5a9-cc86-41e4-99eb-344c25d6aad6")
        arg0.setAssociationMode("3a85c601-4494-4cb0-a104-feee1cd7aa03")
        arg0.setLogo("e0a4dc4c-bad8-4a97-ba12-f89b036be99a")
        arg0.setFields("811022dc-cfbc-4ed4-83df-ef62d23c4e66")
        arg0.setDisplayName("3d30cec1-6183-4932-a237-96a86c1dfd08")
        arg0.setId("6f3bcf52-a5f0-47ff-9889-ca5ec3fc7fcf")

        ExtIdpConnDetail response = client.updateExtIdpConn(arg0);
    }


    @Test
    public void changeConnStateTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        EnableExtIdpConnDto arg0 = new EnableExtIdpConnDto();
        arg0.setTenantId("fbb40e66-23f0-441f-9fd4-f872cf7ace55")
        arg0.setAppId("c19a2ff2-f609-43b3-8481-711649942a24")
        arg0.setEnabled("041a6dd5-6fc7-4de6-92b4-544703c73465")
        arg0.setId("edd4d320-92ee-447b-953a-e2e187d84c62")

        IsSuccessRespDto response = client.changeConnState(arg0);
    }


    @Test
    public void getCustomFieldsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetUserDefinedFieldsDto arg0 = new GetUserDefinedFieldsDto();
        arg0.setTargetType("1d5d066a-adf8-4074-ae15-e61fed5d2ff9")

        CustomFieldListRespDto response = client.getCustomFields(arg0);
    }


    @Test
    public void deleteExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteExtIdpDto arg0 = new DeleteExtIdpDto();
        arg0.setId("345e66f7-e2ff-497e-8bae-e45ffab1f82d")

        ExtIdpDto response = client.deleteExtIdp(arg0);
    }


    @Test
    public void setCustomFieldsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        SetCustomFieldsReqDto arg0 = new SetCustomFieldsReqDto();
        arg0.setList("c51df25d-fcf6-4e16-af25-79c401b9efb5")

        CustomFieldListRespDto response = client.setCustomFields(arg0);
    }


    @Test
    public void kickUsersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        KickUsersDto arg0 = new KickUsersDto();
        arg0.setAppIds("8f365316-0357-41ed-ae7b-f1e63449932b")
        arg0.setUserId("dee080fd-8641-4edc-8baf-616edb60d3ff")

        IsUserExistsRespDto response = client.kickUsers(arg0);
    }


    @Test
    public void revokeRoleBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        RevokeRoleBatchDto arg0 = new RevokeRoleBatchDto();
        arg0.setTargets("9ca3004a-a284-440c-811a-5a579fc6fec5")
        arg0.setRoles("6ea4b96b-000a-412c-954a-a0da0c1f565b")

        IsSuccessRespDto response = client.revokeRoleBatch(arg0);
    }


    @Test
    public void assignRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AssignRoleDto arg0 = new AssignRoleDto();
        arg0.setTargets("375da340-eb78-4c1d-915a-8c59384ced11")
        arg0.setCode("ef653cd0-223c-4942-aed0-17261542403b")
        arg0.setNamespace("38a5c442-9b0c-4cf2-a5b0-b548c8a75292")

        IsSuccessRespDto response = client.assignRole(arg0);
    }


    @Test
    public void deleteExtIdpConnTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteExtIdpConnDto arg0 = new DeleteExtIdpConnDto();
        arg0.setId("66a794c8-711c-46e2-89d1-febd685592bb")

        IsSuccessRespDto response = client.deleteExtIdpConn(arg0);
    }


    @Test
    public void listResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListResourcesDto arg0 = new ListResourcesDto();
        arg0.setNamespace("346ba049-95eb-4d87-8517-5df69776995a")
        arg0.setType("29043b50-6f5f-4f1d-b939-3eaa9003e9b7")
        arg0.setOptions("a01c5b26-4b02-42be-b221-1af713e2ad66")

        ResourcePaginatedRespDto response = client.listResources(arg0);
    }


    @Test
    public void getNamespacesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetNamespacesBatchDto arg0 = new GetNamespacesBatchDto();
        arg0.setCodeList("bd669a7a-9956-4008-a330-bab2a33cc844")

        NamespaceListRespDto response = client.getNamespacesBatch(arg0);
    }


    @Test
    public void deketeNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteNamespaceDto arg0 = new DeleteNamespaceDto();
        arg0.setCode("2f444ab7-55dc-4b37-b81f-bbef6337ce0d")

        IsSuccessRespDto response = client.deketeNamespace(arg0);
    }


    @Test
    public void createUserBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateUserBatchReqDto arg0 = new CreateUserBatchReqDto();
        arg0.setList("8736428d-8a6f-4063-b015-f96993e9cb6a")
        arg0.setOptions("3def2b96-ce12-4597-b04a-92195caf4b33")

        UserListRespDto response = client.createUserBatch(arg0);
    }


    @Test
    public void updateResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateResourceDto arg0 = new UpdateResourceDto();
        arg0.setActions("b2c4d910-eaf4-4920-8d11-26fa3f547b48")
        arg0.setType("f6ef6b68-829a-43bb-9c58-b376c7af3af6")
        arg0.setCode("3e40b235-9925-48bc-ab89-3caf9ca77e5c")
        arg0.setDescription("ba06660f-3c12-4843-adfb-a891064f5599")
        arg0.setApiIdentifier("4ff9437d-27bb-4308-b853-71089f37d75f")
        arg0.setNamespace("5362b459-bf6e-4dbd-bac5-465d8d4dbe00")

        ResourceRespDto response = client.updateResource(arg0);
    }


    @Test
    public void authorizeResourcesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AuthorizeResourcesDto arg0 = new AuthorizeResourcesDto();
        arg0.setList("80c7734f-6ecc-4042-a446-444759fd3e34")
        arg0.setNamespace("495198a0-96f7-46e5-89ed-83637520be2d")

        IsSuccessRespDto response = client.authorizeResources(arg0);
    }


    @Test
    public void createExtIdpConnTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateExtIdpConnDto arg0 = new CreateExtIdpConnDto();
        arg0.setFields("8fe44459-96c8-4618-97d0-6af43c67c2b7")
        arg0.setLogo("3bd14985-62cd-4341-83f2-7e345f5290a8")
        arg0.setIdentifier("d8608c22-cdbb-49ae-87fe-c1f26c5ea168")
        arg0.setType("02a70fd2-ef1a-4fe1-95f8-eb3ddf415774")
        arg0.setExtIdpId("58d43813-9b7a-4503-9436-2e625dd20a5d")
        arg0.setDisplayName("3f15cbb2-0e3c-4cd6-9e7e-a5277a8ecf21")

        ExtIdpConnDetail response = client.createExtIdpConn(arg0);
    }


    @Test
    public void getResourcesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetResourcesBatchDto arg0 = new GetResourcesBatchDto();
        arg0.setCodeList("1437c380-1fcf-4db0-b045-3ccb5d2a5fd3")
        arg0.setNamespace("211ec3cd-0395-4e4b-84b0-a98eab8161a9")

        ResourceListRespDto response = client.getResourcesBatch(arg0);
    }


    @Test
    public void listRolesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListRoleDto arg0 = new ListRoleDto();
        arg0.setNamespace("1508faf6-4314-4e47-a212-50a47055eecb")
        arg0.setOptions("e9b61228-893f-45cd-9d05-855e61d351b7")

        RolePaginatedRespDto response = client.listRoles(arg0);
    }


    @Test
    public void createNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateNamespaceDto arg0 = new CreateNamespaceDto();
        arg0.setCode("808d84eb-14af-4a5d-b161-dfb502f26371")
        arg0.setName("b3ffd18f-3e32-4b07-9f21-2795e6642a19")
        arg0.setDescription("df03d7e7-084f-4145-9d11-4ca9cb779ac9")

        ResourceDto response = client.createNamespace(arg0);
    }


    @Test
    public void updateNamespaceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateNamespaceDto arg0 = new UpdateNamespaceDto();
        arg0.setNewCode("aa895121-6313-48c8-a382-697e6209b27c")
        arg0.setCode("8502d1e7-b9e1-48fe-829c-b0541af1cf3a")
        arg0.setDescription("0b9076d3-e3f2-419e-be68-fbb0566e839a")
        arg0.setName("246240b9-84e1-4329-a5b0-9a4534a8d098")

        NamespaceDto response = client.updateNamespace(arg0);
    }


    @Test
    public void removeGroupMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        RemoveGroupMembersReqDto arg0 = new RemoveGroupMembersReqDto();
        arg0.setUserIds("bfd8f367-9c38-4fc1-b0bf-204052056685")
        arg0.setCode("d03c0a60-a1df-4269-a722-857a7d15de06")

        IsSuccessRespDto response = client.removeGroupMembers(arg0);
    }


    @Test
    public void deleteRolesTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteRoleDto arg0 = new DeleteRoleDto();
        arg0.setCodeList("d740cb67-98b3-4d6e-8440-36f1d3d5b1ea")
        arg0.setNamespace("08a59483-8ecc-4047-9c3b-00ac91e5b584")

        IsSuccessRespDto response = client.deleteRoles(arg0);
    }


    @Test
    public void createGroupBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateGroupBatchReqDto arg0 = new CreateGroupBatchReqDto();
        arg0.setList("765a1fbe-325c-42bf-8fb0-042cfa740cf5")

        GroupListRespDto response = client.createGroupBatch(arg0);
    }


    @Test
    public void deleteResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteResourceDto arg0 = new DeleteResourceDto();
        arg0.setCode("85a82e63-47d9-4e73-b43d-867026ee3c72")
        arg0.setNamespace("fb475207-9cf8-4716-b2fb-557733c441b3")

        IsSuccessRespDto response = client.deleteResource(arg0);
    }


    @Test
    public void revokeRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        RevokeRoleDto arg0 = new RevokeRoleDto();
        arg0.setTargets("7ab8c3f1-d1e0-42d8-850e-bc3d0a7c1499")
        arg0.setCode("be736404-a005-435a-aa60-642e96ce4c2e")
        arg0.setNamespace("e12266cf-e3ac-4949-ab7d-ca35d0d9ba7d")

        IsSuccessRespDto response = client.revokeRole(arg0);
    }


    @Test
    public void updateOrganizationTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateOrganizationReqDto arg0 = new UpdateOrganizationReqDto();
        arg0.setOrganizationCode("355808cc-171d-4f86-a413-8849c50eee4e")
        arg0.setOrganizationNewCode("d2558723-a8ae-4da6-ae90-71058d407864")
        arg0.setOrganizationName("869b4379-2508-402d-af56-cde3bc2b40d2")

        OrganizationSingleRespDto response = client.updateOrganization(arg0);
    }


    @Test
    public void isUserExistsTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        IsUserExistsReqDto arg0 = new IsUserExistsReqDto();
        arg0.setUsername("b44b83a1-8cb6-447b-9c01-b344dc529d2e")
        arg0.setEmail("3bc66228-05e3-443b-b7f1-fc55465319b7")
        arg0.setPhone("2b8a29c2-d78e-4d15-a8f0-def1b5614deb")
        arg0.setExternalId("30f4cd85-e195-4f8c-a027-bb1a948559a6")

        IsUserExistsRespDto response = client.isUserExists(arg0);
    }


    @Test
    public void updateGroupTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateGroupReqDto arg0 = new UpdateGroupReqDto();
        arg0.setNewCode("bc953a76-3888-4e39-a15c-7cd3411225b0")
        arg0.setDescription("b107af51-9ce6-41cc-8bb0-24a2db8e1487")
        arg0.setName("c3661fa6-bcc0-4487-bdd5-0552099efac6")
        arg0.setCode("8ae45a65-7363-42a8-b287-4a4e5372dceb")

        GroupSingleRespDto response = client.updateGroup(arg0);
    }


    @Test
    public void assignRoleBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AssignRoleBatchDto arg0 = new AssignRoleBatchDto();
        arg0.setTargets("c1e06b34-57a4-4d58-a772-622bcfda39b4")
        arg0.setRoles("e54f00cc-5684-4ea6-b6b9-9dfe33b2f10c")

        IsSuccessRespDto response = client.assignRoleBatch(arg0);
    }


    @Test
    public void updateDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateDepartmentReqDto arg0 = new UpdateDepartmentReqDto();
        arg0.setOrganizationCode("ea2f5a09-bfbc-4be8-b0ff-9d0306cb582a")
        arg0.setName("14f3c652-28ab-48a7-849a-09cb8d34f229")
        arg0.setParentDepartmentId("867339f2-fe71-4412-9bba-b43190cb096f")
        arg0.setDepartmentId("3ba864ed-2c35-4bd0-9727-dfa8445fbff3")
        arg0.setCode("f2d748fd-a9b6-46ed-9483-63b07e4996e6")
        arg0.setLeaderUserId("42744e53-85f0-43d4-bdbf-a7884d13b1f9")

        DepartmentSingleRespDto response = client.updateDepartment(arg0);
    }


    @Test
    public void deleteDepartmentTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        DeleteDepartmentReqDto arg0 = new DeleteDepartmentReqDto();
        arg0.setOrganizationCode("a88c1ae5-eb66-44b9-8086-5811853490e1")
        arg0.setDepartmentId("027d025a-bbe2-43ca-9fd5-2b158d92ca96")

        IsSuccessRespDto response = client.deleteDepartment(arg0);
    }


    @Test
    public void getGroupListTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListGroupsDto arg0 = new ListGroupsDto();
        arg0.setOptions("8b175b7f-d55c-4624-8349-56f227b7170a")

        GroupPaginatedRespDto response = client.getGroupList(arg0);
    }


    @Test
    public void listRoleMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListRoleMemberDto arg0 = new ListRoleMemberDto();
        arg0.setCode("3bbd9c73-ac85-4b58-be21-a92c1baca763")
        arg0.setNamespace("615bb361-df48-4d4a-868b-31eb00880851")
        arg0.setOptions("d73f20a7-4ce2-44d2-98f2-6b3124930a8c")

        UserListRespDto response = client.listRoleMembers(arg0);
    }


    @Test
    public void updateExtIdpTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateExtIdpDto arg0 = new UpdateExtIdpDto();
        arg0.setId("c9c3bf09-5e82-44e3-834b-7e03b4397819")
        arg0.setName("0ad8819c-ae70-4214-a33a-d348a579c219")

        ExtIdpDto response = client.updateExtIdp(arg0);
    }


    @Test
    public void createResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateResourceDto arg0 = new CreateResourceDto();
        arg0.setActions("fa53c198-27f7-4f62-98ce-6b58f1a36f5e")
        arg0.setType("9539cc3c-918c-4a18-8eb5-b0f7de1a0e3c")
        arg0.setCode("1e2243a3-b6ae-4234-9962-ee9b901d3f3f")
        arg0.setDescription("eb3fd805-1d6c-4b44-a932-02b39f081dd6")
        arg0.setApiIdentifier("444a67cf-619b-4913-8ab6-ff3036b7029e")
        arg0.setNamespace("cc6c0efa-e772-4f5f-bfd8-c6f6331ab685")

        ResourceRespDto response = client.createResource(arg0);
    }


    @Test
    public void getRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetRoleDto arg0 = new GetRoleDto();
        arg0.setCode("14a66d9b-a247-46cf-a13c-b798e1c4f633")
        arg0.setNamespace("3145b699-9eb9-45ec-9ed6-90bf4a89d2b4")

        RoleSingleRespDto response = client.getRole(arg0);
    }


    @Test
    public void createGroupTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateGroupReqDto arg0 = new CreateGroupReqDto();
        arg0.setDescription("04093500-51fc-4189-a110-89edc1d2b41e")
        arg0.setName("9c041d4c-0635-4193-9300-64164524b5c2")
        arg0.setCode("d8ba0a2f-d391-4bfc-a511-51e198b2e2b2")

        GroupSingleRespDto response = client.createGroup(arg0);
    }


    @Test
    public void addGroupMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        AddGroupMembersReqDto arg0 = new AddGroupMembersReqDto();
        arg0.setUserIds("312b1af0-77da-43f9-929b-66e94fee1e17")
        arg0.setCode("02c6a44f-447a-44e7-89ed-45595d97f394")

        IsSuccessRespDto response = client.addGroupMembers(arg0);
    }


    @Test
    public void createRolesBatchTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateRolesBatch arg0 = new CreateRolesBatch();
        arg0.setList("71e2dadd-69ef-43b6-896c-f766e4488141")

        IsSuccessRespDto response = client.createRolesBatch(arg0);
    }


    @Test
    public void getGroupTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetGroupDto arg0 = new GetGroupDto();
        arg0.setCode("880c8049-eaf8-4a09-92f8-e31c1ca00aa6")

        GroupSingleRespDto response = client.getGroup(arg0);
    }


    @Test
    public void listGroupMembersTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        ListGroupMembersDto arg0 = new ListGroupMembersDto();
        arg0.setCode("bd274a6c-7169-468e-926d-62c17b8d8cd4")
        arg0.setOptions("5940ec08-81da-44e5-b296-9ba380e0dc70")

        UserListRespDto response = client.listGroupMembers(arg0);
    }


    @Test
    public void createRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        CreateRoleDto arg0 = new CreateRoleDto();
        arg0.setCode("0a7732db-d9f0-4d68-af15-f669d84345e3")
        arg0.setNamespace("117eab8b-1d70-4a01-872d-06dd9b5ef801")
        arg0.setDescription("f319af5c-81ab-4908-8797-d1c374dd9230")

        RoleSingleRespDto response = client.createRole(arg0);
    }


    @Test
    public void updateRoleTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateRoleDto arg0 = new UpdateRoleDto();
        arg0.setNewCode("5688f079-3bdc-4b92-90a4-d7f937511a8c")
        arg0.setCode("15914dc0-0a33-46b7-9d66-5ebcb8460dee")
        arg0.setNamespace("467f0740-6b1c-4c04-94b1-499470c056ba")
        arg0.setDescription("e157be65-f52a-4fc7-a27a-fd28d98d9e7d")

        IsSuccessRespDto response = client.updateRole(arg0);
    }


    @Test
    public void getResourceTest () {
        ManagementClientOptions clientOptions = new ManagementClientOptions("accessKeyId", "accessKeySecret");
        ManagementClient client = new ManagementClient(clientOptions);

        GetResourceDto arg0 = new GetResourceDto();
        arg0.setCode("99db90c1-be98-43cc-9a35-20c30a065d18")
        arg0.setNamespace("977b5b48-362f-47be-8f18-06c05aab1a3a")

        ResourceRespDto response = client.getResource(arg0);
    }



}