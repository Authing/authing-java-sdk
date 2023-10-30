package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DepartmentSortingDto {
    /**
     * 进行排序的字段，可选值为：
     * - `updatedAt`: 创建时间
     * - `createdAt`: 修改时间
     * - `name`: 邮箱
     *
     */
    @JsonProperty("field")
    private Field field;
    /**
     * 排序顺序：
     * - `desc`: 按照从大到小降序。
     * - `asc`: 按照从小到大升序。
     *
     */
    @JsonProperty("order")
    private Order order;

    public Field getField() {
        return field;
    }
    public void setField(Field field) {
        this.field = field;
    }

    public Order getOrder() {
        return order;
    }
    public void setOrder(Order order) {
        this.order = order;
    }


    /**
     * 进行排序的字段，可选值为：
     * - `updatedAt`: 创建时间
     * - `createdAt`: 修改时间
     * - `name`: 邮箱
     *
     */
    public static enum Field {

        @JsonProperty("updatedAt")
        UPDATED_AT("updatedAt"),

        @JsonProperty("createdAt")
        CREATED_AT("createdAt"),

        @JsonProperty("name")
        NAME("name"),
        ;

        private String value;

        Field(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    /**
     * 排序顺序：
     * - `desc`: 按照从大到小降序。
     * - `asc`: 按照从小到大升序。
     *
     */
    public static enum Order {

        @JsonProperty("desc")
        DESC("desc"),

        @JsonProperty("asc")
        ASC("asc"),
        ;

        private String value;

        Order(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}