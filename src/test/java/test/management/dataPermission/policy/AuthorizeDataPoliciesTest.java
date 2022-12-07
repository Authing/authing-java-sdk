package test.management.dataPermission.policy;

import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.CommonResponseDto;
import cn.authing.sdk.java.dto.CreateAuthorizeDataPolicyDto;
import cn.authing.sdk.java.dto.SubjectDto;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;
import com.nimbusds.jose.shaded.ow2asm.Type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthorizeDataPoliciesTest {
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

        CreateAuthorizeDataPolicyDto reqDto = new CreateAuthorizeDataPolicyDto();
        reqDto.setPolicyIds(Collections.singletonList("policy_id"));
        List<SubjectDto> targetList = new ArrayList<>();
        SubjectDto subjectDto = new SubjectDto();
        subjectDto.setId("id");
        subjectDto.setName("name");
        subjectDto.setType(SubjectDto.Type.USER);
        targetList.add(subjectDto);
        reqDto.setTargetList(targetList);
        CommonResponseDto response = client.authorizeDataPolicies(reqDto);
        System.out.println(JsonUtils.serialize(response));
    }
}
