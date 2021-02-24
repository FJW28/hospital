package com.cn.hospital.dao;

import com.cn.hospital.pojo.Doctor;
import com.cn.hospital.pojo.JiBing;
import com.cn.hospital.pojo.PingLun;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorDao {

    public List<Doctor> findAllDoctor();

    public List<Doctor> findDoctorByKeshi(String keshi);

    public List<Doctor> fuzzySearch(String shanchang);

    public int addLiulancishu(int id);

    public Doctor findById(int id);

    public int updateScore(@Param("id") int id, @Param("avg") double avg1);

    public int CommentDoctor(PingLun pingLun);

    public List<PingLun> findAllPingLun(int yishengID);

    List<JiBing> findIllness(List<String> illnessList);
}
