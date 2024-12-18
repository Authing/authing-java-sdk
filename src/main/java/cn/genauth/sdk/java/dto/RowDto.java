package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RowDto {
    /**
     * 行 id
     */
    @JsonProperty("rowId")
    private String rowId;
    /**
     * 单元格列表
     */
    @JsonProperty("cellList")
    private List<CellDto> cellList;

    public String getRowId() {
        return rowId;
    }
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public List<CellDto> getCellList() {
        return cellList;
    }
    public void setCellList(List<CellDto> cellList) {
        this.cellList = cellList;
    }



}