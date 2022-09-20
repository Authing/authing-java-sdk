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
        request.setStatus(cn.authing.sdk.java.dto.CreateUserReqDto.Status.SUSPENDED);
        request.setEmail("email_8584");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.CreateUserReqDto.PasswordEncryptType.SM2);
        request.setPhone("phone_7430");
        request.setPhoneCountryCode("phoneCountryCode_6987");
        request.setUsername("username_2005");
        request.setName("name_5925");
        request.setNickname("nickname_5452");
        request.setPhoto("photo_8350");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_5157");
        request.setCountry("country_5594");
        request.setProvince("province_1919");
        request.setCity("city_4668");
        request.setAddress("address_2041");
        request.setStreetAddress("streetAddress_6859");
        request.setPostalCode("postalCode_580");
        request.setExternalId("externalId_6004");
        request.setDepartmentIds(Collections.singletonList("String_3372"));
        request.setCustomData(Collections.emptyList());
        request.setPassword("password_9311");
        request.setTenantIds(Collections.singletonList("String_6711"));
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}