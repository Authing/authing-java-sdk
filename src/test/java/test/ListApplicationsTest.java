package test
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class ListApplicationsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        ListApplicationDto request = new ListApplicationDto();
        request.setPage(0);
        request.setLimit(0);
        request.setIsIntegrateApp(Boolean.TRUE);
        request.setIsSelfBuiltApp(Boolean.TRUE);
        request.setSsoEnabled(Boolean.TRUE);
        request.setKeyword(Boolean.TRUE);

        ApplicationPaginatedRespDto response = client.listApplications(request);
        System.out.println(JsonUtils.serialize(response));
    }

}