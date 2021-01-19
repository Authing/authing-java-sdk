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
import java.util.Objects;

public class UdfManagementClientTest {

    private UdfManagementClient udfManagementClient;

    @Before
    public void before() throws IOException, GraphQLException {
        ManagementClient managementClient = new ManagementClient("6006d6820d57817ed7a95f84", "4bdb08da88e47a978001d236a09e27f9");
        managementClient.setHost("https://core.authing.cn");
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
}
