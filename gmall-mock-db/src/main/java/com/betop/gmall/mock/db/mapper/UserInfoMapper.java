package com.betop.gmall.mock.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.betop.gmall.mock.db.bean.UserInfo;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author zc
 * @since 2020-02-23
 */
public interface UserInfoMapper extends BaseMapper<UserInfo> {

    @Update("truncate table user_info")
    public  void truncateUserInfo();

}
