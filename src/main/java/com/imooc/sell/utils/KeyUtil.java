package com.imooc.sell.utils;

import java.util.UUID;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-20 15:08:50
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * @return
     */
    public static String getUniqueKey() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
