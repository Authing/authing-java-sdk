package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImportTenantNotifyUserDto {
    /**
     * 导入记录 id
     */
    @JsonProperty("importId")
    private String importId;
    /**
     * 页码
     */
    @JsonProperty("page")
    private String page;
    /**
     * 每页获取的数据量
     */
    @JsonProperty("limit")
    private String limit;

    public String getImportId() {
        return importId;
    }
    public void setImportId(String importId) {
        this.importId = importId;
    }

    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }

    public String getLimit() {
        return limit;
    }
    public void setLimit(String limit) {
        this.limit = limit;
    }



}