package cn.genauth.sdk.java.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class EmailTemplateCategoryDto {
    /**
     * 类别名称
     */
    @JsonProperty("title")
    private String title;
    /**
     * 类别英文名称
     */
    @JsonProperty("titleEn")
    private String titleEn;
    /**
     * 描述
     */
    @JsonProperty("desc")
    private String desc;
    /**
     * 英文描述
     */
    @JsonProperty("descEn")
    private String descEn;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleEn() {
        return titleEn;
    }
    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDescEn() {
        return descEn;
    }
    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }



}