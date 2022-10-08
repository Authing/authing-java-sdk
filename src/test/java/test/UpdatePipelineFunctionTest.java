import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdatePipelineFunctionTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdatePipelineFunctionDto request = new UpdatePipelineFunctionDto();
        request.setFuncId("funcId_9278");
        request.setFuncName("funcName_8129");
        request.setFuncDescription("funcDescription_7258");
        request.setSourceCode("sourceCode_6881");
        request.setIsAsynchronous(Boolean.TRUE);
        request.setTimeout(0);
        request.setTerminateOnTimeout(Boolean.TRUE);
        request.setEnabled(Boolean.TRUE);

        PipelineFunctionSingleRespDto response = client.updatePipelineFunction(request);
        System.out.println(JsonUtils.serialize(response));
    }

}