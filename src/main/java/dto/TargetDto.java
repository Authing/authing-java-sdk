package dto;


public class TargetDto {
    /**
     * 目标类型，接受用户，部门
     */
    private TargetDto.targetType targetType
    /**
     * 目标的 ID
     */
    private String targetIdentifier

    public TargetDto.targetType getTargetType() {
        return targetType;
    }
    public void setTargetType(TargetDto.targetType targetType) {
        this.targetType = targetType;
    }

    public String getTargetIdentifier() {
        return targetIdentifier;
    }
    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

};