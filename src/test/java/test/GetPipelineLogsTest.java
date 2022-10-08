import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class GetPipelineLogsTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        GetPipelineLogsDto request = new GetPipelineLogsDto();
        request.setFuncId("funcId_20");
        request.setPage(0);
        request.setLimit(0);

        PipelineFunctionPaginatedRespDto response = client.getPipelineLogs(request);
        System.out.println(JsonUtils.serialize(response));
    }

}