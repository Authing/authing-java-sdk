import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateOrganizationTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateOrganizationReqDto request = new UpdateOrganizationReqDto();
        request.setOrganizationCode("organizationCode_5871");
        request.setDescription("description_7267");
        request.setOpenDepartmentId("openDepartmentId_2898");
        request.setOrganizationNewCode("organizationNewCode_3899");
        request.setOrganizationName("organizationName_4689");

        OrganizationSingleRespDto response = client.updateOrganization(request);
        System.out.println(JsonUtils.serialize(response));
    }

}