package com.imooc.sell.service;

import com.imooc.sell.dataobject.SellerInfo;

/**
 * 接口类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-27 16:54:43
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
