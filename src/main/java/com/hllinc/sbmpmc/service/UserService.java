package com.hllinc.sbmpmc.service;

import com.github.pagehelper.PageInfo;
import com.hllinc.sbmpmc.model.UserDomain;

/**
 * @Author hongliang5
 * @Date 2018/10/12 上午10:35
 **/
public interface UserService {
    /**
     * 添加用户，自动生成的用户id存储在用户对象userId属性中
     *
     * @param userDomain
     * @return
     */
    int addUser(UserDomain userDomain);

    /**
     * 根据userId删除用户
     *
     * @param userId
     * @return
     */
    int deleteUserById(int userId);

    /**
     * 更新用户
     *
     * @param userDomain
     * @return
     */
    int updateUser(UserDomain userDomain);

    /**
     * 根据userId查询用户
     *
     * @param userId
     * @return
     */
    UserDomain findUserById(int userId);

    /**
     * 根据自定义条件分页查询用户列表
     *
     * @param pageNum
     * @param pageSize
     * @param condition
     * @return
     */
    PageInfo<UserDomain> selectUsersByPageAndCondition(int pageNum, int pageSize, String condition);
}
