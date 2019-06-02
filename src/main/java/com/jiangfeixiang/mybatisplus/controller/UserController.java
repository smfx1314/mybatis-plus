package com.jiangfeixiang.mybatisplus.controller;


import com.gitee.hengboy.mybatis.pageable.Page;
import com.gitee.hengboy.mybatis.pageable.request.PageableRequest;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiangfeixiang.mybatisplus.common.CommonReturnType;
import com.jiangfeixiang.mybatisplus.entity.User;
import com.jiangfeixiang.mybatisplus.entity.UserAndPasswordModel;
import com.jiangfeixiang.mybatisplus.mapper.PasswordMapper;
import com.jiangfeixiang.mybatisplus.mapper.UserMapper;
import com.jiangfeixiang.mybatisplus.service.UserService;
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
   private UserService userService;

    @RequestMapping("/getAllUser")
    @ResponseBody
    public CommonReturnType page(@RequestParam(value = "pageSize",defaultValue = "3") Integer pageSize){
        PageHelper.startPage(1,pageSize);
        List<UserAndPasswordModel> list = userService.page();
        PageInfo<UserAndPasswordModel> pageInfo = new PageInfo<>(list);
        return CommonReturnType.success(pageInfo);
    }

}
