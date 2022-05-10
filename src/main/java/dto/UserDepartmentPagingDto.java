package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import dto.UserDepartmentRespDto;

public class UserDepartmentPagingDto {
    /**
     * 记录总数
     */
    @JsonProperty("getTotalCount")
    private Integer totalCount;
    /**
     * 响应数据
     */
    @JsonProperty("getList")
    private List<UserDepartmentRespDto> nase list;

    public Integer getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<UserDepartmentRespDto> nase getList() {
        return list;
    }
    public void setList(List<UserDepartmentRespDto> nase list) {
        this.list = list;
    }



}