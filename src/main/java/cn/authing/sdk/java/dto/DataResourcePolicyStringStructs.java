package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.ArrayOrStringActionDto;

public class DataResourcePolicyStringStructs {
    /**
     * 数据策略所拥有对某一个数据资源的操作权限，所有操作（ALL）,特定操作（SPECIAL）
     */
    @JsonProperty("operationType")
    private String operationType;
    /**
     * 数据权限列表，每个策略下所有的数据权限节点
     */
    @JsonProperty("actionList")
    private List<ArrayOrStringActionDto> actionList;

    public String getOperationType() {
        return operationType;
    }
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public List<ArrayOrStringActionDto> getActionList() {
        return actionList;
    }
    public void setActionList(List<ArrayOrStringActionDto> actionList) {
        this.actionList = actionList;
    }



}