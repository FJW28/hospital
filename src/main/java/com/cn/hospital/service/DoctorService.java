package com.cn.hospital.service;

import com.cn.hospital.util.PageUtils;

import java.util.HashMap;

public interface DoctorService {
    /**
     * 查找所有医生
     * @return
     */
   public  PageUtils findAllDoctor(HashMap<String,Object> params);

}
