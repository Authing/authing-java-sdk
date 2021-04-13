package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.AclManagementClient;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.types.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class AclManagementClientTest {

    private AclManagementClient aclManagementClient;

    private ManagementClient managementClient;

    private final String appId = "605084fe415a744f79029f09";

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
        this.aclManagementClient = managementClient.acl();

        managementClient.requestToken().execute();
    }

    @Test
    public void allow() throws IOException, GraphQLException {
        String userId = "5a597f35085a2000144a10ed";

        CommonMessage message = this.aclManagementClient.allow("resource:id", "action:id", userId).execute();

        Assert.assertEquals(Objects.requireNonNull(message.getCode()).intValue(), 200);
    }

    @Test
    public void isAllowed() throws IOException, GraphQLException {
        String userId = "5a597f35085a2000144a10ed";

        boolean flag =
                this.aclManagementClient.isAllowed(userId, "resource:id", "action:id").execute();

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
        List<IAction> list = Arrays.asList(new IAction("name", null));

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
        list.add(new IAction("name"));

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

    @Test
    public void getApplicationAccessPolicies() throws IOException {
        IAppAccessPolicyQueryFilter app = new IAppAccessPolicyQueryFilter(this.appId);

        Pagination<IApplicationAccessPolicies> execute = this.aclManagementClient.getApplicationAccessPolicies(app).execute();

        Assert.assertNotNull(execute.getList());
    }

    @Test
    public void enableApplicationAccessPolicy() throws IOException {
        List<String> userIds = Collections.singletonList("5a597f35085a2000144a10ed");

        IAppAccessPolicy appAccessPolicy = new IAppAccessPolicy(
                this.appId,
                TargetTypeEnum.USER,
                userIds,
                "default",
                null);

        Boolean execute = this.aclManagementClient.enableApplicationAccessPolicy(appAccessPolicy).execute();
        Boolean execute2 = this.aclManagementClient.disableApplicationAccessPolicy(appAccessPolicy).execute();

        Assert.assertTrue(execute);
        Assert.assertTrue(execute2);
    }

    @Test
    public void allowAccessApplication() throws IOException {
        List<String> userIds = Collections.singletonList("5a597f35085a2000144a10ed");

        IAppAccessPolicy appAccessPolicy = new IAppAccessPolicy(
                this.appId,
                TargetTypeEnum.USER,
                userIds,
                "default",
                null);

        Boolean execute = this.aclManagementClient.allowAccessApplication(appAccessPolicy).execute();
        Boolean execute2 = this.aclManagementClient.denyAccessApplication(appAccessPolicy).execute();
        Assert.assertTrue(execute);
        Assert.assertTrue(execute2);
    }

    @Test
    public void updateDefaultApplicationAccessPolicy() throws IOException {
        IDefaultAppAccessPolicy policy = new IDefaultAppAccessPolicy(
                this.appId,
                DefaultStrategy.DENY_ALL
        );

        Application execute = this.aclManagementClient.updateDefaultApplicationAccessPolicy(policy).execute();

        Assert.assertNotNull(execute);
    }

    @Test
    public void programmaticAccessAccountList() throws IOException {
        IProgrammaticAccessAccountListProps props = new IProgrammaticAccessAccountListProps(this.appId, 1, 10);

        Pagination<ProgrammaticAccessAccount> execute = this.aclManagementClient.programmaticAccessAccountList(props).execute();

        Assert.assertNotNull(execute);
    }

    @Test
    public void createAndDeletePAA() throws IOException {
        ICreateProgrammaticAccessAccountProps props = new ICreateProgrammaticAccessAccountProps(this.appId, 600, "");

        ProgrammaticAccessAccount res = managementClient.acl().createProgrammaticAccessAccount(props).execute();

        Assert.assertNotNull(res);

        Boolean isDelete = managementClient.acl().deleteProgrammaticAccessAccount(res.getId()).execute();

        Assert.assertTrue(isDelete);
    }

    @Test
    public void integratedPAA () throws IOException {
        ICreateProgrammaticAccessAccountProps props = new ICreateProgrammaticAccessAccountProps(this.appId, 600, "");

        ProgrammaticAccessAccount base = managementClient.acl().createProgrammaticAccessAccount(props).execute();

        Assert.assertNotNull(base);

        String PAA_ID = base.getId();

        ProgrammaticAccessAccount disable = managementClient.acl().disableProgrammaticAccessAccount(PAA_ID).execute();

        Assert.assertFalse(disable.getEnabled());

        ProgrammaticAccessAccount enable = managementClient.acl().enableProgrammaticAccessAccount(PAA_ID).execute();

        Assert.assertTrue(enable.getEnabled());

        ProgrammaticAccessAccount account = managementClient.acl()
                .refreshProgrammaticAccessAccountSecret(new IProgrammaticAccessAccountProps(PAA_ID))
                .execute();

        Assert.assertNotEquals(account.getSecret(), base.getSecret());

        Boolean isDelete = managementClient.acl().deleteProgrammaticAccessAccount(base.getId()).execute();

        Assert.assertTrue(isDelete);
    }

}
