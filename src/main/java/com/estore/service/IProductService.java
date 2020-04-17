package com.estore.service;

import com.github.pagehelper.PageInfo;
import com.estore.common.ServerResponse;
import com.estore.bean.Product;
import com.estore.vo.ProductDetailVo;

/**
 * @program: Hern-Estore
 * @description: IProductService
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-04-06 11:49
 **/
public interface IProductService {

    ServerResponse saveOrUpdateProduct(Product product);

    ServerResponse<String> setSaleStatus(Integer productId, Integer status);

    ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductList(int pageNum, int pageSize);

    ServerResponse<PageInfo> searchProduct(String productName, Integer productId, int pageNum, int pageSize);

    ServerResponse<ProductDetailVo> getProductDetail(Integer productId);

    ServerResponse<PageInfo> getProductByKeywordCategory(String keyword, Integer categoryId, int pageNum, int pageSize, String orderBy);

}
