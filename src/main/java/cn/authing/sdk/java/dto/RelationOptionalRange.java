package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.Condition;

public class RelationOptionalRange {
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
    private Condition conditions;

    public String getConjunction() {
        return conjunction;
    }
    public void setConjunction(String conjunction) {
        this.conjunction = conjunction;
    }

    public Condition getConditions() {
        return conditions;
    }
    public void setConditions(Condition conditions) {
        this.conditions = conditions;
    }



}