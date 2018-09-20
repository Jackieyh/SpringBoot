package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 接口类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-19 11:53:24
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询上架商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // 加库存
    void increaseStock(List<CartDTO> cartDTOList);

    // 减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
