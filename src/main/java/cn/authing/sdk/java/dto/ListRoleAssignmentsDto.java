package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ListRoleAssignmentsDto {
    @JsonProperty("requestBody")
    private ListRoleAssignmentsDto requestBody;

    public ListRoleAssignmentsDto getRequestBody() {
        return requestBody;
    }
    public void setRequestBody(ListRoleAssignmentsDto requestBody) {
        this.requestBody = requestBody;
    }



}