package dto;

import java.util.List;


public class GetUserDefinedFieldsDto {
    /**
     * 主体类型，目前支持用户和角色
     */
    private TargetType targetType;

    public TargetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetType targetType) {
        this.targetType = targetType;
    }


    /**
     * 主体类型，目前支持用户和角色
     */
    public static enum TargetType {
        USER("USER"),
        ROLE("ROLE"),
        ;

        private String value;

        TargetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}