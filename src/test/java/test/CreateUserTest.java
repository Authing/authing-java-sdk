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
        request.setEmail("email_8732");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.CreateUserReqDto.PasswordEncryptType.SM2);
        request.setPhone("phone_4408");
        request.setPhoneCountryCode("phoneCountryCode_81");
        request.setUsername("username_467");
        request.setName("name_250");
        request.setNickname("nickname_1230");
        request.setPhoto("photo_1777");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_1064");
        request.setCountry("country_2718");
        request.setProvince("province_7697");
        request.setCity("city_4200");
        request.setAddress("address_2004");
        request.setStreetAddress("streetAddress_3405");
        request.setPostalCode("postalCode_9737");
        request.setExternalId("externalId_9275");
        request.setDepartmentIds(Collections.singletonList("String_2658"));
        request.setCustomData(Collections.emptyList());
        request.setPassword("password_3098");
        request.setTenantIds(Collections.singletonList("String_7191"));
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}