package com.betop.gmall.mock.db.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.betop.gmall.mock.db.bean.CartInfo;

/**
 * <p>
 * 购物车表 用户登录系统时更新冗余 服务类
 * </p>
 *
 * @author zc
 * @since 2020-02-24
 */
public interface CartInfoService extends IService<CartInfo> {

    public void  genCartInfo(boolean ifClear);

}
