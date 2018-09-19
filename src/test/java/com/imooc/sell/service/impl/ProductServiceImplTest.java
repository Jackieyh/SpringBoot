package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("22f16fcaac86416b8029b4b114677399");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = productService.findUpAll();
        Assert.assertNotEquals(0, upAll.size());
    }

    @Test
    public void findAll() {
        PageRequest pageRequest = PageRequest.of(0, 2);
        Page<ProductInfo> all = productService.findAll(pageRequest);
        System.out.println(all.getTotalElements());
        assertNotEquals(0,all.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(UUID.randomUUID().toString().replace("-", ""));
        productInfo.setProductStock(100);
        productInfo.setProductPrice(new BigDecimal(20));
        productInfo.setProductStatus(ProductStatusEnum.up.getCode());
        productInfo.setProductName("ssh");
        productInfo.setProductIcon("make");
        productInfo.setProductDescription("ppp");
        productInfo.setCategoryType(1);
        ProductInfo productInfo1 = productService.save(productInfo);
        Assert.assertNotNull(productInfo1);
    }
}