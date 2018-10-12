package com.hllinc.sbmpmc.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

/**
 * 用户类
 *
 * @Author hongliang5
 * @Date 2018/10/12 上午10:21
 **/
@Data
@Table(name = "t_user")
public class UserDomain {
    @Column(name = "userId", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
    private Integer userId; // 用户id
    @Column(name = "userName", type = MySqlTypeConstant.VARCHAR, length = 20)
    private String userName; // 用户名
    @Column(name = "password", type = MySqlTypeConstant.VARCHAR, length = 50)
    private String password; // 密码
    @Column(name = "phone", type = MySqlTypeConstant.VARCHAR, length = 20)
    private String phone; // 手机号
}
