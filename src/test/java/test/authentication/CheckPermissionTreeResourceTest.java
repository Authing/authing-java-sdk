package test.authentication;

import cn.authing.sdk.java.client.AuthenticationClient;
import cn.authing.sdk.java.dto.BindEmailDto;
import cn.authing.sdk.java.dto.CheckPermissionStringResourceDto;
import cn.authing.sdk.java.dto.CheckPermissionTreeResourceDto;
import cn.authing.sdk.java.dto.CheckResourcePermissionsRespDto;
import cn.authing.sdk.java.dto.CommonResponseDto;
import cn.authing.sdk.java.dto.LoginTokenRespDto;
import cn.authing.sdk.java.dto.SignInOptionsDto;
import cn.authing.sdk.java.model.AuthenticationClientOptions;
import cn.authing.sdk.java.util.JsonUtils;
import java.util.ArrayList;

/**
 * @Author yuJiaLe
 * @date 2022/12/29
 **/
public class CheckPermissionTreeResourceTest {
    // 需要替换成你的 Authing App ID
    private static final String APP_ID = "AUTHING_APP_ID";
    // 需要替换成你的 Authing App Secret
    private static final String APP_SECRET = "AUTHING_APP_SECRET";
    // 需要替换成你的 Authing App Host
    private static final String APP_HOST = "AUTHING_APP_HOST";
    // 需要替换成你的 Authing Access Token
    private static final String ACCESS_TOKEN = "AUTHING_ACCESS_TOKEN";

    public static void main(String[] args) throws Throwable {

        AuthenticationClientOptions clientOptions = new AuthenticationClientOptions();
        clientOptions.setAppId(APP_ID);
        clientOptions.setAppSecret(APP_SECRET);
        clientOptions.setAppHost(APP_HOST);
        clientOptions.setAccessToken(ACCESS_TOKEN);

        AuthenticationClient client = new AuthenticationClient(clientOptions);

        CheckPermissionTreeResourceDto reqDto = new CheckPermissionTreeResourceDto();
        ArrayList<String> list = new ArrayList<>();

        list.add("/treeExampleResourceCode/children1Code");
        list.add("/treeExampleResourceCode/children1Code/children2Code");
        reqDto.setResources(list);
        reqDto.setAction("get");
        CheckResourcePermissionsRespDto checkResourcePermissionsRespDto = client
                .checkPermissionByTreeResource(reqDto);
        System.out.println(JsonUtils.serialize(checkResourcePermissionsRespDto));
    }
}