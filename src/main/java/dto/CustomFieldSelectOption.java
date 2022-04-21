package dto;


public class CustomFieldSelectOption {
    /**
     * 枚举值 value
     */
    private String value
    /**
     * 枚举值 label
     */
    private String label

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

};