package cn.authing.core;

import cn.authing.core.graphql.GraphQLException;
import cn.authing.core.mgmt.ManagementClient;
import cn.authing.core.mgmt.OrgManagementClient;
import cn.authing.core.types.*;
import com.google.gson.Gson;
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
        managementClient = new ManagementClient("5f9d0cee4a8f5e150cf6470d", "ea4e02cd9dbff480a64813f7fe3b5cf0");
        managementClient.setHost("https://core.authing.cn");
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
        Org org = this.orgManagementClient.findById(org1.getId()).execute();
        Assert.assertNotNull(org);
    }

    @Test
    public void deleteById() throws IOException, GraphQLException {
        CommonMessage commonMessage = this.orgManagementClient.deleteById(org1.getId()).execute();
        CommonMessage commonMessage2 = this.orgManagementClient.deleteById(org2.getId()).execute();
        Assert.assertTrue(commonMessage != null && commonMessage2 != null);
    }

    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = this.orgManagementClient.list(new OrgsParam()).execute();
        Assert.assertNotNull(paginatedOrgs);
    }

    @Test
    public void searchNodes() throws IOException, GraphQLException {
        List<Node> list = this.orgManagementClient.searchNodes(new SearchNodesParam("1")).execute();
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
                .withParentNodeId(org3.getRootNode().getId());
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
        PaginatedOrgs paginatedOrgs = this.orgManagementClient.list(new OrgsParam()).execute();
        List<Node> nodes = this.orgManagementClient.listChildren(paginatedOrgs.getList().get(2).getId(), "5fa4aeb7e1c8bd0e625441e1").execute();
        Assert.assertNotNull(nodes);
    }

    @Test
    public void addMembers() throws IOException, GraphQLException {
        Node node = this.orgManagementClient.addMembers("5fa406f6d24bb9320d7192b2", Collections.singletonList("5f8d2827c41264570d13200f")).execute();
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
        Node nodes = this.orgManagementClient.importByJson(jsonStr).execute();
        Assert.assertNotNull(nodes);
    }

    @Test
    public void exportAll() throws IOException {
        List<Node> nodes = this.orgManagementClient.exportAll().execute();
        Assert.assertNotNull(nodes);
    }

    @Test
    public void exportByOrgId() throws IOException {
        String orgId = "60210d36262e1086cd2d1209";
        Node node = this.orgManagementClient.exportByOrgId(orgId).execute();
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


