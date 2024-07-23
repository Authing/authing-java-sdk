package cn.authing.sdk.java.dto;

import java.util.List;

/**
 * 数据资源扩展字段列表
 */
public class GetDenfListRespDto {

    /**
     * 下一页开始的索引，当最后一页时返回 -1
     */
    private Integer nextStartIndex;

    /**
     * 是否被截断，true 表示可以查询下一页，false 表示是最后一页数据
     */
    private Boolean truncated;

    /**
     * 扩展字段列表
     */
    private List<Dnef> list;

    public Integer getNextStartIndex() {
        return nextStartIndex;
    }

    public void setNextStartIndex(Integer nextStartIndex) {
        this.nextStartIndex = nextStartIndex;
    }

    public Boolean getTruncated() {
        return truncated;
    }

    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    public List<Dnef> getList() {
        return list;
    }

    public void setList(List<Dnef> list) {
        this.list = list;
    }
}
