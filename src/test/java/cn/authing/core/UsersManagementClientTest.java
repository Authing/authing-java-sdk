package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.GroupsManagementClient;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.UsersManagementClient;
import cn.authing.core.types.*;
import com.google.gson.Gson;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class UsersManagementClientTest {

    // clients
    private GroupsManagementClient groupsManagementClient;
    private UsersManagementClient usersManagementClient;
    private ManagementClient managementClient;

    // user attribute
    private String password = TestUtils.createRandomString();
    private String email;
    private String username;
    private String externalId;
    private String phone;
    private String nickname;

    // group attributes
    private String groupCode;
    private String groupName;

    // objects
    private User user;
    private Group group;

    @Before
    public void before() throws IOException, GraphQLException {
        String userPoolId = "60e043f8cd91b87d712b6365";
        String userPoolSecret = "158c7679333bc196b524d78d745813e5";
        managementClient = new ManagementClient(userPoolId, userPoolSecret);
        managementClient.setHost("https://core.authing.cn");
        this.usersManagementClient = managementClient.users();
        this.groupsManagementClient = managementClient.group();

        managementClient.requestToken().execute();
/*
        email = TestUtils.createRandomEmail();
        username = TestUtils.createRandomString();
        externalId = TestUtils.createRandomString();
        phone = TestUtils.createRandomMobile();
        externalId = TestUtils.createRandomString();
        nickname = TestUtils.createRandomString();

        user = this.usersManagementClient
                .create(new CreateUserInput()
                        .withEmail(email)
                        .withPassword(password)
                        .withUsername(username)
                        .withPhone(phone)
                        .withExternalId(externalId)
                ).execute();

        groupCode = TestUtils.createRandomString();
        groupName = TestUtils.createRandomString();
        group = this.groupsManagementClient.create(new CreateGroupParam(groupCode, groupName)).execute();*/
    }

    @After
    public void after() throws IOException, GraphQLException {
        if (user == null) return;
        this.usersManagementClient.delete(user.getId()).execute();
    }

    @Test
    public void detail1() throws IOException, GraphQLException {
        User result = this.usersManagementClient.detail("611a149db64310ca4764ab15").execute();
        System.out.println(new Gson().toJson(result));
    }

    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedUsers result = this.usersManagementClient.list().execute();
        List<User> users = result.getList();
        Integer totalCount = result.getTotalCount();
        Assert.assertTrue(totalCount > 0);
    }

    @Test
    public void create() {
        Assert.assertEquals(user.getEmail(), email);
    }

    @Test
    public void createWithKeepPassword() throws IOException, GraphQLException {
        String email = TestUtils.createRandomEmail();
        String password = TestUtils.createRandomString();
        User user = this.usersManagementClient
                .create(
                        new CreateUserInput()
                                .withEmail(email)
                                .withPassword(password),
                        new CreateUserOptions(true)
                ).execute();
        Assert.assertEquals(user.getEmail(), email);
    }

    @Test
    public void update() throws IOException, GraphQLException {
        User result = this.usersManagementClient.update(user.getId(), new UpdateUserInput().withNickname("nickname")).execute();
        Assert.assertEquals(result.getNickname(), "nickname");
    }

    @Test
    public void detail() throws IOException, GraphQLException {
        User result = this.usersManagementClient.detail(user.getId()).execute();
        Assert.assertEquals(result.getEmail(), email);
    }
    @Test
    public void search() throws IOException, GraphQLException {
        String query = "t";
        PaginatedUsers users = this.usersManagementClient.search(query).execute();
        Assert.assertTrue(users.getTotalCount() > 0);
    }

    @Test
    public void searchUserParam() throws IOException, GraphQLException {
        List<SearchUserDepartmentOptInput> optInputs =
                Arrays.asList(new SearchUserDepartmentOptInput("602110f20420dc88d4acb50d", true));

        List<String> fields = Arrays.asList("a");
        SearchUserParam searchUserParam = new SearchUserParam(
                "t", null, 0, 10, optInputs);
        PaginatedUsers users = this.usersManagementClient.search(searchUserParam).execute();
        Assert.assertTrue(users.getTotalCount() > 0);
    }

    @Test
    public void findByEmail() throws IOException, GraphQLException {
        FindUserParam findUserParam = new FindUserParam();
        findUserParam.setEmail(email);
        User user = this.usersManagementClient.find(findUserParam).execute();
        Assert.assertNotNull(user.getId());
        Assert.assertEquals(email.toLowerCase(Locale.ROOT), user.getEmail().toLowerCase());
    }

    @Test
    public void findByUsername() throws IOException, GraphQLException {
        User user = this.usersManagementClient.find(new FindUserParam().withUsername(username)).execute();
        Assert.assertNotNull(user.getId());
    }

    @Test
    public void findByPhone() throws IOException, GraphQLException {
        User user = this.usersManagementClient.find(new FindUserParam().withPhone(phone)).execute();
        Assert.assertNotNull(user.getId());
    }

    @Test
    public void findByExternalId() throws IOException, GraphQLException {
        FindUserParam findUserParam = new FindUserParam();
        findUserParam.setExternalId(externalId);
        User user = this.usersManagementClient.find(findUserParam).execute();
        Assert.assertEquals(externalId, user.getExternalId());
    }

    @Test
    public void batchGetById() throws IOException, GraphQLException {
        ArrayList<String> list = new ArrayList<>();
        list.add(user.getId());
        List<User> users = this.usersManagementClient.batch(list).execute();
        Assert.assertTrue(users.size() == 1);
    }

    @Test
    public void batchGetByUsername() throws IOException, GraphQLException {
        ArrayList<String> list = new ArrayList<>();
        list.add(user.getUsername());
        List<User> users = this.usersManagementClient.batch(list, new BatchGetUserOptions(BatchGetUserQueryFieldEnum.Username)).execute();
        Assert.assertTrue(users.size() == 1);
        Assert.assertEquals(users.get(0).getUsername(), user.getUsername());
    }

    @Test
    public void batchGetByEmail() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add(user.getEmail());
        List<User> users = this.usersManagementClient.batch(list, new BatchGetUserOptions(BatchGetUserQueryFieldEnum.Email)).execute();
        Assert.assertTrue(users.size() == 1);
        Assert.assertEquals(users.get(0).getEmail(), user.getEmail());
    }

    @Test
    public void batchGetByPhone() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add(user.getPhone());
        List<User> users = this.usersManagementClient.batch(list, new BatchGetUserOptions(BatchGetUserQueryFieldEnum.Phone)).execute();
        Assert.assertTrue(users.size() == 1);
        Assert.assertEquals(users.get(0).getPhone(), user.getPhone());
    }

    @Test
    public void batchGetByExternalId() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add(user.getExternalId());
        List<User> users = this.usersManagementClient.batch(list, new BatchGetUserOptions(BatchGetUserQueryFieldEnum.ExternalId)).execute();
        Assert.assertTrue(users.size() == 1);
        Assert.assertEquals(users.get(0).getExternalId(), user.getExternalId());
    }

    @Test
    public void delete() throws IOException, GraphQLException {
        CommonMessage message = this.usersManagementClient.delete(user.getId()).execute();
        user = null;
        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
    }

    @Test
    public void deleteUserNotExists() throws IOException, GraphQLException {
        CommonMessage message = this.usersManagementClient.delete("notexists").execute();
    }

    @Test
    public void deleteMany() throws IOException, GraphQLException {
        ArrayList<String> list = new ArrayList<>();
        list.add(user.getId());
        CommonMessage message = this.usersManagementClient.deleteMany(list).execute();
        user = null;
        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
    }

    @Test
    public void refreshToken() throws IOException, GraphQLException {
        RefreshToken token = this.usersManagementClient.refreshToken(user.getId()).execute();
        Assert.assertNotNull(token.getToken());
    }

    @Test
    public void existsByEmailNotExists() throws IOException, GraphQLException {
        String email = TestUtils.createRandomString();
        Boolean b = this.usersManagementClient.exists(new IsUserExistsParam().withEmail(email)).execute();
        Assert.assertFalse(b);
    }

    @Test
    public void existsByEmail() throws IOException, GraphQLException {
        Boolean exists = this.usersManagementClient.exists(new IsUserExistsParam().withEmail(email)).execute();
        Assert.assertTrue(exists);
    }

    @Test
    public void existsByUsername() throws IOException, GraphQLException {
        Boolean exists = this.usersManagementClient.exists(new IsUserExistsParam().withUsername(username)).execute();
        Assert.assertTrue(exists);
    }

    @Test
    public void existsByPhone() throws IOException, GraphQLException {
        Boolean exists = this.usersManagementClient.exists(new IsUserExistsParam().withPhone(phone)).execute();
        Assert.assertTrue(exists);
    }

    @Test
    public void existsByExternalId() throws IOException, GraphQLException {
        Boolean exists = this.usersManagementClient.exists(new IsUserExistsParam().withExternalId(externalId)).execute();
        Assert.assertTrue(exists);
    }

    @Test
    public void roleTest() throws IOException, GraphQLException {
        addRoles();
        listRoles();
        removeRoles();
    }

    private void listRoles() throws IOException, GraphQLException {
        PaginatedRoles roles1 = this.usersManagementClient.listRoles(user.getId()).execute();
        Assert.assertTrue(roles1.getTotalCount() >= 0);
        PaginatedRoles roles = this.usersManagementClient.listRoles(user.getId(), "default").execute();
        Assert.assertTrue(roles.getTotalCount() >= 0);
    }

    private void addRoles() throws IOException, GraphQLException {
        Role role = managementClient.roles().create(new CreateRoleParam(TestUtils.createRandomString())).execute();
        Role role2 = managementClient.roles().create(new CreateRoleParam(TestUtils.createRandomString())).execute();
        this.usersManagementClient.addRoles(user.getId(), Arrays.asList(role.getCode(), role2.getCode()), "default").execute();
    }

    private void removeRoles() throws IOException, GraphQLException {
        CommonMessage commonMessage1 = this.usersManagementClient.removeRoles(user.getId(), Arrays.asList("xxx", "qqq")).execute();
        Assert.assertEquals(200, (int) commonMessage1.getCode());
        CommonMessage commonMessage = this.usersManagementClient.removeRoles(user.getId(), Arrays.asList("aaa", "bbb"), "5f9d0cefd9ad0ef8f8107a53").execute();
        Assert.assertEquals(200, (int) commonMessage.getCode());
    }

    @Test
    public void restAddRoles() throws IOException {
        String userId = "60b5db8f31f1ca6c64691c48";
        String namespace = "default";
        List<String> list = Arrays.asList("test1", "test2");

        this.usersManagementClient.addRoles(userId, list, namespace).execute();
    }

    @Test
    public void listPolicies() throws IOException, GraphQLException {
        PaginatedPolicyAssignments result = this.usersManagementClient.listPolicies(user.getId()).execute();
        Assert.assertEquals(0, result.getTotalCount());
    }

    @Test
    public void listUdv() throws IOException, GraphQLException {
        List<UserDefinedData> udv = this.usersManagementClient.listUdv("611a149db64310ca4764ab15").execute();
        Assert.assertEquals(0, udv.size());
    }

    @Test
    public void listOrgs() throws IOException, GraphQLException {
        List<List<Org>> orgs = this.usersManagementClient.listOrgs("611a149db64310ca4764ab15").execute();

        Assert.assertEquals(0, orgs.size());
    }

    @Test
    public void listAuthorizedResources() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        String namespace = "default";
        PaginatedAuthorizedResources result = this.usersManagementClient.listAuthorizedResources("611a149db64310ca4764ab15", namespace).execute();
        //Assert.assertNotNull(result.getList());
        System.out.println(new Gson().toJson(result));
        ListUserAuthorizedResourcesParam param = new ListUserAuthorizedResourcesParam("611a149db64310ca4764ab15")
                .withNamespace("default")
                .withResourceType("DATA");

        PaginatedAuthorizedResources res = managementClient.users().listAuthorizedResources(param).execute();
        System.out.println(new Gson().toJson(res));
        //Assert.assertNotNull(res);

    }

    @Test
    public void UdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        setUdfValue();
        removeUdfValue();
    }

    @Test
    public void getUdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        Map<String, Object> result = this.usersManagementClient.getUdfValue("60bc2cf1df5732f1e02c5fc6").execute();
        System.out.println(result);
        Assert.assertNotNull(result);
    }

    @Test
    public void getUdfValueBatch() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        Map result = this.usersManagementClient.getUdfValueBatch(Arrays.asList("5f9d0cef60d09ff5a4c87c06")).execute();
        Assert.assertNotNull(result);
    }

    @Test
    public void setUdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        Map<String, String> p = new HashMap();
        p.put("dnum", "234");
        List<UserDefinedData> result = this.usersManagementClient.setUdfValue("60b5db8f31f1ca6c64691c48", p).execute();
        Assert.assertNotNull(result);
    }

    @Test
    public void setUdfValueBatch() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        Map<String, String> p = new HashMap();
        p.put("dnum", "189");
        SetUdfValueBatchInputItem a = new SetUdfValueBatchInputItem("5f9d0cef60d09ff5a4c87c06", p);

        List<UserDefinedData> result = this.usersManagementClient
                .setUdfValueBatch(Arrays.asList(a)).execute();
        Assert.assertNotNull(result);
    }

    @Test
    public void removeUdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        List<UserDefinedData> result = this.usersManagementClient.removeUdfValue("5f9d0cef60d09ff5a4c87c06", "dnum").execute();
        Assert.assertNotNull(result);
    }

    @Test
    public void kick() throws IOException {
        List<String> userIds = Arrays.asList("604b34ca6aa796c8b77d6c26", "604b34c44c27edbfd3d5293c");
        Boolean res = this.usersManagementClient.kick(userIds).execute();
        Assert.assertTrue(res);
    }

    // groups related
    @Test
    public void addGroup() throws IOException, GraphQLException {
        CommonMessage commonMessage = this.usersManagementClient.addGroup(user.getId(), group.getCode()).execute();
        Assert.assertEquals(commonMessage.getCode().intValue(), 200);
    }

    @Test
    public void addGroupNotExists() throws IOException, GraphQLException {
        Boolean hasError = false;
        try {
            CommonMessage commonMessage = this.usersManagementClient.addGroup(user.getId(), TestUtils.createRandomString()).execute();
        } catch (GraphQLException | IOException e) {
            hasError = true;
            e.printStackTrace();
        }
        Assert.assertTrue(hasError);
    }

    @Test
    public void listGroups() throws IOException, GraphQLException {
        this.usersManagementClient.addGroup(user.getId(), group.getCode()).execute();
        PaginatedGroups paginatedGroups = this.usersManagementClient.listGroups(user.getId()).execute();
        List<Group> list = paginatedGroups.getList();
        Integer totalCount = paginatedGroups.getTotalCount();
        Assert.assertTrue(totalCount > 0);
    }

    @Test
    public void removeGroups() throws IOException, GraphQLException {
        this.usersManagementClient.addGroup(user.getId(), group.getCode()).execute();
        this.usersManagementClient.removeGroup(user.getId(), group.getCode()).execute();
        PaginatedGroups paginatedGroups = this.usersManagementClient.listGroups(user.getId()).execute();
        Integer totalCount = paginatedGroups.getTotalCount();
        Assert.assertTrue(totalCount == 0);
    }

    @Test
    public void listUserActions() throws IOException {
        Pagination<Object> res = managementClient.users().listUserActions().execute();

        Assert.assertNotNull(res);
    }

    @Test
    public void checkLoginStatus() throws IOException {
        UserCheckLoginStatusResponse res = managementClient.users()
                .checkLoginStatus(new CheckLoginStatusParams("609923562e1a788a794879fa"))
                .execute();

        System.out.println(res);
        Assert.assertNotNull(res);
    }
    
    @Test
    public void listDepartment() throws IOException {
        Pagination<UserDepartment> resUser = this.usersManagementClient.listDepartment("60bc2cf1df5732f1e02c5fc6").execute();
        System.out.println(resUser.getList());

        Assert.assertNotNull(resUser);


    }

    public static void main(String[] args) {
        String userPoolId = "60960a4120cfd0a5a8306ffe";
        String userPoolSecret = "ca869fa487e44f42e39175fef7a76e3d";

        ManagementClient managementClient = new ManagementClient(userPoolId, userPoolSecret);
        managementClient.setHost("http://localhost:3000");

        try {
            managementClient.udf().set(UdfTargetType.USER, "key2", UdfDataType.STRING, "2").execute();
            managementClient.udf().set(UdfTargetType.USER, "key3", UdfDataType.STRING, "3").execute();
            managementClient.udf().set(UdfTargetType.USER, "key4", UdfDataType.STRING, "4").execute();
        } catch (IOException | GraphQLException e) {
            e.printStackTrace();
        }

        Map<String, String> p = new HashMap();
        p.put("key2", "aaaaaaaaaaaaaaaaa");
        p.put("key3", "aaaaaaaaaaaaaaaaa");
        p.put("key4", "aaaaaaaaaaaaaaaaa");
        try {
            List<UserDefinedData> res = managementClient.users().setUdfValue("60a392255df2c97ef795f9db", p).execute();
            Map<String, Object> execute = managementClient.users().getUdfValue("60a392255df2c97ef795f9db").execute();
            System.out.println(execute);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Map<String, String> p2 = new HashMap();
        p2.put("key2", "bbbbbbbbbbbbbbbbb");
        p2.put("key3", "bbbbbbbbbbbbbbbbb");
        p2.put("key4", "bbbbbbbbbbbbbbbbb");
        SetUdfValueBatchInputItem a = new SetUdfValueBatchInputItem("60a392255df2c97ef795f9db", p2);

        List<UserDefinedData> result = null;
        try {
            managementClient.users().setUdfValueBatch(Arrays.asList(a)).execute();

            Map<String, Object> execute = managementClient.users().getUdfValue("60a392255df2c97ef795f9db").execute();
            System.out.println(execute);
        } catch (IOException | GraphQLException e) {
            e.printStackTrace();
        }
    }
}
