package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetLdapServerLogDto {
    /**
     * 类型：1 访问日志，2 错误日志
     */
    @JsonProperty("type")
    private Integer type;
    /**
     * 当前页,从 1 开始
     */
    @JsonProperty("page")
    private Integer page;
    /**
     * 每页条数
     */
    @JsonProperty("limit")
    private Integer limit;
    /**
     * 连接标识
     */
    @JsonProperty("connection")
    private Integer connection;
    /**
     * 操作码
     */
    @JsonProperty("operationNumber")
    private Integer operationNumber;
    /**
     * 错误码
     */
    @JsonProperty("errorCode")
    private Integer errorCode;
    /**
     * 消息内容
     */
    @JsonProperty("message")
    private String message;
    /**
     * 开始时间-时间戳
     */
    @JsonProperty("startTime")
    private Integer startTime;
    /**
     * 结束时间-时间戳
     */
    @JsonProperty("endTime")
    private Integer endTime;

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getConnection() {
        return connection;
    }
    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public Integer getOperationNumber() {
        return operationNumber;
    }
    public void setOperationNumber(Integer operationNumber) {
        this.operationNumber = operationNumber;
    }

    public Integer getErrorCode() {
        return errorCode;
    }
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStartTime() {
        return startTime;
    }
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }



}