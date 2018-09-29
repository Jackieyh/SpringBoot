package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品(包含类目)
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-19 16:00:40
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = 3355332619015620687L;
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
