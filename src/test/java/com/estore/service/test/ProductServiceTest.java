package com.estore.service.test;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.estore.common.ServerResponse;
import com.estore.service.IProductService;
import com.estore.test.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by weimin
 */
public class ProductServiceTest extends TestBase {

    @Autowired
    private IProductService iProductService;

    @Test
    public void testIProductService(){
        ServerResponse<PageInfo> result =  iProductService.getProductByKeywordCategory("iphone",2,1,5,"price_desc");
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<String> images = Lists.newArrayList();
        images.add("estore/aa.jpg");
        images.add("estore/bb.jpg");
        images.add("estore/cc.jpg");
        images.add("estore/dd.jpg");
        images.add("estore/ee.jpg");
//        ["estore/aa.jpg","estore/bb.jpg","estore/cc.jpg","estore/dd.jpg","estore/ee.jpg"]
    }
}
