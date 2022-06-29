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
        request.setEmail("email_8606");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.CreateUserReqDto.PasswordEncryptType.SM2);
        request.setPhone("phone_64");
        request.setPhoneCountryCode("phoneCountryCode_8273");
        request.setUsername("username_9803");
        request.setName("name_3548");
        request.setNickname("nickname_8491");
        request.setPhoto("photo_4656");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_8337");
        request.setCountry("country_7568");
        request.setProvince("province_8319");
        request.setCity("city_54");
        request.setAddress("address_2535");
        request.setStreetAddress("streetAddress_4055");
        request.setPostalCode("postalCode_4011");
        request.setExternalId("externalId_3384");
        request.setDepartmentIds(Collections.singletonList("String_6643"));
        request.setCustomData(Collections.emptyList());
        request.setPassword("password_9037");
        request.setTenantIds(Collections.singletonList("String_5319"));
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}