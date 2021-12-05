package com.betop.gmall.mock.db.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.betop.gmall.mock.db.bean.ActivitySku;
import com.betop.gmall.mock.db.mapper.ActivitySkuMapper;
import com.betop.gmall.mock.db.service.ActivitySkuService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 活动参与商品 服务实现类
 * </p>
 *
 * @author zhangchen
 * @since 2020-02-25
 */
@Service
public class ActivitySkuServiceImpl extends ServiceImpl<ActivitySkuMapper, ActivitySku> implements ActivitySkuService {

}
