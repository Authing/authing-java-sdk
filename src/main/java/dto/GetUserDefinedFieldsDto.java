package dto;


public class GetUserDefinedFieldsDto {
    /**
     * 主体类型，目前支持用户和角色
     */
    private GetUserDefinedFieldsDto.targetType targetType

    public GetUserDefinedFieldsDto.targetType getTargetType() {
        return targetType;
    }
    public void setTargetType(GetUserDefinedFieldsDto.targetType targetType) {
        this.targetType = targetType;
    }

};