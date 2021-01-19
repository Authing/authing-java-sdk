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
        ManagementClient managementClient = new ManagementClient("6006d6820d57817ed7a95f84", "4bdb08da88e47a978001d236a09e27f9");
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
