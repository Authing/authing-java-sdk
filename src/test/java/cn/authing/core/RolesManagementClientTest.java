package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.RolesManagementClient;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RolesManagementClientTest {
    private ManagementClient managementClient;
    private RolesManagementClient rolesManagementClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        managementClient = new ManagementClient("59f86b4832eb28071bdd9214", "4b880fff06b080f154ee48c9e689a541");
        managementClient.setHost("http://localhost:3000");
        rolesManagementClient = managementClient.roles();

        managementClient.requestToken().execute();
    }

    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedRoles roles = rolesManagementClient.list().execute();
    }

    @Test
    public void create() throws IOException, GraphQLException {
        String code = randomString();
        Role role = rolesManagementClient.create(new CreateRoleParam(code)).execute();
        Assert.assertEquals(role.getCode(), code);
    }

    @Test
    public void update() throws IOException, GraphQLException {
        String code = randomString();
        rolesManagementClient.create(new CreateRoleParam(code)).execute();
        Role role = rolesManagementClient.update(new UpdateRoleParam(code).withDescription("desc")).execute();
        Assert.assertEquals(role.getCode(), code);
    }

    @Test
    public void detail() throws IOException, GraphQLException {
        String code = randomString();
        rolesManagementClient.create(new CreateRoleParam(code)).execute();
        Role role = rolesManagementClient.detail(code).execute();
        Assert.assertEquals(role.getCode(), code);
    }

    @Test
    public void delete() throws IOException, GraphQLException {
        String code = randomString();
        rolesManagementClient.create(new CreateRoleParam(code)).execute();
        CommonMessage message = rolesManagementClient.delete(code).execute();
        Assert.assertEquals(message.getCode().intValue(), 200);
    }

    @Test
    public void deleteMany() throws IOException, GraphQLException {
        String code = randomString();
        rolesManagementClient.create(new CreateRoleParam(code)).execute();

        ArrayList<String> list = new ArrayList<String>();
        list.add("code");
        CommonMessage result = rolesManagementClient.deleteMany(list).execute();
        Assert.assertTrue(result.getCode() > 0);
    }

    @Test
    public void listUsers() throws IOException, GraphQLException {
        String code = "";
        PaginatedUsers users = rolesManagementClient.listUsers(code).execute();
        Assert.assertTrue(users.getTotalCount() > 0);
    }

    @Test
    public void listPolicies() throws IOException, GraphQLException {
        String code = "";
        PaginatedPolicyAssignments result = rolesManagementClient.listPolicies(code).execute();
        Assert.assertTrue(result.getTotalCount() > 0);
    }
}
