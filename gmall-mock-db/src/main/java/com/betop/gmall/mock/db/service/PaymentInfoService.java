package com.betop.gmall.mock.db.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.betop.gmall.mock.db.bean.PaymentInfo;

/**
 * <p>
 * 支付流水表 服务类
 * </p>
 *
 * @author zc
 * @since 2020-02-24
 */
public interface PaymentInfoService extends IService<PaymentInfo> {
    public void  genPayments(Boolean ifClear);
}
