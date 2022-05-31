import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class CreateUserTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        CreateUserReqDto request = new CreateUserReqDto();
        request.setStatus(cn.authing.sdk.java.dto.CreateUserReqDto.Status.DELETED);
        request.setEmail("email_2289");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.CreateUserReqDto.PasswordEncryptType.SM2);
        request.setPhone("phone_1275");
        request.setPhoneCountryCode("phoneCountryCode_191");
        request.setUsername("username_5805");
        request.setName("name_5369");
        request.setNickname("nickname_9551");
        request.setPhoto("photo_777");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_9242");
        request.setCountry("country_417");
        request.setProvince("province_2635");
        request.setCity("city_2086");
        request.setAddress("address_7214");
        request.setStreetAddress("streetAddress_1190");
        request.setPostalCode("postalCode_1892");
        request.setExternalId("externalId_6045");
        request.setDepartmentIds(Collections.singletonList("String_2040"));
        request.setCustomData(Collections.emptyList());
        request.setPassword("password_9339");
        request.setTenantIds(Collections.singletonList("String_365"));
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}