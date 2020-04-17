package com.estore.service;

import com.github.pagehelper.PageInfo;
import com.estore.common.ServerResponse;
import com.estore.bean.Shipping;

/**
 * @program: Hern-Estore
 * @description: IShippingService
 * @author: 宋兆恒-2336909208@q.com
 * @create: 2020-04-06 09:29
 **/
public interface IShippingService {

    ServerResponse add(Integer userId, Shipping shipping);

    ServerResponse<String> del(Integer userId, Integer shippingId);

    ServerResponse update(Integer userId, Shipping shipping);

    ServerResponse<Shipping> select(Integer userId, Integer shippingId);
    ServerResponse<PageInfo> list(Integer userId, int pageNum, int pageSize);

}
