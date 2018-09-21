package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/**
 * 接口类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-21 14:38:03
 */
public interface BuyerService {
    // 查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    // 取消一个订单
    OrderDTO cancelOrder(String openid, String orderId);
}
