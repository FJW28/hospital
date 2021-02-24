package com.cn.hospital.pojo;

public class JiBing {

    private int id;
    private String mingcheng;
    private String jianjie;
    private String fabingbuwei;
    private String fabingrenqun;
    private String xiangguanzhengzhuang;
    private String bingfajibing;
    private String keshi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }

    public String getFabingbuwei() {
        return fabingbuwei;
    }

    public void setFabingbuwei(String fabingbuwei) {
        this.fabingbuwei = fabingbuwei;
    }

    public String getFabingrenqun() {
        return fabingrenqun;
    }

    public void setFabingrenqun(String fabingrenqun) {
        this.fabingrenqun = fabingrenqun;
    }

    public String getXiangguanzhengzhuang() {
        return xiangguanzhengzhuang;
    }

    public void setXiangguanzhengzhuang(String xiangguanzhengzhuang) {
        this.xiangguanzhengzhuang = xiangguanzhengzhuang;
    }

    public String getBingfajibing() {
        return bingfajibing;
    }

    public void setBingfajibing(String bingfajibing) {
        this.bingfajibing = bingfajibing;
    }

    public String getKeshi() {
        return keshi;
    }

    public void setKeshi(String keshi) {
        this.keshi = keshi;
    }

    @Override
    public String toString() {
        return "JiBing{" +
                "id=" + id +
                ", mingcheng='" + mingcheng + '\'' +
                ", jianjie='" + jianjie + '\'' +
                ", fabingbuwei='" + fabingbuwei + '\'' +
                ", fabingrenqun='" + fabingrenqun + '\'' +
                ", xiangguanzhengzhuang='" + xiangguanzhengzhuang + '\'' +
                ", bingfajibing='" + bingfajibing + '\'' +
                ", keshi='" + keshi + '\'' +
                '}';
    }
}
