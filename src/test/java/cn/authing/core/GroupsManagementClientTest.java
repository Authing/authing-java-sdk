package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.GroupsManagementClient;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;

public class GroupsManagementClientTest {

    private GroupsManagementClient groupsManagementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        ManagementClient managementClient = new ManagementClient("6006d6820d57817ed7a95f84", "4bdb08da88e47a978001d236a09e27f9");
        managementClient.setHost("https://core.authing.cn");
        this.groupsManagementClient = managementClient.group();

        managementClient.requestToken().execute();
    }

    @Test
    public void create() throws IOException, GraphQLException {
        Group group = this.groupsManagementClient.create(new CreateGroupParam("code1", "name1", "desc1")).execute();
        Assert.assertNotNull(group);
    }

    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedGroups groups = this.groupsManagementClient.list(new GroupsParam()).execute();
        Assert.assertTrue(groups.getList().size() > 0);
    }

    @Test
    public void update() throws IOException, GraphQLException {
        Group group = this.groupsManagementClient.update(new UpdateGroupParam("code1","name11","desc11","code1")).execute();
        Assert.assertNotNull(group);
    }

    @Test
    public void detail() throws IOException, GraphQLException {
        Group group = this.groupsManagementClient.detail("code1").execute();
        Assert.assertNotNull(group);
    }

    @Test
    public void addUsers() throws IOException, GraphQLException {
        CommonMessage commonMessage = this.groupsManagementClient.addUsers(new AddUserToGroupParam(Collections.singletonList("6006d918c9695bce41a8d53b"),"code1")).execute();
        Assert.assertNotNull(commonMessage);
    }

    @Test
    public void listUsers() throws IOException, GraphQLException {
        PaginatedUsers users = this.groupsManagementClient.listUsers("code1").execute();
        Assert.assertNotNull(users);
    }

    @Test
    public void listUsersWithPage() throws IOException, GraphQLException {
        PaginatedUsers users = this.groupsManagementClient.listUsers(new GroupWithUsersParam("code1",1,1)).execute();
        Assert.assertNotNull(users);
    }

    @Test
    public void removeUsers() throws IOException, GraphQLException {
        CommonMessage commonMessage = this.groupsManagementClient.removeUsers(new RemoveUserFromGroupParam(Collections.singletonList("6006d918c9695bce41a8d53b"),"code1")).execute();
        Assert.assertNotNull(commonMessage);
    }

    @Test
    public void delete() throws IOException, GraphQLException {
        CommonMessage commonMessage = this.groupsManagementClient.delete("code1").execute();
        Assert.assertNotNull(commonMessage);
    }

    @Test
    public void deleteMany() throws IOException, GraphQLException {
        CommonMessage commonMessage = this.groupsManagementClient.deleteMany(Collections.singletonList("code1")).execute();
        Assert.assertNotNull(commonMessage);
    }
}
