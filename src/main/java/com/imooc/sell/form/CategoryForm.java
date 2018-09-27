package com.imooc.sell.form;

import lombok.Data;

import java.util.Date;

/**
 * 普通类
 *
 * @Author:Jackie
 * @Date:Created in 2018-09-27 15:50:10
 */
@Data
public class CategoryForm {
    private Integer categoryId;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
