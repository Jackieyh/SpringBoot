package com.imooc.sell.service.impl;

import com.imooc.sell.dto.OrderDTO;
import com.imooc.sell.service.PushMessage;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-28 15:47:40
 */
@Service
@Slf4j
public class PushMessageImpl implements PushMessage {

    @Autowired
    private WxMpService wxMpService;

    @Override
    public void orderStatus(OrderDTO orderDTO) {
        WxMpTemplateMessage templateMessage = new WxMpTemplateMessage();
        templateMessage.setTemplateId("123456");
        templateMessage.setToUser("Jackie");
        //wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
    }
}
