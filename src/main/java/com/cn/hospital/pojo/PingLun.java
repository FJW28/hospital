package com.cn.hospital.pojo;

public class PingLun {

    private int id;
    private int yishengID;
    private String pinglunneirong;
    private String pinglunren;
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYishengID() {
        return yishengID;
    }

    public void setYishengID(int yishengID) {
        this.yishengID = yishengID;
    }

    public String getPinglunneirong() {
        return pinglunneirong;
    }

    public void setPinglunneirong(String pinglunneirong) {
        this.pinglunneirong = pinglunneirong;
    }

    public String getPinglunren() {
        return pinglunren;
    }

    public void setPinglunren(String pinglunren) {
        this.pinglunren = pinglunren;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "PingLun{" +
                "id=" + id +
                ", yishengID=" + yishengID +
                ", pinglunneirong='" + pinglunneirong + '\'' +
                ", pinglunren='" + pinglunren + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
