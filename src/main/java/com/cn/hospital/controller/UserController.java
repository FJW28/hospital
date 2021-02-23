package com.cn.hospital.controller;



import com.cn.hospital.pojo.User;
import com.cn.hospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@CrossOrigin
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     * json格式字符串
     *
     * @param
     * @return
     */
    @RequestMapping("/regist")
    @ResponseBody
    public HashMap<String, Object> regist(@RequestBody User user) {
        System.out.println(user);
        HashMap<String, Object> result = new HashMap<>();
        boolean flag = userService.regist(user);
        if (flag) {
            result.put("mark", "1");
        } else {
            result.put("mark", "0");
        }
        return result;
    }


    /**
     * 登录
     *
     * @param user
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public User login(@RequestBody User user) {
        System.out.println(user);
        User login = userService.login(user);
        if(login==null){
            return new User();
        }else {
            return login;
        }

    }

}



