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
        request.setEmail("email_1924");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.CreateUserReqDto.PasswordEncryptType.SM2);
        request.setPhone("phone_930");
        request.setPhoneCountryCode("phoneCountryCode_5770");
        request.setUsername("username_2538");
        request.setName("name_2475");
        request.setNickname("nickname_2948");
        request.setPhoto("photo_2924");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthday("birthday_5229");
        request.setCountry("country_4057");
        request.setProvince("province_5010");
        request.setCity("city_8517");
        request.setAddress("address_2173");
        request.setStreetAddress("streetAddress_8912");
        request.setPostalCode("postalCode_5374");
        request.setExternalId("externalId_7425");
        request.setDepartmentIds(Collections.singletonList("String_623"));
        request.setCustomData(Collections.emptyList());
        request.setPassword("password_1375");
        request.setTenantIds(Collections.singletonList("String_9705"));
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}