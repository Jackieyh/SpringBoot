package com.imooc.sell.dataobject.dao;

import com.imooc.sell.dataobject.mapper.ProductCategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-29 10:42:58
 */
public class ProductCategoryDao {

    @Autowired
    private ProductCategoryMapper mapper;

    public int insertByMap(Map<String, Object> map) {
        return mapper.insertByMap(map);
    }
}
