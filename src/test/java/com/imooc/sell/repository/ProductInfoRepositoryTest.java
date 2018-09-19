package com.imooc.sell.repository;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.imooc.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.security.Signature;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findByProductStatus() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(UUID.randomUUID().toString().replace("-", ""));
        productInfo.setCategoryType(1);
        productInfo.setProductDescription("love connie");
        productInfo.setProductIcon("www.google.com");
        productInfo.setProductName("Connie");
        productInfo.setProductPrice(new BigDecimal(520.00));
        productInfo.setProductStatus(0);
        productInfo.setProductStock(1314);
        ProductInfo productInfo1 = repository.save(productInfo);
        Assert.assertNotNull(productInfo1);
        System.out.println(productInfo1);
    }

    @Test
    public void findByProductStatusTest(){
        List<ProductInfo> list = repository.findByProductStatus(0);
        Assert.assertNotEquals(0,list.size());
    }
}