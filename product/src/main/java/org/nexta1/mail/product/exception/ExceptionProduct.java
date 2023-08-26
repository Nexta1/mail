package org.nexta1.mail.product.exception;

import lombok.extern.slf4j.Slf4j;
import org.nexta1.common.exception.CodeEnum;
import org.nexta1.common.utils.R;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 *
 * @author nexta1
 * @date 2023/8/19 14:38
 */
@Slf4j
@RestControllerAdvice(basePackages = "org.nexta1.mail.product")
public class ExceptionProduct {

    @ExceptionHandler(value = Exception.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("数据校验异常{},{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        Map<String, String> map = new HashMap<>();
        bindingResult.getFieldErrors().forEach((i) -> {
            String message = i.getDefaultMessage();
            String field = i.getField();
            map.put(field, message);
        });
        return R.error(CodeEnum.VALID_ERROR.getCode(), CodeEnum.VALID_ERROR.getMsg()).put("data", map);
    }
}
