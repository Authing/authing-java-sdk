package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListTenantsDto {
    /**
     * 搜索关键字
     */
    @JsonProperty("keywords")
    private String keywords;
    /**
     * 是否增加返回租户成员统计
     */
    @JsonProperty("withMembersCount")
    private Boolean withMembersCount;
    /**
     * 增加返回租户下 app 简单信息
     */
    @JsonProperty("withAppDetail")
    private Boolean withAppDetail;
    /**
     * 增加返回租户下创建者简单信息
     */
    @JsonProperty("withCreatorDetail")
    private Boolean withCreatorDetail;
    /**
     * 增加返回租户下来源 app 简单信息
     */
    @JsonProperty("withSourceAppDetail")
    private Boolean withSourceAppDetail;
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
    /**
     * 租户来源
     */
    @JsonProperty("source")
    private Object source;

    public String getKeywords() {
        return keywords;
    }
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Boolean getWithMembersCount() {
        return withMembersCount;
    }
    public void setWithMembersCount(Boolean withMembersCount) {
        this.withMembersCount = withMembersCount;
    }

    public Boolean getWithAppDetail() {
        return withAppDetail;
    }
    public void setWithAppDetail(Boolean withAppDetail) {
        this.withAppDetail = withAppDetail;
    }

    public Boolean getWithCreatorDetail() {
        return withCreatorDetail;
    }
    public void setWithCreatorDetail(Boolean withCreatorDetail) {
        this.withCreatorDetail = withCreatorDetail;
    }

    public Boolean getWithSourceAppDetail() {
        return withSourceAppDetail;
    }
    public void setWithSourceAppDetail(Boolean withSourceAppDetail) {
        this.withSourceAppDetail = withSourceAppDetail;
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

    public Object getSource() {
        return source;
    }
    public void setSource(Object source) {
        this.source = source;
    }



}