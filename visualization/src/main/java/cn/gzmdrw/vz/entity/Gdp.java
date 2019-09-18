package cn.gzmdrw.vz.entity;

import java.io.Serializable;
/*
*@Create by  WGuangZhi  1300847590@qq.com 2019/9/18 18:02
*@Version V1.0
*
*/
public class Gdp implements Serializable {
    private int id;
    private int countryId;
    private int yearId;
    private String yimeiyuan;
    private String meiyuan;

    public Gdp() {
    }

    public Gdp(int id, int countryId, int yearId, String yimeiyuan, String meiyuan) {
        this.id = id;
        this.countryId = countryId;
        this.yearId = yearId;
        this.yimeiyuan = yimeiyuan;
        this.meiyuan = meiyuan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    public String getYimeiyuan() {
        return yimeiyuan;
    }

    public void setYimeiyuan(String yimeiyuan) {
        this.yimeiyuan = yimeiyuan;
    }

    public String getMeiyuan() {
        return meiyuan;
    }

    public void setMeiyuan(String meiyuan) {
        this.meiyuan = meiyuan;
    }

    @Override
    public String toString() {
        return "Gdp{" +
                "id=" + id +
                ", countryId=" + countryId +
                ", yearId=" + yearId +
                ", yimeiyuan='" + yimeiyuan + '\'' +
                ", meiyuan='" + meiyuan + '\'' +
                '}';
    }
}
