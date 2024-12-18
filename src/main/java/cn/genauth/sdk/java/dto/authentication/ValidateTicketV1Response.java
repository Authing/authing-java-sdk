package cn.genauth.sdk.java.dto.authentication;


public class ValidateTicketV1Response {
    /**
     * ticket 是否有效
     */
    private boolean valid = false;

    /**
     * 返回信息
     */
    private String message;

    public ValidateTicketV1Response() {
    }

    public ValidateTicketV1Response(boolean valid, String message) {
        this.valid = valid;
        this.message = message;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ValidateTicketV1Response{" +
                "valid=" + valid +
                ", message='" + message + '\'' +
                '}';
    }
}
