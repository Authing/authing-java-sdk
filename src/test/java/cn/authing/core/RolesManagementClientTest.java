package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.RolesManagementClient;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class RolesManagementClientTest {
    
    private RolesManagementClient rolesManagementClient;

    private ManagementClient managementClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        managementClient = new ManagementClient("59f86b4832eb28071bdd9214", "271ba9dc00486c18488aebb0962bd50d");
        managementClient.setHost("http://localhost:3000");
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

    private Role createE() throws IOException, GraphQLException {
        String code = randomString();

        return this.rolesManagementClient.create(new CreateRoleParam(code)).execute();
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
    public void addUsers() throws IOException, GraphQLException {
        List<String> userIds = Arrays.asList("604b572025f520ae4aeda834","605ef4a5f4051bcef8fc10ca");

        CommonMessage message = this.rolesManagementClient.addUsers("xxx",userIds).execute();

        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
    }

    @Test
    public void removeUsers() throws IOException, GraphQLException {
        List<String> userIds = Arrays.asList("604b572025f520ae4aeda834","605ef4a5f4051bcef8fc10ca");

        CommonMessage message = this.rolesManagementClient.removeUsers("xxx",userIds).execute();

        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
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

    @Test
    public void listAuthorizedResources() throws IOException, GraphQLException {
        ListRoleAuthorizedResourcesParam param = new ListRoleAuthorizedResourcesParam("123")
                .withNamespace("default")
                .withResourceType("DATA");

        PaginatedAuthorizedResources res = managementClient.roles().listAuthorizedResources(param).execute();

        Assert.assertNotNull(res);
    }

    @Test
    public void getUdfValue() throws IOException, GraphQLException {
        Role role = this.createE();
        Map<String, Object> udfMap = managementClient.roles().getUdfValue(role.getCode()).execute();

        System.out.println(udfMap);
        Assert.assertNotNull(udfMap);
    }

    @Test
    public void setUdfValue() throws IOException, GraphQLException {
        Role role = this.createE();

        List<UserDefinedData> list = managementClient.roles().setUdfValue(role.getCode(), "key1", "\"suntianxiang\"").execute();

        Assert.assertNotNull(list);
    }

    public void setUdfValueBatch() {

    }
}
