package com.betop.gmall.mock.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.betop.gmall.mock.db.bean.CouponInfo;
import com.betop.gmall.mock.db.mapper.CouponInfoMapper;
import com.betop.gmall.mock.db.service.CouponInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 优惠券表 服务实现类
 * </p>
 *
 * @author zhangchen
 * @since 2020-02-26
 */
@Service
public class CouponInfoServiceImpl extends ServiceImpl<CouponInfoMapper, CouponInfo> implements CouponInfoService {

}
