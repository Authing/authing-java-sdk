package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.UdfManagementClient;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class UdfManagementClientTest {

    private UdfManagementClient udfManagementClient;

    private ManagementClient managementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        String userPoolId = "5f45cad3ece50b62de2a02cd";
//        String userPoolId = "59f86b4832eb28071bdd9214";
        String userPoolSecret = "624cb39b07ffd29b946112ea82f5b50e";
//        String userPoolSecret = "271ba9dc00486c18488aebb0962bd50d";

        ManagementClient managementClient = new ManagementClient(userPoolId, userPoolSecret);
        managementClient.setHost("https://core.authing.cn");
//        managementClient.setHost("http://localhost:3000");
        this.managementClient = managementClient;
        this.udfManagementClient = managementClient.udf();

        managementClient.requestToken().execute();
    }

    @Test
    public void list() throws IOException, GraphQLException {
        List<UserDefinedField> list = this.udfManagementClient.list(UdfTargetType.USER).execute();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void set() throws IOException, GraphQLException {
        UserDefinedField udf = this.udfManagementClient.set(UdfTargetType.USER, "key", UdfDataType.STRING, "label").execute();
        Assert.assertEquals(udf.getKey(), "key");
    }

    @Test
    public void remove() throws IOException, GraphQLException {
        this.udfManagementClient.set(UdfTargetType.USER, "key", UdfDataType.STRING, "label").execute();
        CommonMessage message = this.udfManagementClient.remove(UdfTargetType.USER, "key").execute();
        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
    }

    @Test
    public void setUdvBatch() throws IOException, GraphQLException {
        List<UserDefinedDataInput> inputs = Arrays.asList(
                new UserDefinedDataInput("1-1", "1-1 Value"),
                new UserDefinedDataInput("1-2", "1-2 Value"));

        String userId = "604b34ca6aa796c8b77d6c26";

        List<UserDefinedData> list = managementClient.udf().setUdvBatch(UdfTargetType.USER, userId, inputs).execute();

        Assert.assertNotNull(list);
    }
}
