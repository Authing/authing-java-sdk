import client.ManagementClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.GetManagementAccessTokenDto;
import model.ManagementClientOptions;

public class ManagementClientTest {

    public static void main(String[] args) throws Exception{
        ManagementClientOptions options = new ManagementClientOptions("60e043f8cd91b87d712b6365","158c7679333bc196b524d78d745813e5");
        ManagementClient client = new ManagementClient(options);
        GetManagementAccessTokenDto reqDto = new GetManagementAccessTokenDto();
        client.getManagementToken(reqDto);
    }
}
