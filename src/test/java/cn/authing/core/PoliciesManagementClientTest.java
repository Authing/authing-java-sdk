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
import java.util.Objects;
import java.util.Random;

public class PoliciesManagementClientTest {
    
    private PoliciesManagementClient policiesManagementClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        ManagementClient managementClient = new ManagementClient("6006d6820d57817ed7a95f84", "4bdb08da88e47a978001d236a09e27f9");
        managementClient.setHost("https://core.authing.cn");
        this.policiesManagementClient = managementClient.policies();

        managementClient.requestToken().execute();
    }


    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedPolicies roles = this.policiesManagementClient.list().execute();
        Assert.assertTrue(roles.getTotalCount() > 0);
    }

    @Test
    public void create() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        Policy policy = this.policiesManagementClient.create(code, statements).execute();
        Assert.assertEquals(policy.getCode(), code);
    }

    @Test
    public void update() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        this.policiesManagementClient.create(code, statements).execute();

        ArrayList<PolicyStatementInput> newStatements = new ArrayList<>();
        ArrayList<String> newActions = new ArrayList<>();
        newActions.add("book:edit");
        newStatements.add(new PolicyStatementInput("book:123", newActions));
        Policy policy = this.policiesManagementClient.update(code, newStatements, "desc").execute();
        Assert.assertEquals(policy.getCode(), code);
    }

    @Test
    public void detail() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        this.policiesManagementClient.create(code, statements).execute();
        Policy policy = this.policiesManagementClient.detail(code, null).execute();
        Assert.assertEquals(policy.getCode(), code);
    }

    @Test
    public void delete() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        this.policiesManagementClient.create(code, statements).execute();

        CommonMessage message = this.policiesManagementClient.delete(code).execute();
        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
    }

    @Test
    public void deleteMany() throws IOException, GraphQLException {
        String code = randomString();
        ArrayList<PolicyStatementInput> statements = new ArrayList<>();
        ArrayList<String> actions = new ArrayList<>();
        actions.add("book:edit");
        statements.add(new PolicyStatementInput("book:123", actions));
        this.policiesManagementClient.create(code, statements).execute();

        ArrayList<String> list = new ArrayList<>();
        list.add(code);
        CommonMessage result = this.policiesManagementClient.deleteMany(list).execute();
        Assert.assertNotNull(result);
    }
}
