import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateOrganizationTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateOrganizationReqDto request = new CreateOrganizationReqDto();
        request.setOrganizationName("organizationName_1487");
        request.setOrganizationCode("organizationCode_3025");
        request.setDescription("description_4267");
        request.setOpenDepartmentId("openDepartmentId_8969");
        request.setI18n(new cn.authing.sdk.java.dto.OrganizationNameI18nDto());

        OrganizationSingleRespDto response = client.createOrganization(request);
        System.out.println(JsonUtils.serialize(response));
    }

}