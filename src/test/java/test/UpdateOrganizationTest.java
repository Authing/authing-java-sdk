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
        request.setOrganizationCode("organizationCode_119");
        request.setDescription("description_1743");
        request.setOpenDepartmentId("openDepartmentId_1955");
        request.setLeaderUserIds(Collections.singletonList("String_4558"));
        request.setI18n(new cn.authing.sdk.java.dto.OrganizationNameI18nDto());
        request.setOrganizationNewCode("organizationNewCode_9742");
        request.setOrganizationName("organizationName_1382");

        OrganizationSingleRespDto response = client.updateOrganization(request);
        System.out.println(JsonUtils.serialize(response));
    }

}