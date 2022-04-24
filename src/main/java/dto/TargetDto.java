package dto;

import java.util.List;


public class TargetDto {
    /**
     * 目标类型，接受用户，部门
     */
    private TargetDto.targetType targetType;
    /**
     * 目标的 ID
     */
    private String targetIdentifier;

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


    /**
     * 目标类型，接受用户，部门
     */
    public static enum TargetType {
        USER('USER'),
        ROLE('ROLE'),
        GROUP('GROUP'),
        DEPARTMENT('DEPARTMENT'),
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