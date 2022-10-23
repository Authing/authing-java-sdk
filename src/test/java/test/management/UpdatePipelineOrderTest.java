package test.management;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CommonResponseDto;
import cn.authing.sdk.java.dto.CostGetCurrentPackageRespDto;
import cn.authing.sdk.java.dto.UpdatePipelineOrderDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class UpdatePipelineOrderTest {
    // 需要替换成你的 Authing Access Key ID
    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    // 需要替换成你的 Authing Access Key Secret
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        // 如果是私有化部署的客户，需要设置 Authing 服务域名
        // clientOptions.setHost("https://api.your-authing-service.com");

        ManagementClient client = new ManagementClient(clientOptions);

        UpdatePipelineOrderDto updatePipelineOrderDto = new UpdatePipelineOrderDto();
        updatePipelineOrderDto.setScene(UpdatePipelineOrderDto.Scene.POST_AUTHENTICATION);
        List<String> order = new ArrayList<>();
        updatePipelineOrderDto.setOrder(order);
        CommonResponseDto commonResponseDto = client.updatePipelineOrder(updatePipelineOrderDto);
        System.out.println(JsonUtils.serialize(commonResponseDto));
    }
}
