package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.UserDto;

public class UserListRespDto {
    /**
     * 业务状态码，可以通过此状态码判断操作是否成功，200 表示成功。
     */
    @JsonProperty("statusCode")
    private Integer statusCode;
    /**
     * 描述信息
     */
    @JsonProperty("message")
    private String message;
    /**
     * 细分错误码，可通过此错误码得到具体的错误类型。
     */
    @JsonProperty("apiCode")
    private Integer apiCode;
    /**
     * 用户列表
     */
    @JsonProperty("data")
    private List<UserDto> data;

    public Integer getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getApiCode() {
        return apiCode;
    }
    public void setApiCode(Integer apiCode) {
        this.apiCode = apiCode;
    }

    public List<UserDto> getData() {
        return data;
    }
    public void setData(List<UserDto> data) {
        this.data = data;
    }



}