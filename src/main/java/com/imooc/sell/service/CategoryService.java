package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;
import java.util.Optional;

/**
 * 接口类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-19 10:05:07
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
