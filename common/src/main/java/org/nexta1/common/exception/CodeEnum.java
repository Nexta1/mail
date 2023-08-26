package org.nexta1.common.exception;

/**
 * Description:
 *
 * @author nexta1
 * @date 2023/8/19 16:42
 */

public enum CodeEnum {
    VALID_ERROR(10000, "参数校验异常");
    private final int code;
    private final String msg;

    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
