package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.AclManagementClient;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class AclManagementClientTest {

    private AclManagementClient aclManagementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        ManagementClient managementClient = new ManagementClient("60540b7b4cb3196d6621ef5c", "b2e3cbdd563a3f9578f9a7d60915b294");
        managementClient.setHost("http://localhost:3000");
        this.aclManagementClient = managementClient.acl();

        managementClient.requestToken().execute();
    }

    @Test
    public void allow() throws IOException, GraphQLException {
        CommonMessage message = this.aclManagementClient.allow("resource:id", "action:id").execute();
        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
    }

    @Test
    public void isAllowed() throws IOException, GraphQLException {
        boolean flag =
                this.aclManagementClient.isAllowed("6006d685cf5b43013bf83797", "resource:id", "action:id").execute();
        Assert.assertFalse(flag);
    }

    @Test
    public void getResources() throws IOException {
        Pagination<IResourceResponse> execute = this.aclManagementClient.getResources().execute();

        Assert.assertNotNull(execute.getList());
    }

    @Test
    public void createResource() throws IOException {
        ArrayList<IAction> list = new ArrayList<>();
        list.add(new IAction("name", null));


        IResourceDto iResourceDto = new IResourceDto(
                String.valueOf(new Date().getTime()),
                ResourceType.API,
                null,
                list,
                "default"
        );
        IResourceResponse execute = this.aclManagementClient.createResource(iResourceDto).execute();

        Assert.assertNotNull(execute);
    }

    @Test
    public void updateResource() throws IOException {

        String code = String.valueOf(new Date().getTime());

        ArrayList<IAction> list = new ArrayList<>();
        list.add(new IAction("name", null));

        IResourceDto iResourceDto = new IResourceDto(
                code,
                ResourceType.API,
                "第一次创建的 API",
                list,
                "default"
        );

        this.aclManagementClient.createResource(iResourceDto).execute();

        String tempString = "第二次修改的 API";
        IResourceResponse execute = this.aclManagementClient.updateResource(code, new IResourceDto(
                code,
                ResourceType.API,
                tempString,
                list,
                "default"
        )).execute();

        Assert.assertEquals(execute.getDescription(), tempString);
        Assert.assertEquals(execute.getCode(), code);
    }

    @Test
    public void deleteResource() throws IOException {
        String code = String.valueOf(new Date().getTime());
        String namespaceCode = "default";

        ArrayList<IAction> list = new ArrayList<>();
        list.add(new IAction("name", null));

        IResourceDto iResourceDto = new IResourceDto(
                code,
                ResourceType.API,
                null,
                list,
                namespaceCode
        );

        this.aclManagementClient.createResource(iResourceDto).execute();


        Boolean execute = this.aclManagementClient.deleteResource(code, namespaceCode).execute();

        Assert.assertTrue(execute);

    }
}
