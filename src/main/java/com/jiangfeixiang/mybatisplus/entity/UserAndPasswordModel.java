package com.jiangfeixiang.mybatisplus.entity;

import lombok.Data;

/**
 * @ProjectName: mybatis-plus
 * @Package: com.jiangfeixiang.mybatisplus.entity
 * @ClassName: UserAndPasswordModel
 * @Author: jiangfeixiang
 * @email: 1016767658@qq.com
 * @Description: 用户和密码整合
 * @Date: 2019/6/1/0001 13:11
 */
@Data
public class UserAndPasswordModel {
    private Integer id;
    private String name;
    private String password;
}
