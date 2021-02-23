package com.cn.hospital.dao;


import com.cn.hospital.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    /**
     * 注册
     * @param user
     * @return
     */
    public int regist(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    public User findUser(User user);
}
