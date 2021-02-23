package com.cn.hospital.service.impl;

import com.cn.hospital.dao.DoctorDao;
import com.cn.hospital.pojo.Doctor;
import com.cn.hospital.service.DoctorService;
import com.cn.hospital.util.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {


    @Autowired
    private DoctorDao doctorDao;

    @Override
    public PageUtils findAllDoctor(HashMap<String, Object> params) {
        List<Doctor> doctorList=doctorDao.findAllDoctor();
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        PageInfo<Doctor> pageInfo=new PageInfo<>(doctorList);

        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }
}
