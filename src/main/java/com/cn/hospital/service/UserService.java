package com.cn.hospital.service;


import com.cn.hospital.pojo.User;

public interface UserService {

    /**
     * 注册
     * @param user
     * @return
     */
    public boolean regist(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    public User login(User user);

}
