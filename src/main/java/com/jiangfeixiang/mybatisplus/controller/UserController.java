package com.jiangfeixiang.mybatisplus.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiangfeixiang.mybatisplus.common.CommonReturnType;
import com.jiangfeixiang.mybatisplus.entity.User;
import com.jiangfeixiang.mybatisplus.entity.UserAndPasswordModel;
import com.jiangfeixiang.mybatisplus.mapper.PasswordMapper;
import com.jiangfeixiang.mybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: mybatis-plus
 * @Package: com.jiangfeixiang.mybatisplus.controller
 * @ClassName: UserController
 * @Author: jiangfeixiang
 * @email: 1016767658@qq.com
 * @Description: controller
 * @Date: 2019/5/10/0010 21:22
 */
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordMapper passwordMapper;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public CommonReturnType getAllUser(@RequestParam(value = "pageSize",defaultValue = "3") Integer pageSize){
        PageHelper.startPage(1 ,pageSize);
        List<UserAndPasswordModel> list = new ArrayList<>();
        List<User> users = userMapper.selectList(null);
        for (User user: users) {
            UserAndPasswordModel userAndPasswordModel = new UserAndPasswordModel();
            userAndPasswordModel.setId(user.getId());
            userAndPasswordModel.setName(user.getName());
            userAndPasswordModel.setPassword(passwordMapper.getByUserId(user.getId()).getPassword());
            list.add(userAndPasswordModel);
        }
        PageInfo<UserAndPasswordModel> pageInfo = new PageInfo<>(list);
        System.out.println(pageInfo);
        return CommonReturnType.success(pageInfo);
    }
}
