package com.imooc.sell.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYER_OPENID = "1477127220";

    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("Jackie");
        orderDTO.setBuyerAddress("WIT");
        orderDTO.setBuyerPhone("18086438820");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        // 购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail orderDetail1 = new OrderDetail();
        orderDetail1.setProductId("22f16fcaac86416b8029b4b114677399");
        orderDetail1.setProductQuantity(520);

        OrderDetail orderDetail2 = new OrderDetail();
        orderDetail2.setProductId("uyutyuyt");
        orderDetail2.setProductQuantity(100);

        orderDetailList.add(orderDetail1);
        orderDetailList.add(orderDetail2);

        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO dto = orderService.create(orderDTO);
        assertNotNull(dto);

    }

    @Test
    public void findOne() {
        OrderDTO orderDTO = orderService.findOne("c141fbc9cb3f4d2e9ef3b816d43f0c9b");
        assertNotNull(orderDTO);
        System.out.println(orderDTO);

    }

    @Test
    public void findList() {
        PageRequest pageRequest = PageRequest.of(0, 10);
        Page<OrderDTO> list = orderService.findList(BUYER_OPENID, pageRequest);

        assertNotNull(list);
        System.out.println(list.getContent());

    }

    @Test
    public void cancel() {
        OrderDTO orderDTO = orderService.findOne("c141fbc9cb3f4d2e9ef3b816d43f0c9b");
        OrderDTO orderDTO1 = orderService.cancel(orderDTO);
        assertNotNull(orderDTO1);
    }

    @Test
    public void finish() {
        OrderDTO orderDTO = orderService.findOne("c141fbc9cb3f4d2e9ef3b816d43f0c9b");
        OrderDTO orderDTO1 = orderService.finish(orderDTO);
        assertEquals(OrderStatusEnum.FINISHED.getCode(),orderDTO1.getOrderStatus());
    }

    @Test
    public void paid() {
        OrderDTO orderDTO = orderService.findOne("c141fbc9cb3f4d2e9ef3b816d43f0c9b");
        OrderDTO orderDTO1 = orderService.paid(orderDTO);
        assertEquals(new Integer(PayStatusEnum.SUCCESS.getCode()),orderDTO1.getPayStatus());
    }
}