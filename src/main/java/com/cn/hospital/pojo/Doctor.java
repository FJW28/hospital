package com.cn.hospital.pojo;

public class Doctor {
    private  int id;
    private String  xingming;
    private String jianjie;
    private String shanchang;
    private String keshi;
    private int liulancishu;
    private String zhiwu;
    private double yishengpingfen;
    private int pingfenrenshu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }

    public String getShanchang() {
        return shanchang;
    }

    public void setShanchang(String shanchang) {
        this.shanchang = shanchang;
    }

    public String getKeshi() {
        return keshi;
    }

    public void setKeshi(String keshi) {
        this.keshi = keshi;
    }

    public int getLiulancishu() {
        return liulancishu;
    }

    public void setLiulancishu(int liulancishu) {
        this.liulancishu = liulancishu;
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu;
    }

    public double getYishengpingfen() {
        return yishengpingfen;
    }

    public void setYishengpingfen(double yishengpingfen) {
        this.yishengpingfen = yishengpingfen;
    }

    public int getPingfenrenshu() {
        return pingfenrenshu;
    }

    public void setPingfenrenshu(int pingfenrenshu) {
        this.pingfenrenshu = pingfenrenshu;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", xingming='" + xingming + '\'' +
                ", jianjie='" + jianjie + '\'' +
                ", shanchang='" + shanchang + '\'' +
                ", keshi='" + keshi + '\'' +
                ", liulancishu=" + liulancishu +
                ", zhiwu='" + zhiwu + '\'' +
                ", yishengpingfen=" + yishengpingfen +
                ", pingfenrenshu=" + pingfenrenshu +
                '}';
    }
}
