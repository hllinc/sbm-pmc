package com.hllinc.sbmpmc.model;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

/**
 * @Author hongliang5
 * @Date 2018/10/12 下午5:48
 **/
@Data
@Table(name = "t_resource")
public class Resource {
    @Column(name = "id", type = MySqlTypeConstant.INT, length = 11, isKey = true, isAutoIncrement = true)
    private Integer id; // 资源id
    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, length = 20)
    private String name; // 资源名称
    @Column(name = "info", type = MySqlTypeConstant.VARCHAR, length = 50)
    private String info; // 资源描述
    @Column(name = "pid", type = MySqlTypeConstant.INT, length = 11)
    private Integer pid; // 父id
    @Column(name = "type", type = MySqlTypeConstant.INT, length = 2)
    private Integer type; // 类型
}
