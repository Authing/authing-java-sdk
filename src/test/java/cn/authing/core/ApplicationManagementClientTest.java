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

    private ManagementClient managementClient;

    private ApplicationManagementClient applicationManagementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        managementClient = new ManagementClient("5f8d2827feaa6e31598fda94", "6cf056a42f48df61e220a47b10d893ba");
        managementClient.setHost("https://core.authing.cn");
        applicationManagementClient = managementClient.application();

        managementClient.requestToken().execute();
    }

    @Test
    public void listApplications() throws IOException {
        List<Application> result = applicationManagementClient.listApplications().execute();
        Assert.assertTrue(result.size() != 0);
    }

    @Test
    public void detail() throws IOException {
        String appId = "5f8d2861599d91045743fad3";
        Application application = applicationManagementClient.detail(appId).execute();
        Assert.assertEquals(appId, application.getId());
    }

}
