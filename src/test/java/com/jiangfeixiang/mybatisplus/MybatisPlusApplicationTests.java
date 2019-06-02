package com.jiangfeixiang.mybatisplus;

import com.jiangfeixiang.mybatisplus.controller.UserController;
import com.jiangfeixiang.mybatisplus.entity.Password;
import com.jiangfeixiang.mybatisplus.entity.User;
import com.jiangfeixiang.mybatisplus.entity.UserAndPasswordModel;
import com.jiangfeixiang.mybatisplus.mapper.PasswordMapper;
import com.jiangfeixiang.mybatisplus.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordMapper passwordMapper;


    @Autowired
    private UserController userController;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelect2() {
        System.out.println(("----- selectAll method test ------"));
        List<Password> passwords = passwordMapper.selectList(null);
        passwords.forEach(System.out::println);
    }


   /* @Test
    public void testSelect4() {
        System.out.println(("----- selectAll method test ------"));
        List<UserAndPasswordModel> list = userController.getAllUser();
        for (UserAndPasswordModel userAndPasswordModel:list ) {
            System.out.println(userAndPasswordModel);
        }
    }*/
}
