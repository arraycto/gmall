package com.betop.gmall.mock.db.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.betop.gmall.mock.db.bean.OrderRefundInfo;

/**
 * <p>
 * 退单表 服务类
 * </p>
 *
 * @author zhangchen
 * @since 2020-02-25
 */
public interface OrderRefundInfoService extends IService<OrderRefundInfo> {

    public void  genRefundsOrFinish(Boolean ifClear);
}
