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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class UsersManagementClientTest {
    
    private UsersManagementClient usersManagementClient;
    private String email;
    private User user;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        ManagementClient managementClient = new ManagementClient("6006d6820d57817ed7a95f84", "4bdb08da88e47a978001d236a09e27f9");
        managementClient.setHost("https://core.authing.cn");
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
        String query = "gmail";
        PaginatedUsers users = this.usersManagementClient.search(query).execute();
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
    public void listRoles() throws IOException, GraphQLException {
        PaginatedRoles roles = this.usersManagementClient.listRoles(user.getId()).execute();
        Assert.assertEquals(0, roles.getTotalCount());
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
}
