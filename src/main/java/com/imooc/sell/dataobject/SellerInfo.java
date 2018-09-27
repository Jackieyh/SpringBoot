package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-27 16:30:01
 */
@Entity
@Data
public class SellerInfo {
    @Id
    private String sellId;

    private String username;

    private String password;

    private String openid;

}
