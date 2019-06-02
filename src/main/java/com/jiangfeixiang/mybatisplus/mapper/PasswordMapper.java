package com.jiangfeixiang.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiangfeixiang.mybatisplus.entity.Password;
import com.jiangfeixiang.mybatisplus.entity.User;

/**
 * @ProjectName: mybatis-plus
 * @Package: com.jiangfeixiang.mybatisplus.service
 * @ClassName: UserMapper
 * @Author: jiangfeixiang
 * @email: 1016767658@qq.com
 * @Description: 接口
 * @Date: 2019/5/10/0010 21:22
 */
public interface PasswordMapper extends BaseMapper<Password> {
    /**
     * 根据user_id查询密码
     * @param userId
     * @return
     */
    Password getByUserId(Integer userId);
}
