package com.imooc.sell.VO;

import lombok.Data;

/**
 * http返回最外层对象
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-19 15:50:06
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
