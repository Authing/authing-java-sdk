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
        request.setUserId("userId_6125");
        request.setPhoneCountryCode("phoneCountryCode_4895");
        request.setName("name_3227");
        request.setNickname("nickname_8331");
        request.setPhoto("photo_6329");
        request.setExternalId("externalId_8057");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.DELETED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_6562");
        request.setCountry("country_2065");
        request.setProvince("province_1061");
        request.setCity("city_4217");
        request.setAddress("address_4034");
        request.setStreetAddress("streetAddress_2688");
        request.setPostalCode("postalCode_1880");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_7122");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.UpdateUserReqDto.PasswordEncryptType.SM2);
        request.setEmail("email_4400");
        request.setPhone("phone_1064");
        request.setPassword("password_2608");
        request.setCustomData(Collections.emptyList());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}