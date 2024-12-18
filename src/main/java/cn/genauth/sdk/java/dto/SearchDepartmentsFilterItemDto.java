package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchDepartmentsFilterItemDto {
    /**
     * 高级搜索指定的部门字段：
     * - `updatedAt`: 更新时间，高级搜索请用时间戳
     * - `createdAt`: 创建时间，高级搜索请用时间戳
     * - `name`: 部门名称
     *
     */
    @JsonProperty("field")
    private String field;
    /**
     * 运算符，可选值为：
     * - `EQUAL`: 全等，适用于数字和字符串的全等匹配
     * - `IN`: 为某个数组中的元素
     * - `GREATER`: 大于或等于，适用于数字、日期类型数据的比较
     * - `LESSER`: 小于或等于，适用于数字、日期类型数据的比较
     * - `BETWEEN`: 介于什么什么之间，适用于数字、日期类型数据的比较
     * - `CONTAINS`: 字符串包含
     *
     */
    @JsonProperty("operator")
    private Operator operator;
    /**
     * 搜索值，不同的 `field` 对应的 `value` 类型可能不一样
     */
    @JsonProperty("value")
    private Object value;

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }


    /**
     * 运算符，可选值为：
     * - `EQUAL`: 全等，适用于数字和字符串的全等匹配
     * - `IN`: 为某个数组中的元素
     * - `GREATER`: 大于或等于，适用于数字、日期类型数据的比较
     * - `LESSER`: 小于或等于，适用于数字、日期类型数据的比较
     * - `BETWEEN`: 介于什么什么之间，适用于数字、日期类型数据的比较
     * - `CONTAINS`: 字符串包含
     *
     */
    public static enum Operator {

        @JsonProperty("BETWEEN")
        BETWEEN("BETWEEN"),

        @JsonProperty("EQUAL")
        EQUAL("EQUAL"),

        @JsonProperty("IN")
        IN("IN"),

        @JsonProperty("LESSER")
        LESSER("LESSER"),

        @JsonProperty("GREATER")
        GREATER("GREATER"),

        @JsonProperty("CONTAINS")
        CONTAINS("CONTAINS"),
        ;

        private String value;

        Operator(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}