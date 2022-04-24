package dto;

import java.util.List;


public class DeleteRoleDto {
    /**
     * 角色 code 集合
     */
    private List<string> codeList;
    /**
     * 权限分组的 code
     */
    private String namespace;

    public List<string> getCodeList() {
        return codeList;
    }
    public void setCodeList(List<string> codeList) {
        this.codeList = codeList;
    }

    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }



};