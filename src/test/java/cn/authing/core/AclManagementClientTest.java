package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.AclManagementClient;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.types.CommonMessage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Objects;

public class AclManagementClientTest {

    private AclManagementClient aclManagementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        ManagementClient managementClient =
            new ManagementClient("6006d6820d57817ed7a95f84", "4bdb08da88e47a978001d236a09e27f9");
        managementClient.setHost("https://core.authing.cn");
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
}
