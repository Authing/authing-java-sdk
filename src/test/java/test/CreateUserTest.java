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
        request.setEmail("email_3935");
        request.setPasswordEncryptType(cn.authing.sdk.java.dto.CreateUserReqDto.PasswordEncryptType.SM2);
        request.setPhone("phone_5019");
        request.setPhoneCountryCode("phoneCountryCode_8627");
        request.setUsername("username_9957");
        request.setExternalId("externalId_5895");
        request.setName("name_4228");
        request.setNickname("nickname_3909");
        request.setPhoto("photo_3020");
        request.setGender(cn.authing.sdk.java.dto.CreateUserReqDto.Gender.M);
        request.setEmailVerified(Boolean.TRUE);
        request.setPhoneVerified(Boolean.TRUE);
        request.setBirthdate("birthdate_1851");
        request.setCountry("country_5879");
        request.setProvince("province_2519");
        request.setCity("city_9967");
        request.setAddress("address_4851");
        request.setStreetAddress("streetAddress_6929");
        request.setPostalCode("postalCode_2966");
        request.setCompany("company_9230");
        request.setBrowser("browser_7417");
        request.setDevice("device_6650");
        request.setGivenName("givenName_4764");
        request.setFamilyName("familyName_659");
        request.setMiddleName("middleName_3901");
        request.setProfile("profile_750");
        request.setPreferredUsername("preferredUsername_3829");
        request.setWebsite("website_7002");
        request.setZoneinfo("zoneinfo_6362");
        request.setLocale("locale_7494");
        request.setFormatted("formatted_4487");
        request.setRegion("region_8074");
        request.setDepartmentIds(Collections.singletonList("String_5868"));
        request.setCustomData(Collections.emptyList());
        request.setPassword("password_3811");
        request.setSalt("salt_2891");
        request.setTenantIds(Collections.singletonList("String_73"));
        request.setOtp(new cn.authing.sdk.java.dto.CreateUserOtpDto());
        request.setIdentities(Collections.singletonList(new cn.authing.sdk.java.dto.CreateIdentityDto()));
        request.setOptions(new cn.authing.sdk.java.dto.CreateUserOptionsDto());

        UserSingleRespDto response = client.createUser(request);
        System.out.println(JsonUtils.serialize(response));
    }

}