package com.cn.hospital.controller;

import com.cn.hospital.service.DoctorService;
import com.cn.hospital.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DoctorController {


    @Autowired
    private DoctorService doctorService;


    @RequestMapping("/findAllDoctor")
    @ResponseBody
    public PageUtils findAllDoctor(@RequestBody HashMap<String,Object> params){
        return doctorService.findAllDoctor(params);

    }

    /**
     * 根据科室查找医生
     * @param params
     * @return
     */
    @RequestMapping("/findDoctorByKeshi")
    @ResponseBody
    public PageUtils findDoctorByKeshi(@RequestBody HashMap<String,Object> params){
        return doctorService.findDoctorByKeshi(params);
    }

    /**
     * 模糊查询
     * @param params
     * @return
     */
    @RequestMapping("/fuzzySearch")
    @ResponseBody
    public PageUtils fuzzySearch(@RequestBody HashMap<String,Object> params){
        return doctorService.fuzzySearch(params);
    }


    /**
     * 增加浏览次数
     * @param id
     * @return
     */
    @RequestMapping("/addLiulancishu")
    @ResponseBody
    public void addLiulancishu(int id){
        boolean result=doctorService.addLiulancishu(id);
        System.out.println(result);
    }

    /**
     * 计算评分
     * @param id
     * @return
     */
    @RequestMapping("/calculatePingfen")
    @ResponseBody
    public HashMap<String,Object> calculatePingfen(int id,int score){
        System.out.println(id);
        System.out.println(score);
        boolean flag=doctorService.calculatePingfen(id,score);
        HashMap<String,Object> result=new HashMap<>();
        if(flag){
            result.put("mark","1");
        }else {
            result.put("mark","0");
        }
       return result;
    }



}
