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
        request.setUserId("userId_3924");
        request.setPhoneCountryCode("phoneCountryCode_1243");
        request.setName("name_2736");
        request.setNickname("nickname_1977");
        request.setPhoto("photo_2059");
        request.setExternalId("externalId_9738");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.DELETED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthday("birthday_5639");
        request.setCountry("country_1233");
        request.setProvince("province_9816");
        request.setCity("city_7017");
        request.setAddress("address_5670");
        request.setStreetAddress("streetAddress_6490");
        request.setPostalCode("postalCode_5160");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_5043");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.UpdateUserReqDto.PasswordEncryptType.SM2);
        request.setEmail("email_4280");
        request.setPhone("phone_5739");
        request.setPassword("password_7635");
        request.setCustomData(Collections.emptyList());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}