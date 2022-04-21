package dto;

import dto.UserPagingDto;

public class UserPaginatedRespDto {
    /**
     * 业务状态码，可以通过此状态码判断操作是否成功，200 表示成功。
     */
    private Int code
    /**
     * 描述信息
     */
    private String message
    /**
     * 细分错误码，可通过此错误码得到具体的错误类型。
     */
    private Int errorCode
    /**
     * 数据
     */
    private UserPagingDto data

    public Int getCode() {
        return code;
    }
    public void setCode(Int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Int getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(Int errorCode) {
        this.errorCode = errorCode;
    }

    public UserPagingDto getData() {
        return data;
    }
    public void setData(UserPagingDto data) {
        this.data = data;
    }

};