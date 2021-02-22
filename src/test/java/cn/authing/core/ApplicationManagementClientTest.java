package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ApplicationManagementClient;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.types.Application;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ApplicationManagementClientTest {

    private ApplicationManagementClient applicationManagementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        ManagementClient managementClient = new ManagementClient("5f9d0cee4a8f5e150cf6470d", "ea4e02cd9dbff480a64813f7fe3b5cf0");
        managementClient.setHost("https://core.authing.cn");
        this.applicationManagementClient = managementClient.application();

        managementClient.requestToken().execute();
    }

    @Test
    public void listApplications() throws IOException {
        List<Application> result = this.applicationManagementClient.listApplications().execute();
        Assert.assertTrue(result.size() != 0);
    }

    @Test
    public void detail() throws IOException {
        String appId = "6006d684ce1dbb5e3766202b";
        Application application = this.applicationManagementClient.detail(appId).execute();
        Assert.assertEquals(appId, application.getId());
    }

}
