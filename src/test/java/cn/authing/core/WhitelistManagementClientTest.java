package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
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

public class WhitelistManagementClientTest {
    private ManagementClient managementClient;
    private WhitelistManagementClient whitelistManagementClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        managementClient = new ManagementClient("5f8d2827feaa6e31598fda94", "6cf056a42f48df61e220a47b10d893ba");
        managementClient.setHost("https://core.authing.cn");
        whitelistManagementClient = managementClient.whitelist();

        managementClient.requestToken().execute();
    }

    @Test
    public void list() throws IOException, GraphQLException {
        List<WhiteList> whiteLists = whitelistManagementClient.list(WhitelistType.USERNAME).execute();
        Assert.assertTrue(whiteLists.size() > 0);
    }

    @Test
    public void add() throws IOException, GraphQLException {
        List<WhiteList> whiteLists = whitelistManagementClient.add(new AddWhitelistParam(WhitelistType.USERNAME, Arrays.asList("test1"))).execute();
        Assert.assertTrue(whiteLists.size() > 0);
    }

    @Test
    public void remove() throws IOException, GraphQLException {
        List<WhiteList> whiteLists = whitelistManagementClient.remove(new RemoveWhitelistParam(WhitelistType.USERNAME, Arrays.asList("test"))).execute();
        Assert.assertTrue(whiteLists.size() > 0);
    }

    @Test
    public void enable() throws IOException, GraphQLException {
        UserPool userPool = whitelistManagementClient.enable(WhitelistType.USERNAME).execute();
        Assert.assertTrue(userPool != null);
    }

    @Test
    public void disable() throws IOException, GraphQLException {
        UserPool userPool = whitelistManagementClient.disable(WhitelistType.USERNAME).execute();
        Assert.assertTrue(userPool != null);
    }
}
