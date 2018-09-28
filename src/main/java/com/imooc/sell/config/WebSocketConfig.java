package com.imooc.sell.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-28 17:08:11
 */
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {

        return new ServerEndpointExporter();
    }
}
