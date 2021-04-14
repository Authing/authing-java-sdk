package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ApplicationManagementClient;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.types.ActiveUser;
import cn.authing.core.types.Application;
import cn.authing.core.types.IActiveUsersParam;
import cn.authing.core.types.Pagination;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class ApplicationManagementClientTest {

    private ApplicationManagementClient applicationManagementClient;

    private ManagementClient managementClient;

    private final String APP_ID = "605084fe415a744f79029f09";

    @Before
    public void before() throws IOException, GraphQLException {

        String userPoolId = "5f45cad3ece50b62de2a02cd";
        String userPoolSecret = "624cb39b07ffd29b946112ea82f5b50e";

        ManagementClient managementClient = new ManagementClient(userPoolId, userPoolSecret);
        managementClient.setHost("https://core.authing.cn");

        this.managementClient = managementClient;
        this.applicationManagementClient = managementClient.application();
    }

    @Test
    public void list() throws IOException {
        List<Application> result = this.applicationManagementClient.list(1, 2).execute();

        Assert.assertTrue(result.size() != 0);
    }

    @Test
    public void findById() throws IOException {
        Application application = this.applicationManagementClient.findById(this.APP_ID).execute();
        Assert.assertEquals(this.APP_ID, application.getId());
    }

    @Test
    public void activeUsers() throws IOException {
        IActiveUsersParam param = new IActiveUsersParam(APP_ID);

        Pagination<ActiveUser> pagination = managementClient.application().activeUsers(param).execute();

        Assert.assertNotNull(pagination.getList());
    }

    @Test
    public void refreshApplicationSecret() throws IOException {
        Application application = managementClient.application().refreshApplicationSecret(APP_ID).execute();

        Assert.assertNotNull(application);
    }

}
