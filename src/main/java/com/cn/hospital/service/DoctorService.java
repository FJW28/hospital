package com.cn.hospital.service;

import com.cn.hospital.pojo.PingLun;
import com.cn.hospital.util.PageUtils;

import java.util.HashMap;

public interface DoctorService {
    /**
     * 查找所有医生
     * @return
     */
   public  PageUtils findAllDoctor(HashMap<String,Object> params);

    /**
     * 根据科室查找医生
     * @param params
     * @return
     */
   public  PageUtils findDoctorByKeshi(HashMap<String,Object> params);

    /**
     * 模糊查询
     * @param params
     * @return
     */
    public PageUtils fuzzySearch(HashMap<String, Object> params);

    /**
     *增加浏览次数
     * @param id
     * @return
     */
    public boolean addLiulancishu(int id);

    /**
     * 计算评分
     * @param id
     * @return
     */
   public  boolean calculatePingfen(int id,int score);


    /**
     * 评价医生
     * @param pingLun
     * @return
     */
    public boolean CommentDoctor(PingLun pingLun);
}
