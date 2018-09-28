package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * 接口类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-28 15:46:16
 */
public interface PushMessage {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
