package com.hllinc.sbmpmc.model;

import lombok.Data;
/**
 * @Author hongliang5
 * @Date 2018/10/12 上午10:21
 **/
@Data
public class UserDomain {
    private Integer userId;
    private String userName;
    private String password;
    private String phone;
}
