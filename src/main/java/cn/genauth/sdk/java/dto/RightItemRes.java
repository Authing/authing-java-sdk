package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RightItemRes {
    /**
     * 响应数据
     */
    @JsonProperty("rightsItems")
    private List<RightItemDto> rightsItems;

    public List<RightItemDto> getRightsItems() {
        return rightsItems;
    }
    public void setRightsItems(List<RightItemDto> rightsItems) {
        this.rightsItems = rightsItems;
    }



}