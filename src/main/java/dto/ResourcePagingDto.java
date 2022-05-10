package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.ResourceDto;

public class ResourcePagingDto {
    /**
     * 业务状态码，可以通过此状态码判断操作是否成功，200 表示成功。
     */
    @JsonProperty("getCode")
    private Integer code;
    /**
     * 描述信息
     */
    @JsonProperty("getMessage")
    private String message;
    /**
     * 细分错误码，可通过此错误码得到具体的错误类型。
     */
    @JsonProperty("getErrorCode")
    private Integer errorCode;
    /**
     * 记录总数
     */
    @JsonProperty("getTotalCount")
    private Integer totalCount;
    /**
     * 数据
     */
    @JsonProperty("getList")
    private List<ResourceDto> nase list;

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

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<ResourceDto> nase getList() {
        return list;
    }
    public void setList(List<ResourceDto> nase list) {
        this.list = list;
    }



}