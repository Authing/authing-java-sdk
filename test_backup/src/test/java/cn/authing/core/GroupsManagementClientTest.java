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

    private ManagementClient managementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        String userPoolId = "5f45cad3ece50b62de2a02cd";
        String userPoolSecret = "624cb39b07ffd29b946112ea82f5b50e";
        managementClient = new ManagementClient(userPoolId, userPoolSecret);
        managementClient.setHost("https://core.authing.cn");
        this.groupsManagementClient = managementClient.group();

        managementClient.requestToken().execute();
    }

    @Test
    public void create() throws IOException, GraphQLException {
        Group group = this.groupsManagementClient.create(new CreateGroupParam("code", "name1", "desc1")).execute();

        System.out.println(group);

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

    @Test
    public void listAuthorizedResources() throws IOException, GraphQLException {
        ListGroupAuthorizedResourcesParam param = new ListGroupAuthorizedResourcesParam("code")
                .withNamespace("default")
                .withResourceType("DATA");
        Group res = managementClient.group().listAuthorizedResources(param).execute();

        Assert.assertNotNull(res);
    }
}
