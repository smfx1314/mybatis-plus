package com.jiangfeixiang.mybatisplus.service.impl;

import com.jiangfeixiang.mybatisplus.entity.User;
import com.jiangfeixiang.mybatisplus.entity.UserAndPasswordModel;
import com.jiangfeixiang.mybatisplus.mapper.PasswordMapper;
import com.jiangfeixiang.mybatisplus.mapper.UserMapper;
import com.jiangfeixiang.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: mybatis-plus
 * @Package: com.jiangfeixiang.mybatisplus.service.impl
 * @ClassName: UserServiceImpl
 * @Author: jiangfeixiang
 * @email: 1016767658@qq.com
 * @Description: 用户实现类
 * @Date: 2019/6/2/0002 13:06
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordMapper passwordMapper;

    /**
     * 分表匹配整合数据，分页
     * @return
     */
    @Override
    public List<UserAndPasswordModel> page(){
        List<UserAndPasswordModel> list = new ArrayList<>();
        List<User> users = userMapper.selectList(null);
        for (User user: users) {
            UserAndPasswordModel userAndPasswordModel = new UserAndPasswordModel();
            userAndPasswordModel.setId(user.getId());
            userAndPasswordModel.setName(user.getName());
            userAndPasswordModel.setPassword(passwordMapper.getByUserId(user.getId()).getPassword());
            list.add(userAndPasswordModel);
        }
        return list;
    }

}
