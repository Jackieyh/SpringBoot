package com.imooc.sell.form;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-27 11:34:58
 */
@Data
public class ProductForm {
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer categoryType;
}
