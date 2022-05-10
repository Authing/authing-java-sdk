package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.UserLoginHistoryDto;

public class UserLoginHistoryPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("getTotalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("getList")
    private List<UserLoginHistoryDto> nase list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UserLoginHistoryDto> nase getList() {
        return list;
    }
    public void setList(List<UserLoginHistoryDto> nase list) {
        this.list = list;
    }



}