package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.graphql.GraphQLResponse;
import cn.authing.core.http.Callback;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.UserpoolManagementClient;
import cn.authing.core.types.CommonMessage;
import cn.authing.core.types.Env;
import cn.authing.core.types.UpdateUserpoolInput;
import cn.authing.core.types.UserPool;
import org.jetbrains.annotations.Nullable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class UserpoolManagementClientTest {
    private ManagementClient managementClient;
    private UserpoolManagementClient userpoolManagementClient;

    private String randomString() {
        return Integer.toString(new Random().nextInt());
    }

    @Before
    public void before() throws IOException, GraphQLException {
        managementClient = new ManagementClient("5f8d2827feaa6e31598fda94", "6cf056a42f48df61e220a47b10d893ba");
        managementClient.setHost("https://core.authing.cn");
        userpoolManagementClient = managementClient.userpool();

        managementClient.requestToken().execute();
    }

    @Test
    public void detail() throws ExecutionException, InterruptedException {
        CompletableFuture<UserPool> future = new CompletableFuture<>();
        userpoolManagementClient.detail().enqueue(new Callback<UserPool>() {
            @Override
            public void onSuccess(UserPool result) {
                future.complete(result);
                System.out.println(result);
            }

            @Override
            public void onFailure(@Nullable GraphQLResponse.ErrorInfo error) {
                System.out.println(error);
            }
        });
        Assert.assertNotNull(future.get());
    }

    @Test
    public void update() throws IOException, GraphQLException {
        UserPool userPool = userpoolManagementClient.update(new UpdateUserpoolInput().withDescription("desc")).execute();
        Assert.assertNotNull(userPool);
    }

    @Test
    public void listEnv() throws IOException {
        List<Env> list = userpoolManagementClient.listEnv().execute();
        Assert.assertTrue(list.size() == 0);
    }

    @Test
    public void addEnv() throws IOException {
        Env env = userpoolManagementClient.addEnv("key", "value").execute();
        Assert.assertEquals("key", env.getKey());
    }

    @Test
    public void removeEnv() throws IOException {
        CommonMessage message = userpoolManagementClient.removeEnv("key").execute();
        Assert.assertEquals(200, message.getCode().intValue());
    }
}
