package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListWebhookLogsData {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 返回列表
     */
    @JsonProperty("list")
    private List<WebhookLogDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<WebhookLogDto> getList() {
        return list;
    }
    public void setList(List<WebhookLogDto> list) {
        this.list = list;
    }



}