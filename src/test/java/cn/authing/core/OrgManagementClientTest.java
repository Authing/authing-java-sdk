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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrgManagementClientTest {
    private ManagementClient managementClient;
    private OrgManagementClient orgManagementClient;
    private Org org1 = null;
    private Org org2 = null;
    private Org org1Node = null;
    private Org org2Node = null;

    @Before
    public void before() throws IOException, GraphQLException {
        managementClient = new ManagementClient("5f8d2827feaa6e31598fda94", "6cf056a42f48df61e220a47b10d893ba");
        managementClient.setHost("https://core.authing.cn");
        orgManagementClient = managementClient.org();

        managementClient.requestToken().execute();
    }

    @Test
    public void create() throws IOException, GraphQLException {
        org1 = orgManagementClient.create(new CreateOrgParam("org1", "name1", "desc1")).execute();
        org2 = orgManagementClient.create(new CreateOrgParam("org2", "name2", "desc2")).execute();
        Assert.assertTrue(org1 != null);
    }

    @Test
    public void findById() throws IOException, GraphQLException {
        Org org = orgManagementClient.findById(org1.getId()).execute();
        Assert.assertTrue(org != null);
    }

    @Test
    public void deleteById() throws IOException, GraphQLException {
        CommonMessage commonMessage = orgManagementClient.deleteById(org1.getId()).execute();
        CommonMessage commonMessage2 = orgManagementClient.deleteById(org2.getId()).execute();
        Assert.assertTrue(commonMessage != null && commonMessage2 != null);
    }

    @Test
    public void list() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = orgManagementClient.list(new OrgsParam()).execute();
        Assert.assertTrue(paginatedOrgs != null);
    }

    @Test
    public void findNodeById() throws IOException, GraphQLException {
        Node node = orgManagementClient.findNodeById("5fa400e2e925831ca4c65d5e").execute();
        Assert.assertTrue(node != null);
    }

    @Test
    public void addNode() throws IOException, GraphQLException {
        Org org3 = orgManagementClient.create(new CreateOrgParam("org3", "name3", "desc3")).execute();
        AddNodeParam param = new AddNodeParam(org3.getId(), "org1nodename")
                .withParentNodeId(org3.getRootNode().getId());
        Node node = orgManagementClient.addNode(param).execute();
        orgManagementClient.deleteById(node.getId());
        Assert.assertTrue(org1Node != null);
    }

    @Test
    public void updateNode() throws IOException, GraphQLException {
        UpdateNodeParam param = new UpdateNodeParam(0, "");
        param.setId("5fa403d884bdea112d176a67");
        param.setName("asdfasdfasdf");
        param.setDescription("asdfasdfads");
        Node node = orgManagementClient.updateNode(param).execute();
        Assert.assertTrue(node != null);
    }

    @Test
    public void moveNode() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = orgManagementClient.list(new OrgsParam()).execute();
        Org orgResult = orgManagementClient.moveNode(paginatedOrgs.getList().get(2).getId(), "5fa403d884bdea112d176a67", "5fa400e2e925831ca4c65d5e").execute();
        Assert.assertTrue(orgResult != null);
    }

    @Test
    public void deleteNode() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = orgManagementClient.list(new OrgsParam()).execute();
        CommonMessage commonMessage = orgManagementClient.deleteNode(new DeleteNodeParam(paginatedOrgs.getList().get(0).getId(), "5fa40708f3322a0c020d2157")).execute();
        Assert.assertTrue(commonMessage != null);
    }

    @Test
    public void isRootNode() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = orgManagementClient.list(new OrgsParam()).execute();
        Boolean right = orgManagementClient.isRootNode("5fa4aeb7e1c8bd0e625441e1", paginatedOrgs.getList().get(0).getId()).execute();
        Assert.assertTrue(right);
    }

    @Test
    public void rootNode() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = orgManagementClient.list(new OrgsParam()).execute();
        Node node = orgManagementClient.rootNode(new RootNodeParam(0, paginatedOrgs.getList().get(0).getId())).execute();
        Assert.assertTrue(node != null);
    }

    @Test
    public void listChildren() throws IOException, GraphQLException {
        PaginatedOrgs paginatedOrgs = orgManagementClient.list(new OrgsParam()).execute();
        List<Node> nodes = orgManagementClient.listChildren(paginatedOrgs.getList().get(2).getId(), "5fa4aeb7e1c8bd0e625441e1").execute();
        Assert.assertTrue(nodes != null);
    }

    @Test
    public void addMembers() throws IOException, GraphQLException {
        Node node = orgManagementClient.addMembers("5fa406f6d24bb9320d7192b2", Arrays.asList("5f8d2827c41264570d13200f")).execute();
        Assert.assertTrue(node != null);
    }

    @Test
    public void listMembers() throws IOException, GraphQLException {
        Node node = orgManagementClient.listMembers(new NodeByIdWithMembersParam("5fa406f6d24bb9320d7192b2")).execute();
        Assert.assertTrue(node != null);
    }

    @Test
    public void removeMembers() throws IOException, GraphQLException {
        Node node = orgManagementClient.removeMembers("5fa406f6d24bb9320d7192b2", Arrays.asList("5f8d2827c41264570d13200f")).execute();
        Assert.assertTrue(node != null);
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
        Node nodes = orgManagementClient.importByJson(jsonStr).execute();
        Assert.assertTrue(nodes != null);
    }

}


