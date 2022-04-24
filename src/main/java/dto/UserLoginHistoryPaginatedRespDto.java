package dto;

import java.util.List;

import dto.UserLoginHistoryPagingDto;

public class UserLoginHistoryPaginatedRespDto {
    /**
     * 业务状态码，可以通过此状态码判断操作是否成功，200 表示成功。
     */
    private Integer code;
    /**
     * 描述信息
     */
    private String message;
    /**
     * 细分错误码，可通过此错误码得到具体的错误类型。
     */
    private Integer errorCode;
    /**
     * 数据
     */
    private UserLoginHistoryPagingDto data;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public UserLoginHistoryPagingDto getData() {
        return data;
    }
    public void setData(UserLoginHistoryPagingDto data) {
        this.data = data;
    }



}