import cn.authing.sdk.java.client.ManagementClient;
import cn.authing.sdk.java.dto.*;
import cn.authing.sdk.java.model.ManagementClientOptions;
import cn.authing.sdk.java.util.JsonUtils;

import java.util.Collections;



public class UpdateUserTest {

    private static final String ACCESS_KEY_ID = "YOUR_ACCESS_KEY_ID";
    private static final String ACCESS_KEY_SECRET = "YOUR_ACCESS_KEY_SECRET";


    public static void main(String[] args) throws Throwable {
        ManagementClientOptions clientOptions = new ManagementClientOptions(ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        ManagementClient client = new ManagementClient(clientOptions);

        UpdateUserReqDto request = new UpdateUserReqDto();
        request.setUserId("userId_4924");
        request.setPhoneCountryCode("phoneCountryCode_6846");
        request.setName("name_4506");
        request.setNickname("nickname_144");
        request.setPhoto("photo_4446");
        request.setExternalId("externalId_2116");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.SUSPENDED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_808");
        request.setCountry("country_8005");
        request.setProvince("province_6076");
        request.setCity("city_4419");
        request.setAddress("address_416");
        request.setStreetAddress("streetAddress_4542");
        request.setPostalCode("postalCode_9086");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_1586");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.UpdateUserReqDto.PasswordEncryptType.SM2);
        request.setEmail("email_6082");
        request.setPhone("phone_7721");
        request.setPassword("password_3750");
        request.setCustomData(Collections.emptyList());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}