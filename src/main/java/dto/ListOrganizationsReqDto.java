package dto;

import java.util.List;

import dto.ListOptionsDto;

public class ListOrganizationsReqDto {
    /**
     * 可选参数
     */
    private ListOptionsDto options;

    public ListOptionsDto getOptions() {
        return options;
    }
    public void setOptions(ListOptionsDto options) {
        this.options = options;
    }



}