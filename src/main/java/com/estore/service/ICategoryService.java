package com.estore.service;

import com.estore.common.ServerResponse;
import com.estore.bean.Category;

import java.util.List;

/**
 * @program: Hern-Estore
 * @description: ICategoryService
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-04-06 14:30
 **/
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
