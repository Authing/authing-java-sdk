package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.OrgManagementClient;
import cn.authing.core.types.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class OrgManagementClientTest {

    private OrgManagementClient orgManagementClient;
    private ManagementClient managementClient;
    private Org org1 = null;
    private Org org2 = null;

    @Before
    public void before() throws IOException, GraphQLException {
        //String userPoolId = "60adc2fef7ae7440c9265f07";
        //String userPoolSecret = "19cd7e941c1af56c5b3fafef72359a3b";
        String userPoolId = "60b5f0f0fd968f101eb20187";//""60adc2fef7ae7440c9265f07";
        String userPoolSecret = "d50e0f2eafbc30e44fbd0a9ca8434ae2";//""19cd7e941c1af56c5b3fafef72359a3b";
        ManagementClient managementClient = new ManagementClient(userPoolId, userPoolSecret);
        managementClient.setClientTimeOut(10000L,600000L);
        managementClient.setSkipCheckHttps(true);
        managementClient.setHost("https://core.cctv.issac.top"); //.setHost("https://core.authing.cn");

        this.orgManagementClient = managementClient.org();

        managementClient.requestToken().execute();
    }

    @Test
    public void create() throws IOException, GraphQLException {
        org1 = this.orgManagementClient.create(new CreateOrgParam("org1", "name1", "desc1")).execute();
        org2 = this.orgManagementClient.create(new CreateOrgParam("org2", "name2", "desc2")).execute();

        Assert.assertNotNull(org1);
    }

    @Test
    public void findById() throws IOException, GraphQLException {
        this.create();
        Org org = this.orgManagementClient.findById(org1.getId()).execute();
        Assert.assertNotNull(org);
    }

    @Test
    public void deleteById() throws IOException, GraphQLException {
        this.create();
        CommonMessage commonMessage = this.orgManagementClient.deleteById(org1.getId()).execute();
        CommonMessage commonMessage2 = this.orgManagementClient.deleteById(org2.getId()).execute();
        Assert.assertTrue(commonMessage != null && commonMessage2 != null);
    }

    @Test
    public void list() throws IOException, GraphQLException {
        OrgsParam param = new OrgsParam();
        PaginatedOrgs paginatedOrgs = this.orgManagementClient.list(param).execute();
        Assert.assertNotNull(paginatedOrgs);
    }

    @Test
    public void searchNodes() throws IOException, GraphQLException {
        List<Node> list = this.orgManagementClient.searchNodes(new SearchNodesParam("Xuancao")).execute();
        Assert.assertTrue(list.size() != 0);
    }

    @Test
    public void findNodeById() throws IOException, GraphQLException {
        Node node = this.orgManagementClient.findNodeById("5fa400e2e925831ca4c65d5e").execute();
        Assert.assertNotNull(node);
    }

    @Test
    public void addNode() throws IOException, GraphQLException {
        Org org3 = this.orgManagementClient.create(new CreateOrgParam("org3", "name3", "desc3")).execute();
        AddNodeV2Param param = new AddNodeV2Param(org3.getId(), "org1nodename")
                .withParentNodeId("60bc3acf2709aac85d7fcde9");
        Node node = this.orgManagementClient.addNode(param).execute();
        this.orgManagementClient.deleteById(node.getId());
        Assert.assertEquals(org3.getId(), node.getOrgId());
    }

    @Test
    public void updateNode() throws IOException, GraphQLException {
        UpdateNodeParam param = new UpdateNodeParam(0, "");
        param.setId("5fa403d884bdea112d176a67");
        param.setName("asdfasdfasdf");
        param.setDescription("asdfasdfads");
        Node node = this.orgManagementClient.updateNode(param).execute();
        Assert.assertNotNull(node);
    }

    @Test
    public void moveNode() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = this.orgManagementClient.list(new OrgsParam()).execute();
        Org orgResult = this.orgManagementClient.moveNode(paginatedOrgs.getList().get(2).getId(), "5fa403d884bdea112d176a67", "5fa400e2e925831ca4c65d5e").execute();
        Assert.assertNotNull(orgResult);
    }

    @Test
    public void deleteNode() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = this.orgManagementClient.list(new OrgsParam()).execute();
        CommonMessage commonMessage = this.orgManagementClient.deleteNode(new DeleteNodeParam(paginatedOrgs.getList().get(0).getId(), "5fa40708f3322a0c020d2157")).execute();
        Assert.assertNotNull(commonMessage);
    }

    @Test
    public void isRootNode() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = this.orgManagementClient.list(new OrgsParam()).execute();
        Boolean right = this.orgManagementClient.isRootNode("5fa4aeb7e1c8bd0e625441e1", paginatedOrgs.getList().get(0).getId()).execute();
        Assert.assertTrue(right);
    }

    @Test
    public void rootNode() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = this.orgManagementClient.list(new OrgsParam()).execute();
        Node node = this.orgManagementClient.rootNode(new RootNodeParam(paginatedOrgs.getList().get(0).getId())).execute();
        Assert.assertNotNull(node);
    }

    @Test
    public void listChildren() throws IOException, GraphQLException {
        this.create();
        PaginatedOrgs paginatedOrgs = this.orgManagementClient.list(new OrgsParam()).execute();
        List<Node> nodes = this.orgManagementClient.listChildren(paginatedOrgs.getList().get(2).getId(), "5fa4aeb7e1c8bd0e625441e1").execute();
        Assert.assertNotNull(nodes);
    }

    @Test
    public void addMembers() throws IOException, GraphQLException {
        Node node = this.orgManagementClient.addMembers("60b0699640becb72dbfaef15", Collections.singletonList("60b5db8f31f1ca6c64691c48")).execute();
        Assert.assertNotNull(node);
    }

    @Test
    public void listMembers() throws IOException, GraphQLException {
        Node node = this.orgManagementClient.listMembers(new NodeByIdWithMembersParam("5fa406f6d24bb9320d7192b2")).execute();
        Assert.assertNotNull(node);
    }

    @Test
    public void removeMembers() throws IOException, GraphQLException {
        Node node = this.orgManagementClient.removeMembers("5fa406f6d24bb9320d7192b2", Collections.singletonList("5f8d2827c41264570d13200f")).execute();
        Assert.assertNotNull(node);
    }

    @Test
    public void importByJson() throws IOException {
        Map map1 = new HashMap<>();
        map1.put("name","ceshi11");
        map1.put("code","ceshi11");

        Map map2 = new HashMap<>();
        map2.put("name","ceshi12");
        map2.put("code","ceshi12");

        Map map = new HashMap<>();
        map.put("name","ceshi1");
        map.put("code","ceshi1");
        map.put("children",Arrays.asList(map1,map2));

        Gson gson = new Gson();
        String jsonStr = gson.toJson(map);
        OrgNode nodes = this.orgManagementClient.importByJson(jsonStr).execute();

        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(nodes));
        Assert.assertNotNull(nodes);
    }

    @Test
    public void exportAll() throws IOException {
        List<OrgNode> nodes = this.orgManagementClient.exportAll().execute();

        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(nodes));
        Assert.assertNotNull(nodes);
    }

    @Test
    public void exportByOrgId() throws IOException {
        String orgId = "6080281309bf790c1f9138db";
        OrgNode node = this.orgManagementClient.exportByOrgId(orgId).execute();

        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(node));

        Assert.assertNotNull(node);
    }

    @Test
    public void listAuthorizedResourcesByNodeId() throws IOException, GraphQLException {
        ListNodeByIdAuthorizedResourcesParam param = new ListNodeByIdAuthorizedResourcesParam("ORG_ID")
                .withNamespace("default")
                .withResourceType("DATA");

        Node res = managementClient.org().listAuthorizedResourcesByNodeId(param).execute();
    }
}


