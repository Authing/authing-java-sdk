import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateDepartmentTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateDepartmentReqDto request = new CreateDepartmentReqDto();
        request.setParentDepartmentId("parentDepartmentId_2415");
        request.setName("name_4954");
        request.setOrganizationCode("organizationCode_430");
        request.setOpenDepartmentId("openDepartmentId_1576");
        request.setDescription("description_1497");
        request.setCode("code_1853");
        request.setIsVirtualNode(Boolean.TRUE);
        request.setI18n(new cn.authing.sdk.java.dto.I18nDto());
        request.setCustomData(Collections.emptyList());
        request.setDepartmentIdType(cn.authing.sdk.java.dto.CreateDepartmentReqDto.DepartmentIdType.DEPARTMENT_ID);

        DepartmentSingleRespDto response = client.createDepartment(request);
        System.out.println(JsonUtils.serialize(response));
    }

}