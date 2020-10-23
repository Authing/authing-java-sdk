package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.PoliciesManagementClient;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class PoliciesManagementClientTest {
    private ManagementClient managementClient;
    private PoliciesManagementClient policiesManagementClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        managementClient = new ManagementClient("59f86b4832eb28071bdd9214", "4b880fff06b080f154ee48c9e689a541");
        managementClient.setHost("http://localhost:3000");
        policiesManagementClient = managementClient.policies();

        managementClient.requestToken().execute();
    }


    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedPolicies roles = policiesManagementClient.list().execute();
        Assert.assertTrue(roles.getTotalCount() > 0);
    }

    @Test
    public void create() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        Policy policy = policiesManagementClient.create(code, statements).execute();
        Assert.assertEquals(policy.getCode(), code);
    }

    @Test
    public void update() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        policiesManagementClient.create(code, statements).execute();

        ArrayList<PolicyStatementInput> newStatements = new ArrayList<>();
        ArrayList<String> newActions = new ArrayList<>();
        newActions.add("book:edit");
        newStatements.add(new PolicyStatementInput("book:123", newActions));
        Policy policy = policiesManagementClient.update(code, newStatements, "desc").execute();
        Assert.assertEquals(policy.getCode(), code);
    }

    @Test
    public void detail() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        policiesManagementClient.create(code, statements).execute();
        Policy policy = policiesManagementClient.detail(code).execute();
        Assert.assertEquals(policy.getCode(), code);
    }

    @Test
    public void delete() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        policiesManagementClient.create(code, statements).execute();

        CommonMessage message = policiesManagementClient.delete(code).execute();
        Assert.assertEquals(message.getCode().intValue(), 200);
    }

    @Test
    public void deleteMany() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        policiesManagementClient.create(code, statements).execute();

        ArrayList<String> list = new ArrayList<>();
        list.add(code);
        CommonMessage result = policiesManagementClient.deleteMany(list).execute();
        Assert.assertTrue(result.getCode() > 0);
    }
}
