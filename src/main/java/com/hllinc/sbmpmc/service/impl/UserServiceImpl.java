package com.hllinc.sbmpmc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hllinc.sbmpmc.mapper.UserMapper;
import com.hllinc.sbmpmc.model.UserDomain;
import com.hllinc.sbmpmc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author hongliang5
 * @Date 2018/10/12 上午10:36
 **/
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int addUser(UserDomain userDomain) {
        return userMapper.insertByUser(userDomain);
    }

    @Override
    public int deleteUserById(int userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int updateUser(UserDomain userDomain) {
        return userMapper.updateUser(userDomain);
    }

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<UserDomain> selectUsersByPageAndCondition(int pageNum, int pageSize, String condition) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomain> userDomains = userMapper.selectUsers(condition);
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

    @Override
    public UserDomain findUserById(int userId) {
        return userMapper.findUserById(userId);
    }
}
