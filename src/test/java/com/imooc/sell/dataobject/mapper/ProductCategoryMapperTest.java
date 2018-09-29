package com.imooc.sell.dataobject.mapper;

import com.imooc.sell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void insertByMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("category_name", "杨可爱");
        map.put("category_type", "520");
        int result = mapper.insertByMap(map);
        Assert.assertEquals(1, result);
    }

    @Test
    public void insertByObject() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("爱心");
        productCategory.setCategoryType(520);
        int result = mapper.insertByObject(productCategory);
        Assert.assertEquals(1, result);
    }

    @Test
    public void findByCategoryTypeTest() {
        ProductCategory productCategory = mapper.findByCategoryType(520);
        Assert.assertEquals(productCategory.getCategoryName(), "爱鑫鑫");
    }

    @Test
    public void findByCategoryNameTest() {
        List<ProductCategory> productCategoryList = mapper.findByCategoryName("爱心");
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    @Transactional
    public void updateByCategoryTypeTest() {
        int result = mapper.updateByCategoryType("小小爱心", 520);
        Assert.assertEquals(1, result);
    }

    @Test
    public void updateByObjectTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("爱鑫鑫");
        productCategory.setCategoryType(520);
        int result = mapper.updateByObject(productCategory);
        Assert.assertEquals(1, result);
    }

    @Test
    public void deleteBycategoryTypeTest() {
        int result = mapper.deleteBycategoryType(666);
        Assert.assertEquals(1, result);
    }

    @Test
    public void selectByCategoryTypeTest() {
        ProductCategory productCategory = mapper.selectByCategoryType(520);
        Assert.assertNotNull(productCategory);
    }

}