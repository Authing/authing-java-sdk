package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateOrganizationTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateOrganizationReqDto request = new CreateOrganizationReqDto();
        request.setOrganizationName("organizationName_5594");
        request.setOrganizationCode("organizationCode_115");
        request.setDescription("description_2092");
        request.setOpenDepartmentId("openDepartmentId_1284");
        request.setI18n(new cn.authing.sdk.java.dto.OrganizationNameI18nDto());

        OrganizationSingleRespDto response = client.createOrganization(request);
        System.out.println(JsonUtils.serialize(response));
    }

}