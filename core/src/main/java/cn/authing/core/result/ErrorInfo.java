package cn.authing.core.result;

/**
 * Error message
 * code description
 * 1-99 Client error
 * 100-599 Http Status code
 * Others are error codes returned by the server, which generally correspond to errors in the request
 */
public class ErrorInfo {
    /**
     * Client exception
     */
    public static final int CODE_EXCEPTION = 1;

    private Object message;
    private int code;

    public static ErrorInfo generate(int code, String msg) {
        return new ErrorInfo(code, msg);
    }

    private ErrorInfo(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public String getMessage() {
        return message.toString();
    }

    public int getCode() {
        return code;
    }
}
