package com.hllinc.sbmpmc;

import com.github.pagehelper.PageInfo;
import com.hllinc.sbmpmc.model.UserDomain;
import com.hllinc.sbmpmc.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbmPmcApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }

    @Test
    @Transactional
    public void mapperTest() {
        UserDomain u = userService.findUserById(1000);
        Assert.assertEquals("hllinc", u.getUserName());
    }

    @Test
    public void addUser() {
        UserDomain userDomain = new UserDomain();
        userDomain.setPhone("18277771111");
        userDomain.setPassword("123");
        userDomain.setUserName("dateTranform");
        userDomain.setCreateDate(new Date());
        userService.addUser(userDomain);
        System.out.println(userDomain.getId());
    }

    @Test
    public void selectUser() {
        String condition = "where userId>=1000 order by userId asc";
        PageInfo<UserDomain> pageInfo = userService.selectUsersByPageAndCondition(0, 2, condition);
        System.out.println(pageInfo.getList().size());
    }

    @Test
    public void updateUser() {
        UserDomain userDomain = new UserDomain();
        userDomain.setPhone("18666666666");
        userDomain.setPassword("666666");
        userDomain.setUserName("hongliang");
        userDomain.setId(1);
        userService.updateUser(userDomain);
    }

}
