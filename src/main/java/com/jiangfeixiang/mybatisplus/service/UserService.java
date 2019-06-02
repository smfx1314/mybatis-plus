package com.jiangfeixiang.mybatisplus.service;

import com.jiangfeixiang.mybatisplus.entity.User;
import com.jiangfeixiang.mybatisplus.entity.UserAndPasswordModel;
import com.jiangfeixiang.mybatisplus.mapper.PasswordMapper;
import com.jiangfeixiang.mybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: mybatis-plus
 * @Package: com.jiangfeixiang.mybatisplus.service
 * @ClassName: UserService
 * @Author: jiangfeixiang
 * @email: 1016767658@qq.com
 * @Description: 用户接口
 * @Date: 2019/6/2/0002 13:04
 */
public interface UserService {
    /**
     * 分页
     * @return
     */
   List<UserAndPasswordModel> page();
}
