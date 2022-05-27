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
        request.setUserId("userId_1331");
        request.setPhoneCountryCode("phoneCountryCode_3207");
        request.setName("name_673");
        request.setNickname("nickname_9245");
        request.setPhoto("photo_267");
        request.setExternalId("externalId_4192");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.DELETED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_6697");
        request.setCountry("country_3874");
        request.setProvince("province_4881");
        request.setCity("city_5580");
        request.setAddress("address_2140");
        request.setStreetAddress("streetAddress_38");
        request.setPostalCode("postalCode_6358");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_3664");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.UpdateUserReqDto.PasswordEncryptType.SM2);
        request.setEmail("email_160");
        request.setPhone("phone_5312");
        request.setPassword("password_264");
        request.setCustomData(Collections.emptyList());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}