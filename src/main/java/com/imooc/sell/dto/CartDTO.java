package com.imooc.sell.dto;

import lombok.Data;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-20 15:20:29
 */
@Data
public class CartDTO {
    /**
     * 商品主键ID
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
