package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * 接口类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-22 09:00:03
 */
public interface PayService {
    void create(OrderDTO orderDTO);
}
