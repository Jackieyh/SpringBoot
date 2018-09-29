package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-19 16:05:04
 */
@Data
public class ProductInfoVO implements Serializable {
    private static final long serialVersionUID = 1192721805912686397L;
    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
