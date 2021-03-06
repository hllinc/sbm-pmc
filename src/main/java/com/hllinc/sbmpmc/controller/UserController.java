package com.hllinc.sbmpmc.controller;

import com.hllinc.sbmpmc.model.UserDomain;
import com.hllinc.sbmpmc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author hongliang5
 * @Date 2018/10/12 上午10:40
 **/
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/add")
    public int addUser(UserDomain user) {
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) {
        String condition = "";
        return userService.selectUsersByPageAndCondition(pageNum, pageSize, condition);
    }
}
