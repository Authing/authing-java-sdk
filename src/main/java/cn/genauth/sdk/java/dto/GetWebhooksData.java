package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetWebhooksData {
    /**
     * 记录总数
     */
    @JsonProperty("totalCount")
    private Integer totalCount;
    /**
     * 返回列表
     */
    @JsonProperty("list")
    private List<WebhookDto> list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<WebhookDto> getList() {
        return list;
    }
    public void setList(List<WebhookDto> list) {
        this.list = list;
    }



}