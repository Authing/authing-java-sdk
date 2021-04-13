package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.UsersManagementClient;
import cn.authing.core.types.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class UsersManagementClientTest {
    
    private UsersManagementClient usersManagementClient;
    private String email;
    private User user;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {

        String userPoolId = "5f45cad3ece50b62de2a02cd";
//        String userPoolId = "59f86b4832eb28071bdd9214";
        String userPoolSecret = "624cb39b07ffd29b946112ea82f5b50e";
//        String userPoolSecret = "271ba9dc00486c18488aebb0962bd50d";

        ManagementClient managementClient = new ManagementClient(userPoolId, userPoolSecret);
        managementClient.setHost("https://core.authing.cn");
//        managementClient.setHost("http://localhost:3000");
        this.usersManagementClient = managementClient.users();

        managementClient.requestToken().execute();

        email = randomString() + "@gmail.com";
        String password = "123456";

        user = this.usersManagementClient.create(new CreateUserInput().withEmail(email).withPassword(password)).execute();
    }

    @After
    public void after() throws IOException, GraphQLException {
        if (user == null) return;
        this.usersManagementClient.delete(user.getId()).execute();
    }

    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedUsers users = this.usersManagementClient.list().execute();
        Assert.assertTrue(users.getTotalCount() > 0);
    }

    @Test
    public void create() {
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
        List<SearchUserDepartmentOptInput> optInputs=
                Arrays.asList(new SearchUserDepartmentOptInput("602110f20420dc88d4acb50d",true));

        List<String> fields = Arrays.asList("a");
        SearchUserParam searchUserParam = new SearchUserParam(
                "t",null,0,10,optInputs);
        PaginatedUsers users = this.usersManagementClient.search(searchUserParam).execute();
        Assert.assertTrue(users.getTotalCount() > 0);
    }

    @Test
    public void find() throws IOException, GraphQLException {
        String email = "test@gmail.com";
        FindUserParam findUserParam = new FindUserParam();
        findUserParam.setEmail(email);
        User user = this.usersManagementClient.find(findUserParam).execute();
        Assert.assertEquals(email, user.getEmail());
    }

    @Test
    public void findExternalId() throws IOException, GraphQLException {
        String externalId = "7702";
        FindUserParam findUserParam = new FindUserParam();
        findUserParam.setExternalId(externalId);

        User user = this.usersManagementClient.find(findUserParam).execute();

        Assert.assertEquals(externalId, user.getExternalId());
    }

    @Test
    public void batch() throws IOException, GraphQLException {
        ArrayList<String> list = new ArrayList<>();
        list.add(user.getId());
        List<User> users = this.usersManagementClient.batch(list).execute();
        Assert.assertTrue(users.size() > 0);
    }

    @Test
    public void delete() throws IOException, GraphQLException {
        CommonMessage message = this.usersManagementClient.delete(user.getId()).execute();
        user = null;
        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
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
    public void exists() throws IOException, GraphQLException {
        Boolean b = this.usersManagementClient.exists(new IsUserExistsParam().withEmail("test@test.com")).execute();
        Assert.assertTrue(b);
    }

    @Test
    public void roleTest() throws IOException, GraphQLException {
        addRoles();
        listRoles();
        removeRoles();
    }

    private void listRoles() throws IOException, GraphQLException {
        PaginatedRoles roles1 = this.usersManagementClient.listRoles(user.getId()).execute();
        Assert.assertTrue(roles1.getTotalCount()>=0);
        PaginatedRoles roles = this.usersManagementClient.listRoles(user.getId(),"5f9d0cefd9ad0ef8f8107a53").execute();
        Assert.assertTrue(roles.getTotalCount()>=0);
    }

    private void addRoles() throws IOException, GraphQLException {
        CommonMessage commonMessage1 = this.usersManagementClient.addRoles(user.getId(),Arrays.asList("xxx","qqq")).execute();
        Assert.assertEquals(200, (int) commonMessage1.getCode());
        CommonMessage commonMessage = this.usersManagementClient.addRoles(user.getId(),Arrays.asList("aaa","bbb"),"5f9d0cefd9ad0ef8f8107a53").execute();
        Assert.assertEquals(200, (int) commonMessage.getCode());
    }

    private void removeRoles() throws IOException, GraphQLException {
        CommonMessage commonMessage1 = this.usersManagementClient.removeRoles(user.getId(),Arrays.asList("xxx","qqq")).execute();
        Assert.assertEquals(200, (int) commonMessage1.getCode());
        CommonMessage commonMessage = this.usersManagementClient.removeRoles(user.getId(),Arrays.asList("aaa","bbb"),"5f9d0cefd9ad0ef8f8107a53").execute();
        Assert.assertEquals(200, (int) commonMessage.getCode());
    }
    @Test
    public void listPolicies() throws IOException, GraphQLException {
        PaginatedPolicyAssignments result = this.usersManagementClient.listPolicies(user.getId()).execute();
        Assert.assertEquals(0, result.getTotalCount());
    }

    @Test
    public void listUdv() throws IOException, GraphQLException {
        List<UserDefinedData> udv = this.usersManagementClient.listUdv("5f9255b3dcb8f43e1a421fa4").execute();
        Assert.assertEquals(0, udv.size());
    }

    @Test
    public void listOrgs() throws IOException, GraphQLException {
        List<List<Org>> orgs =  this.usersManagementClient.listOrgs("5f8d2827c41264570d13200f").execute();

        Assert.assertEquals(0, orgs.size());
    }

    @Test
    public void listAuthorizedResources() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        String namespace = "default";
        PaginatedAuthorizedResources result = this.usersManagementClient.listAuthorizedResources("5f9d0cef60d09ff5a4c87c06",namespace).execute();
        Assert.assertNotNull(result.getList());
    }

    @Test
    public void UdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        setUdfValue();
        removeUdfValue();
    }

    @Test
    public void getUdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        Map result = this.usersManagementClient.getUdfValue("5f9d0cef60d09ff5a4c87c06").execute();
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
        p.put("dnum","234");
        List<UserDefinedData> result = this.usersManagementClient.setUdfValue("5f9d0cef60d09ff5a4c87c06",p).execute();
        Assert.assertNotNull(result);
    }

    @Test
    public void setUdfValueBatch() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        Map<String, String> p = new HashMap();
        p.put("dnum","189");
        SetUdfValueBatchInputItem a = new SetUdfValueBatchInputItem("5f9d0cef60d09ff5a4c87c06",p);

        List<UserDefinedData> result = this.usersManagementClient.setUdfValueBatch(Arrays.asList(a)).execute();
        Assert.assertNotNull(result);
    }

    @Test
    public void removeUdfValue() throws IOException, GraphQLException, ExecutionException, InterruptedException {
        List<UserDefinedData> result = this.usersManagementClient.removeUdfValue("5f9d0cef60d09ff5a4c87c06","dnum").execute();
        Assert.assertNotNull(result);
    }

    @Test
    public void kick() throws IOException {
        List<String> userIds = Arrays.asList("604b34ca6aa796c8b77d6c26", "604b34c44c27edbfd3d5293c");

        Boolean res = this.usersManagementClient.kick(userIds).execute();

        Assert.assertTrue(res);
    }
}
