import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreatePipelineFunctionTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreatePipelineFunctionDto request = new CreatePipelineFunctionDto();
        request.setSourceCode("sourceCode_1736");
        request.setScene(cn.authing.sdk.java.dto.CreatePipelineFunctionDto.Scene.PRE_REGISTER);
        request.setFuncName("funcName_5892");
        request.setFuncDescription("funcDescription_9197");
        request.setIsAsynchronous(Boolean.TRUE);
        request.setTimeout(0);
        request.setTerminateOnTimeout(Boolean.TRUE);
        request.setEnabled(Boolean.TRUE);

        PipelineFunctionSingleRespDto response = client.createPipelineFunction(request);
        System.out.println(JsonUtils.serialize(response));
    }

}