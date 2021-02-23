package com.cn.hospital.service.impl;



import com.cn.hospital.dao.UserDao;
import com.cn.hospital.pojo.User;
import com.cn.hospital.service.UserService;
import com.cn.hospital.util.JDK8DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public boolean regist(User user) {
        boolean result=false;
        user.setId(UUID.randomUUID().toString());
        LocalDateTime now = LocalDateTime.now();//创建本地时间对象
        String localDateTimeString = JDK8DateUtil.LocalDateTime2String(now, "yyyy-MM-dd HH:mm:ss");
        user.setCreateTime(localDateTimeString);
        user.setIsdelete(1);
        System.out.println(user);
        int i = userDao.regist(user);
        if(i>0){
            result=true;
        }
        return result;
    }

    @Override
    public User login(User user) {
        User user1 = userDao.findUser(user);
        return user1;
    }

}
