package test.generator.management;
import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateOrganizationTest {

    private static final String ACCESS_KEY_ID = "AUTHING_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "AUTHING_ACCESS_KEY_SECRET";

    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions();
        clientOptions.setAccessKeyId(ACCESS_KEY_ID);
        clientOptions.setAccessKeySecret(ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateOrganizationReqDto request = new UpdateOrganizationReqDto();
        request.setOrganizationCode("organizationCode_2201");
        request.setDescription("description_3854");
        request.setOpenDepartmentId("openDepartmentId_8350");
        request.setLeaderUserIds(Collections.singletonList("String_7884"));
        request.setI18n(new cn.authing.sdk.java.dto.OrganizationNameI18nDto());
        request.setOrganizationNewCode("organizationNewCode_7440");
        request.setOrganizationName("organizationName_151");

        OrganizationSingleRespDto response = client.updateOrganization(request);
        System.out.println(JsonUtils.serialize(response));
    }

}