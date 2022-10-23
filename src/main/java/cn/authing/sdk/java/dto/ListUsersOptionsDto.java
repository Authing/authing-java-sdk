package cn.authing.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

import cn.authing.sdk.java.dto.PaginationDto;
import cn.authing.sdk.java.dto.SortingDto;

public class ListUsersOptionsDto {
    /**
     * 分页配置
     */
    @JsonProperty("pagination")
    private PaginationDto pagination;
    /**
     * 排序设置，可以设置多项按照多个字段进行排序
     */
    @JsonProperty("sort")
    private List<SortingDto> sort;
    /**
     * 模糊搜索匹配的用户字段，可选值为：
     * - `phone`: 用户手机号，不能包含手机号区号，默认包含
     * - `email`: 用户邮箱，默认包含
     * - `name`: 用户名称，默认包含
     * - `username`: 用户名，默认包含
     * - `nickname`: 用户昵称，默认包含
     * - `id`: 用户 ID
     * - `company`: 公司
     * - `givenName`: 名
     * - `familyName`: 姓
     * - `middleName`: 中间名
     * - `preferredUsername`: Preferred Username
     * - `profile`: 个人资料
     * - `website`: 个人网站
     * - `address`: 地址
     * - `formatted`: 格式化地址
     * - `streetAddress`: 街道地址
     * - `postalCode`: 邮编号码
     *
     */
    @JsonProperty("fuzzySearchOn")
    private List<String> fuzzySearchOn;
    /**
     * 是否获取自定义数据
     */
    @JsonProperty("withCustomData")
    private Boolean withCustomData;
    /**
     * 是否获取 identities
     */
    @JsonProperty("withIdentities")
    private Boolean withIdentities;
    /**
     * 是否获取部门 ID 列表
     */
    @JsonProperty("withDepartmentIds")
    private Boolean withDepartmentIds;

    public PaginationDto getPagination() {
        return pagination;
    }
    public void setPagination(PaginationDto pagination) {
        this.pagination = pagination;
    }

    public List<SortingDto> getSort() {
        return sort;
    }
    public void setSort(List<SortingDto> sort) {
        this.sort = sort;
    }

    public List<String> getFuzzySearchOn() {
        return fuzzySearchOn;
    }
    public void setFuzzySearchOn(List<String> fuzzySearchOn) {
        this.fuzzySearchOn = fuzzySearchOn;
    }

    public Boolean getWithCustomData() {
        return withCustomData;
    }
    public void setWithCustomData(Boolean withCustomData) {
        this.withCustomData = withCustomData;
    }

    public Boolean getWithIdentities() {
        return withIdentities;
    }
    public void setWithIdentities(Boolean withIdentities) {
        this.withIdentities = withIdentities;
    }

    public Boolean getWithDepartmentIds() {
        return withDepartmentIds;
    }
    public void setWithDepartmentIds(Boolean withDepartmentIds) {
        this.withDepartmentIds = withDepartmentIds;
    }



}