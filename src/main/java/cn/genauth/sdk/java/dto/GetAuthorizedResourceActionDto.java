package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetAuthorizedResourceActionDto {
    /**
     * AND or OR
     */
    @JsonProperty("op")
    private Op op;
    /**
     * Action 列表
     */
    @JsonProperty("list")
    private List<String> list;

    public Op getOp() {
        return op;
    }
    public void setOp(Op op) {
        this.op = op;
    }

    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }


    /**
     * AND or OR
     */
    public static enum Op {

        @JsonProperty("AND")
        AND("AND"),

        @JsonProperty("OR")
        OR("OR"),
        ;

        private String value;

        Op(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}