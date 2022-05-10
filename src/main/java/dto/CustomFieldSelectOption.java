package dto;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class CustomFieldSelectOption {
    /**
     * 枚举值 value
     */
    @JsonProperty("getValue")
    private String value;
    /**
     * 枚举值 label
     */
    @JsonProperty("getLabel")
    private String label;

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }



}