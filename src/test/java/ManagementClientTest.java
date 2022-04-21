import client.ManagementClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.GetManagementAccessTokenDto;
import model.ManagementClientOptions;

public class ManagementClientTest {

    public static void main(String[] args) throws Exception{
        ManagementClientOptions options = new ManagementClientOptions("123","asd");
        ManagementClient client = new ManagementClient(options);
        GetManagementAccessTokenDto reqDto = new GetManagementAccessTokenDto();
        client.getManagementToken(reqDto);
    }
}
