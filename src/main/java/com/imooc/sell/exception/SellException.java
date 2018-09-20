package com.imooc.sell.exception;

import com.imooc.sell.enums.ResultEnum;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-20 14:50:38
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
