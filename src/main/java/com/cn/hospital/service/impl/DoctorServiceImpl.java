package com.cn.hospital.service.impl;

import com.cn.hospital.dao.DoctorDao;
import com.cn.hospital.pojo.Doctor;
import com.cn.hospital.service.DoctorService;
import com.cn.hospital.util.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
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

    @Override
    public PageUtils findDoctorByKeshi(HashMap<String,Object> params) {
        List<Doctor> doctorList=doctorDao.findDoctorByKeshi(params.get("keshi").toString());
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        PageInfo<Doctor> pageInfo=new PageInfo<>(doctorList);

        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());

    }

    @Override
    public PageUtils fuzzySearch(HashMap<String, Object> params) {
        List<Doctor> doctorList=doctorDao.fuzzySearch(params.get("shanchang").toString());
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageNumber").toString()));
        PageInfo<Doctor> pageInfo=new PageInfo<>(doctorList);

        return new PageUtils(pageInfo.getList(),new Long(pageInfo.getTotal()).intValue());
    }

    @Override
    public boolean addLiulancishu(int id) {
        boolean result=false;
        int i=doctorDao.addLiulancishu(id);
        if(i>0){
            result=true;
        }
        return result;
    }

    @Override
    public boolean calculatePingfen(int id,int score) {
        boolean result =false;
        Doctor doctor=doctorDao.findById(id);
        double avg1=(doctor.getYishengpingfen()*doctor.getPingfenrenshu()+score) /(doctor.getPingfenrenshu()+1);
        System.out.println(avg1);
        int i=doctorDao.updateScore(id,avg1);
        if(i>0){
            result=true;
        }
        return result;
    }
}
