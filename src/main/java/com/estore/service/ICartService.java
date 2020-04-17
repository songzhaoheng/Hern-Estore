package com.estore.service;

import com.estore.common.ServerResponse;
import com.estore.vo.CartVo;

/**
 * @program: Hern-Estore
 * @description: ICartService
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-04-06 14:43
 **/
public interface ICartService {

    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

    ServerResponse<CartVo> update(Integer userId, Integer productId, Integer count);

    ServerResponse<CartVo> deleteProduct(Integer userId, String productIds);

    ServerResponse<CartVo> list(Integer userId);

    ServerResponse<CartVo> selectOrUnSelect(Integer userId, Integer productId, Integer checked);

    ServerResponse<Integer> getCartProductCount(Integer userId);

}
