package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.GroupsManagementClient;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.WhitelistManagementClient;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GroupsManagementClientTest {
    private ManagementClient managementClient;
    private GroupsManagementClient groupsManagementClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        managementClient = new ManagementClient("5f8d2827feaa6e31598fda94", "6cf056a42f48df61e220a47b10d893ba");
        managementClient.setHost("https://core.authing.cn");
        groupsManagementClient = managementClient.group();

        managementClient.requestToken().execute();
    }

    @Test
    public void create() throws IOException, GraphQLException {
        Group group = groupsManagementClient.create(new CreateGroupParam("code1", "name1", "desc1")).execute();
        Assert.assertTrue(group != null);
    }

    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedGroups groups = groupsManagementClient.list(new GroupsParam()).execute();
        Assert.assertTrue(groups.getList().size() > 0);
    }

    @Test
    public void update() throws IOException, GraphQLException {
        Group group = groupsManagementClient.update(new UpdateGroupParam("code1","name11","desc11","code1")).execute();
        Assert.assertTrue(group != null);
    }

    @Test
    public void detail() throws IOException, GraphQLException {
        Group group = groupsManagementClient.detail("code1").execute();
        Assert.assertTrue(group != null);
    }

    @Test
    public void addUsers() throws IOException, GraphQLException {
        CommonMessage commonMessage = groupsManagementClient.addUsers(new AddUserToGroupParam(Arrays.asList("5f8d2827c41264570d13200f"),"code1")).execute();
        Assert.assertTrue(commonMessage != null);
    }

    @Test
    public void listUsers() throws IOException, GraphQLException {
        PaginatedUsers users = groupsManagementClient.listUsers("code1").execute();
        Assert.assertTrue(users != null);
    }

    @Test
    public void listUsersWithPage() throws IOException, GraphQLException {
        PaginatedUsers users = groupsManagementClient.listUsers(new GroupWithUsersParam("code1",1,1)).execute();
        Assert.assertTrue(users != null);
    }

    @Test
    public void removeUsers() throws IOException, GraphQLException {
        CommonMessage commonMessage = groupsManagementClient.removeUsers(new RemoveUserFromGroupParam(Arrays.asList("5f8d2827c41264570d13200f"),"code1")).execute();
        Assert.assertTrue(commonMessage != null);
    }

    @Test
    public void delete() throws IOException, GraphQLException {
        CommonMessage commonMessage = groupsManagementClient.delete("code1").execute();
        Assert.assertTrue(commonMessage != null);
    }

    @Test
    public void deleteMany() throws IOException, GraphQLException {
        CommonMessage commonMessage = groupsManagementClient.deleteMany(Arrays.asList("code1")).execute();
        Assert.assertTrue(commonMessage != null);
    }
}
