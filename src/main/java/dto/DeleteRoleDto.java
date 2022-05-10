package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class DeleteRoleDto {
    /**
     * 角色 code 集合
     */
    @JsonProperty("getCodeList")
    private List<String> codeList;
    /**
     * 所属权限分组的 code
     */
    @JsonProperty("getNamespace")
    private String namespace;

    public List<String> getCodeList() {
        return codeList;
    }
    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



}