package com.practice.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.practice.gulimall.product.entity.BrandEntity;
import com.practice.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        新建
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");
//        更新
//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("华为垃圾");
//        brandService.updateById(brandEntity);
//        查询
        List<BrandEntity> list  = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1L));
        list.forEach((listItem) -> {
            System.out.println(listItem);
        });
    }

}
