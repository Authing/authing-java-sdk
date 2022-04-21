package dto;


public class CreateGroupReqDto {
    /**
     * 分组描述
     */
    private String description
    /**
     * 分组名称
     */
    private String name
    /**
     * 分组 code
     */
    private String code

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

};