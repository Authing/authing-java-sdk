package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.WhitelistManagementClient;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class WhitelistManagementClientTest {
    
    private WhitelistManagementClient whitelistManagementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        ManagementClient managementClient = new ManagementClient("6006d6820d57817ed7a95f84", "4bdb08da88e47a978001d236a09e27f9");
        managementClient.setHost("https://core.authing.cn");
        this.whitelistManagementClient = managementClient.whitelist();

        managementClient.requestToken().execute();
    }

    @Test
    public void list() throws IOException, GraphQLException {
        List<WhiteList> whiteLists = this.whitelistManagementClient.list(WhitelistType.USERNAME).execute();
        Assert.assertTrue(whiteLists.size() > 0);
    }

    @Test
    public void add() throws IOException, GraphQLException {
        List<WhiteList> whiteLists = this.whitelistManagementClient.add(new AddWhitelistParam(WhitelistType.USERNAME, Collections.singletonList("test1"))).execute();
        Assert.assertTrue(whiteLists.size() > 0);
    }

    @Test
    public void remove() throws IOException, GraphQLException {
        List<WhiteList> whiteLists = this.whitelistManagementClient.remove(new RemoveWhitelistParam(WhitelistType.USERNAME, Collections.singletonList("test"))).execute();
        Assert.assertTrue(whiteLists.size() > 0);
    }

    @Test
    public void enable() throws IOException, GraphQLException {
        UserPool userPool = this.whitelistManagementClient.enable(WhitelistType.USERNAME).execute();
        Assert.assertNotNull(userPool);
    }

    @Test
    public void disable() throws IOException, GraphQLException {
        UserPool userPool = this.whitelistManagementClient.disable(WhitelistType.USERNAME).execute();
        Assert.assertNotNull(userPool);
    }
}
