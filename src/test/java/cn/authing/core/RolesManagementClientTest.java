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
import java.util.Objects;
import java.util.Random;

public class RolesManagementClientTest {
    
    private RolesManagementClient rolesManagementClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        ManagementClient managementClient = new ManagementClient("6006d6820d57817ed7a95f84", "4bdb08da88e47a978001d236a09e27f9");
        managementClient.setHost("https://core.authing.cn");
        this.rolesManagementClient = managementClient.roles();

        managementClient.requestToken().execute();
    }

    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedRoles roles = this.rolesManagementClient.list().execute();
        Assert.assertTrue(roles.getTotalCount() > 0);
    }

    @Test
    public void create() throws IOException, GraphQLException {
        String code = randomString();
        Role role = this.rolesManagementClient.create(new CreateRoleParam(code)).execute();
        Assert.assertEquals(role.getCode(), code);
    }

    @Test
    public void update() throws IOException, GraphQLException {
        String code = randomString();
        this.rolesManagementClient.create(new CreateRoleParam(code)).execute();
        Role role = this.rolesManagementClient.update(new UpdateRoleParam(code).withDescription("desc")).execute();
        Assert.assertEquals(role.getCode(), code);
    }

    @Test
    public void detail() throws IOException, GraphQLException {
        String code = randomString();
        this.rolesManagementClient.create(new CreateRoleParam(code)).execute();
        Role role = this.rolesManagementClient.detail(code).execute();
        Assert.assertEquals(role.getCode(), code);
    }

    @Test
    public void delete() throws IOException, GraphQLException {
        String code = randomString();
        this.rolesManagementClient.create(new CreateRoleParam(code)).execute();
        CommonMessage message = this.rolesManagementClient.delete(code).execute();
        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
    }

    @Test
    public void deleteMany() throws IOException, GraphQLException {
        String code = randomString();
        this.rolesManagementClient.create(new CreateRoleParam(code)).execute();

        ArrayList<String> list = new ArrayList<>();
        list.add(code);
        CommonMessage result = this.rolesManagementClient.deleteMany(list).execute();
        Assert.assertNotNull(result);
    }

    @Test
    public void listUsers() throws IOException, GraphQLException {
        String code = randomString();
        this.rolesManagementClient.create(new CreateRoleParam(code)).execute();

        PaginatedUsers users = this.rolesManagementClient.listUsers(code).execute();
        Assert.assertEquals(0, users.getTotalCount());
    }

    @Test
    public void listPolicies() throws IOException, GraphQLException {
        String code = randomString();
        this.rolesManagementClient.create(new CreateRoleParam(code)).execute();

        PaginatedPolicyAssignments result = this.rolesManagementClient.listPolicies(code).execute();
        Assert.assertEquals(0, result.getTotalCount());
    }
}
