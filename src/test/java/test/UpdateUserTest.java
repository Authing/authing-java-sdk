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
        request.setUserId("userId_7619");
        request.setPhoneCountryCode("phoneCountryCode_4805");
        request.setName("name_6032");
        request.setNickname("nickname_5598");
        request.setPhoto("photo_6410");
        request.setExternalId("externalId_5283");
        request.setStatus(cn.authing.sdk.java.dto.UpdateUserReqDto.Status.DELETED);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_5272");
        request.setCountry("country_9611");
        request.setProvince("province_9024");
        request.setCity("city_8221");
        request.setAddress("address_3643");
        request.setStreetAddress("streetAddress_5576");
        request.setPostalCode("postalCode_814");
        request.setGender(cn.authing.sdk.java.dto.UpdateUserReqDto.Gender.M);
        request.setUsername("username_122");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.UpdateUserReqDto.PasswordEncryptType.SM2);
        request.setEmail("email_8372");
        request.setPhone("phone_1997");
        request.setPassword("password_8238");
        request.setCustomData(Collections.emptyList());

        UserSingleRespDto response = client.updateUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}