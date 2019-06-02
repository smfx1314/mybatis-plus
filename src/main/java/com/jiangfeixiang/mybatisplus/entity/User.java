package com.jiangfeixiang.mybatisplus.entity;

import lombok.Data;

/**
 * @ProjectName: mybatis-plus
 * @Package: com.jiangfeixiang.mybatisplus.entity
 * @ClassName: User
 * @Author: jiangfeixiang
 * @email: 1016767658@qq.com
 * @Description: 用户实体类
 * @Date: 2019/5/10/0010 21:21
 */
@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
