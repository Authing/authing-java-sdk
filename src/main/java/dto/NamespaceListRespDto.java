package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.NamespaceDto;

public class NamespaceListRespDto {
    /**
     * 权限分组列表
     */
    @JsonProperty("getData")
    private List<NamespaceDto> nase data;

    public List<NamespaceDto> nase getData() {
        return data;
    }
    public void setData(List<NamespaceDto> nase data) {
        this.data = data;
    }



}