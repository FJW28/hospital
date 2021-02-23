package com.cn.hospital.controller;

import com.cn.hospital.service.DoctorService;
import com.cn.hospital.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class DoctorController {


    @Autowired
    private DoctorService doctorService;


    @RequestMapping("/findAllDoctor")
    @ResponseBody
    public PageUtils findAllDoctor(@RequestBody HashMap<String,Object> params){
        return doctorService.findAllDoctor(params);

    }

}
