package com.imooc.sell.hander;

import com.imooc.sell.exception.SellerAuthorizeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-28 15:01:50
 */
@ControllerAdvice
public class SellExceptionHandler {

    // 拦截登录异常
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("sell");
    }
}
