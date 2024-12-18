package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAllRowDto {
    /**
     * 功能 id
     */
    @JsonProperty("modelId")
    private String modelId;
    /**
     * 多个搜索条件的关系：
     * - and: 且
     * - or:  或
     *
     */
    @JsonProperty("conjunction")
    private String conjunction;
    /**
     * 搜索条件
     */
    @JsonProperty("conditions")
    private List<Condition> conditions;

    public String getModelId() {
        return modelId;
    }
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getConjunction() {
        return conjunction;
    }
    public void setConjunction(String conjunction) {
        this.conjunction = conjunction;
    }

    public List<Condition> getConditions() {
        return conditions;
    }
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }



}