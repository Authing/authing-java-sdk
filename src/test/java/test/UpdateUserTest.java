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
        request.setUserId("userId_2225");
        request.setPhoneCountryCode("phoneCountryCode_569");
        request.setName("name_2");
        request.setNickname("nickname_5847");
        request.setPhoto("photo_106");
        request.setExternalId("externalId_6087");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.SUSPENDED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_2592");
        request.setCountry("country_6764");
        request.setProvince("province_8141");
        request.setCity("city_2537");
        request.setAddress("address_7466");
        request.setStreetAddress("streetAddress_4343");
        request.setPostalCode("postalCode_9491");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_3168");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.UpdateUserReqDto.PasswordEncryptType.SM2);
        request.setEmail("email_5053");
        request.setPhone("phone_3764");
        request.setPassword("password_793");
        request.setCustomData(Collections.emptyList());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}