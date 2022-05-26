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
        request.setEmail("email_2935");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.CreateUserReqDto.PasswordEncryptType.SM2);
        request.setPhone("phone_9998");
        request.setPhoneCountryCode("phoneCountryCode_576");
        request.setUsername("username_2951");
        request.setName("name_1296");
        request.setNickname("nickname_3152");
        request.setPhoto("photo_6660");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_934");
        request.setCountry("country_4389");
        request.setProvince("province_8589");
        request.setCity("city_8816");
        request.setAddress("address_9562");
        request.setStreetAddress("streetAddress_7634");
        request.setPostalCode("postalCode_4714");
        request.setExternalId("externalId_1157");
        request.setDepartmentIds(Collections.singletonList("String_4642"));
        request.setCustomData(Collections.emptyList());
        request.setPassword("password_8838");
        request.setTenantIds(Collections.singletonList("String_1834"));
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}