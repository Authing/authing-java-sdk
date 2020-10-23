package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.UdfManagementClient;
import cn.authing.core.types.CommonMessage;
import cn.authing.core.types.UdfDataType;
import cn.authing.core.types.UdfTargetType;
import cn.authing.core.types.UserDefinedField;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class UdfManagementClientTest {
    private ManagementClient managementClient;
    private UdfManagementClient udfManagementClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        managementClient = new ManagementClient("59f86b4832eb28071bdd9214", "4b880fff06b080f154ee48c9e689a541");
        managementClient.setHost("http://localhost:3000");
        udfManagementClient = managementClient.udf();

        managementClient.requestToken().execute();
    }

    @Test
    public void list() throws IOException, GraphQLException {
        List<UserDefinedField> list = udfManagementClient.list(UdfTargetType.USER).execute();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void set() throws IOException, GraphQLException {
        UserDefinedField udf = udfManagementClient.set(UdfTargetType.USER, "key", UdfDataType.STRING, "label").execute();
        Assert.assertEquals(udf.getKey(), "key");
    }

    @Test
    public void remove() throws IOException, GraphQLException {
        udfManagementClient.set(UdfTargetType.USER, "key", UdfDataType.STRING, "label").execute();
        CommonMessage message = udfManagementClient.remove(UdfTargetType.USER, "key").execute();
        Assert.assertEquals(message.getCode().intValue(), 200);
    }
}
