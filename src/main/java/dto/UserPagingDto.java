package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.UserDto;

public class UserPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("getTotalCount")
    private Integer totalCount;
    /**
     * 数据列表
     */
    @JsonProperty("getList")
    private List<UserDto> nase list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UserDto> nase getList() {
        return list;
    }
    public void setList(List<UserDto> nase list) {
        this.list = list;
    }



}