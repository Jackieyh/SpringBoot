package com.imooc.sell.repository;

import com.imooc.sell.dataobject.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoRepository repository;

    @Test
    public void save() {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setOpenid("123456");
        sellerInfo.setUsername("Jackie");
        sellerInfo.setSellerId("123456");
        sellerInfo.setPassword("666666");
        SellerInfo save = repository.save(sellerInfo);
        Assert.assertNotNull(save);
    }

    @Test
    public void findByOpenid() {
        SellerInfo sellerInfo = repository.findByOpenid("123456");
        Assert.assertEquals("Jackie", sellerInfo.getUsername());
    }
}