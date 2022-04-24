package dto;

import java.util.List;

import dto.ResourceDto;

public class ResourceListRespDto {
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
     * 资源详情列表
     */
    private List<ResourceDto> data;

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

    public List<ResourceDto> getData() {
        return data;
    }
    public void setData(List<ResourceDto> data) {
        this.data = data;
    }



};