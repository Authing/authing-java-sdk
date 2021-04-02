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
        ManagementClient managementClient = new ManagementClient("60540b7b4cb3196d6621ef5c", "b2e3cbdd563a3f9578f9a7d60915b294");
        managementClient.setHost("http://localhost:3000");
        this.applicationManagementClient = managementClient.application();

        managementClient.requestToken().execute();
    }

    @Test
    public void listApplications() throws IOException {
        List<Application> result = this.applicationManagementClient.listApplications(1, 2).execute();
        Assert.assertTrue(result.size() != 0);
    }

    @Test
    public void detail() throws IOException {
        String appId = "6066d1432adb32d1c7a6f004";
        Application application = this.applicationManagementClient.detail(appId).execute();
        Assert.assertEquals(appId, application.getId());
    }

}
