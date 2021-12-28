package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.GroupsManagementClient;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.OrgManagementClient;
import cn.authing.core.mgmt.TenantManagementClient;
import cn.authing.core.types.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class TenantManagementClientTest {
    private TenantManagementClient client;

    private ManagementClient managementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        String userPoolId = "6131967faf2eb55a2b7cebcc";
        String userPoolSecret = "4c829dbf3a29bcfcb2019017045c714f";
        managementClient = new ManagementClient(userPoolId, userPoolSecret);
        managementClient.setHost("https://core.authing.cn");
        this.client = managementClient.tanantManagement();

        managementClient.requestToken().execute();
    }

    @Test
    public void create() throws IOException, GraphQLException {
        CreateTenantParams createTenantParams = new CreateTenantParams("create","61319680ea8b30c9ca9ca071","","descr");
        CreateTenantResponse createTenantResponse = this.client.create(createTenantParams).execute();
        Assert.assertNotNull(createTenantResponse);
    }
}


