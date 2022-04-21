package client;

import dto.GetManagementAccessTokenDto;
import dto.GetManagementTokenRespDto;
import model.AuthingRequestConfig;
import model.ManagementClientOptions;

/**
 * @author luojielin
 */
public class ManagementClient extends BaseClient {

    public ManagementClient(ManagementClientOptions options) {
        this.options = options;
    }

    public GetManagementTokenRespDto getManagementToken(GetManagementAccessTokenDto reqDto) {
        AuthingRequestConfig config = new AuthingRequestConfig();
        config.setUrl("/api/v3/get-management-token");
        config.setBody(reqDto);
        config.setMethod("POST");
        String response = request(config);
        return deserialize(response, GetManagementTokenRespDto.class);
    }



}
