package dto;

import dto.ListUsersOptionsDto;

public class ListGroupMembersDto {
    /**
     * 分组 code
     */
    private String code
    /**
     * 可选参数
     */
    private ListUsersOptionsDto options

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public ListUsersOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListUsersOptionsDto options) {
        this.options = options;
    }

};