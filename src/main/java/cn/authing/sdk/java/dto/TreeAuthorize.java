package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.TreeAuthBo;

public class TreeAuthorize {
    /**
     * 树资源授权列表
     */
    @JsonProperty("authList")
    private List<TreeAuthBo> authList;

    public List<TreeAuthBo> getAuthList() {
        return authList;
    }
    public void setAuthList(List<TreeAuthBo> authList) {
        this.authList = authList;
    }



}