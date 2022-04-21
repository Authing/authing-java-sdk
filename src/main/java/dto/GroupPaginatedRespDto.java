package dto;

import dto.GroupPagingDto;

public class GroupPaginatedRespDto {
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
    private GroupPagingDto data

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

    public GroupPagingDto getData() {
        return data;
    }
    public void setData(GroupPagingDto data) {
        this.data = data;
    }

};