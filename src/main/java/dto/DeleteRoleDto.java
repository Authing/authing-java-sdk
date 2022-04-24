package dto;

import java.util.List;


public class DeleteRoleDto {
    /**
     * 角色 code 集合
     */
    private List<String> codeList;
    /**
     * 权限分组的 code
     */
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