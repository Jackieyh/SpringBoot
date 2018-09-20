package com.imooc.sell.repository;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void save() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId(UUID.randomUUID().toString().replace("-",""));
        orderDetail.setOrderId("77bbd9e902b34daaa49ca2dc39a5817b");
        orderDetail.setProductIcon("666");
        orderDetail.setProductId("2a1e3b35bff74b4fad7a3c4882564ce5");
        orderDetail.setProductName("ssh");
        orderDetail.setProductPrice(new BigDecimal(520));
        orderDetail.setProductQuantity(2);

        OrderDetail save = repository.save(orderDetail);
        assertNotNull(save);
        System.out.println(save);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> byOrderId = repository.findByOrderId("77bbd9e902b34daaa49ca2dc39a5817b");
        assertNotEquals(0,byOrderId.size());
        System.out.println(byOrderId);
    }
}