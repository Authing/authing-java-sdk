import client.ManagementClient;
import dto.GetManagementAccessTokenDto;
import dto.GetManagementTokenRespDto;
import model.ManagementClientOptions;
import util.JsonUtils;

public class ManagementClientTest {

    public static void main(String[] args) throws Exception{
        ManagementClientOptions options = new ManagementClientOptions("60e043f8cd91b87d712b6365","158c7679333bc196b524d78d745813e5");
        ManagementClient client = new ManagementClient(options);
        GetManagementAccessTokenDto reqDto = new GetManagementAccessTokenDto();
        GetManagementTokenRespDto managementToken = client.getManagementToken(reqDto);
        System.out.println(JsonUtils.serialize(managementToken));
    }
}
