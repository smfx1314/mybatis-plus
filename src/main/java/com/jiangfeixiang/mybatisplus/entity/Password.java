package com.jiangfeixiang.mybatisplus.entity;

import lombok.Data;

/**
 * @ProjectName: mybatis-plus
 * @Package: com.jiangfeixiang.mybatisplus.entity
 * @ClassName: User
 * @Author: jiangfeixiang
 * @email: 1016767658@qq.com
 * @Description: 用户密码
 * @Date: 2019/5/10/0010 21:21
 */
@Data
public class Password {
    private Integer id;
    private String password;
    private Integer userId;
}
