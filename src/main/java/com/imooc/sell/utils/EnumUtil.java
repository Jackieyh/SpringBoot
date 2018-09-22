package com.imooc.sell.utils;

import com.imooc.sell.enums.CodeEnum;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-22 16:09:18
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each : enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
