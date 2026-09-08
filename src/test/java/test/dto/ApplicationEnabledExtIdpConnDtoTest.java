package test.dto;

import cn.authing.sdk.java.dto.ApplicationEnabledExtIdpConnDto;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApplicationEnabledExtIdpConnDtoTest {

    public static void main(String[] args) throws Exception {
        ApplicationEnabledExtIdpConnDto iShenzhenDto = new ObjectMapper().readValue(
                "{\"extIdpType\":\"i-shenzhen\"}",
                ApplicationEnabledExtIdpConnDto.class
        );

        if (iShenzhenDto.getExtIdpType() != ApplicationEnabledExtIdpConnDto.ExtIdpType.I_SHENZHEN) {
            throw new AssertionError("i-shenzhen identity provider type was not preserved");
        }

        ApplicationEnabledExtIdpConnDto unknownDto = new ObjectMapper().readValue(
                "{\"extIdpType\":\"future-idp\"}",
                ApplicationEnabledExtIdpConnDto.class
        );

        if (unknownDto.getExtIdpType() != ApplicationEnabledExtIdpConnDto.ExtIdpType.UNKNOWN) {
            throw new AssertionError("unknown identity provider type was not accepted");
        }
    }
}
