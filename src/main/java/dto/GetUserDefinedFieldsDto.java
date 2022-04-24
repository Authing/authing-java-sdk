package dto;

import java.util.List;


public class GetUserDefinedFieldsDto {
    /**
     * 主体类型，目前支持用户和角色
     */
    private GetUserDefinedFieldsDto.targetType targetType;

    public GetUserDefinedFieldsDto.targetType getTargetType() {
        return targetType;
    }
    public void setTargetType(GetUserDefinedFieldsDto.targetType targetType) {
        this.targetType = targetType;
    }


    /**
     * 主体类型，目前支持用户和角色
     */
    public static enum TargetType {
        USER('USER'),
        ROLE('ROLE'),
        ;

        private String value;
        targetType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


};