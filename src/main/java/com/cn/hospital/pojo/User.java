package com.cn.hospital.pojo;

import java.io.Serializable;

public class User implements Serializable {

    private String id;    //用户id
    private String admin;     //用户手机号
    private String password;  //用户密码
    private String username;  //用户名
    private int isdelete;     //账号是否被删除，0否1是
    private String createTime;    //创建时间

    public User(String id, String admin, String password, String username, int isdelete, String createTime) {
        this.id = id;
        this.admin = admin;
        this.password = password;
        this.username = username;
        this.isdelete = isdelete;
        this.createTime = createTime;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", admin='" + admin + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", isdelete=" + isdelete +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
    