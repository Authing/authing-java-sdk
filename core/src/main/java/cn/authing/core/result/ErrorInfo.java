package cn.authing.core.result;

/**
 * 错误信息
 * code 说明
 * 1-99 是客户端错误
 * 100-599 是 Http 请求状态码
 * 其他是服务端返回的错误码，一般对应请求中的错误
 */
public class ErrorInfo {
    /**
     * 客户端遇到了异常
     */
    public static final int CODE_EXCEPTION = 1;

    private String message;
    private int code;

    public static ErrorInfo generate(int code, String msg) {
        return new ErrorInfo(code, msg);
    }

    private ErrorInfo(int code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
