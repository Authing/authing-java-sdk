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
        String userPoolId = "60960a4120cfd0a5a8306ffe";
        String userPoolSecret = "ca869fa487e44f42e39175fef7a76e3d";
        managementClient = new ManagementClient(userPoolId, userPoolSecret);

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

        List<UserDefinedData> list = managementClient.roles().setUdfValue(role.getCode(), "key1", "\"aaaa\"").execute();

        Assert.assertNotNull(list);
    }

    @Test
    public void setUdfValueBatch() throws IOException, GraphQLException {
        Role role = this.createE();

        managementClient.udf().set(UdfTargetType.ROLE, "key1", UdfDataType.STRING, "1").execute();
        managementClient.udf().set(UdfTargetType.ROLE, "key2", UdfDataType.STRING, "2").execute();
        managementClient.udf().set(UdfTargetType.ROLE, "key3", UdfDataType.STRING, "3").execute();
        managementClient.udf().set(UdfTargetType.ROLE, "key4", UdfDataType.STRING, "4").execute();

        HashMap<String, String> udfMap = new HashMap<>();

        udfMap.put("key1", "aaa");
        udfMap.put("key2", "aaa");
        udfMap.put("key3", "aaa");
        udfMap.put("key4", "aaa");
        RoleSetUdfValueBatchParams params = new RoleSetUdfValueBatchParams(
                role.getCode(),
                udfMap
        );
        managementClient.roles().setUdfValueBatch(Arrays.asList(params)).execute();

        Map<String, Object> map = managementClient.roles().getUdfValue(role.getCode()).execute();

        Assert.assertEquals(map.get("key1"), "aaa");
        Assert.assertEquals(map.get("key2"), "aaa");
        Assert.assertEquals(map.get("key3"), "aaa");
        Assert.assertEquals(map.get("key4"), "aaa");
    }

    @Test
    public void removeUdfValue() throws IOException, GraphQLException {
        Role role = this.createE();

        HashMap<String, String> udfMap = new HashMap<>();

        udfMap.put("key1", "aaa");
        RoleSetUdfValueBatchParams params = new RoleSetUdfValueBatchParams(
                role.getCode(),
                udfMap
        );
        managementClient.roles().setUdfValueBatch(Arrays.asList(params)).execute();

        managementClient.roles().removeUdfValue(role.getCode(), "key1").execute();

        Map<String, Object> map = managementClient.roles().getUdfValue(role.getCode()).execute();


        Assert.assertNull(map.get("key1"));
    }
}
