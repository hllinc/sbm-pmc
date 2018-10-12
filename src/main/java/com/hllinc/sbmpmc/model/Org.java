package com.hllinc.sbmpmc.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

/**
 * @Author hongliang5
 * @Date 2018/10/12 下午5:53
 **/
@Data
@Table(name = "t_org")
public class Org {
    @Column(name = "id", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
    private Integer id;
    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 20)
    private String name;
    @Column(name = "type", type = MySqlTypeConstant.INT, length = 2)
    private Integer type;
    @Column(name = "pid", type = MySqlTypeConstant.INT, length = 11)
    private Integer pid;
    @Column(name = "info", type = MySqlTypeConstant.VARCHAR, length = 50)
    private String info;
}
