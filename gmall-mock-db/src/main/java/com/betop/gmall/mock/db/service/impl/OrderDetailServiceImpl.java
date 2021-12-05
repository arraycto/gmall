package com.betop.gmall.mock.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.betop.gmall.mock.db.bean.OrderDetail;
import com.betop.gmall.mock.db.mapper.OrderDetailMapper;
import com.betop.gmall.mock.db.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单明细表 服务实现类
 * </p>
 *
 * @author zc
 * @since 2020-02-23
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}
