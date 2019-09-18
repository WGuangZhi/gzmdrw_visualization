package cn.gzmdrw.vz.entity;

import java.io.Serializable;
/*
*@Create by  WGuangZhi  1300847590@qq.com 2019/9/18 18:02
*@Version V1.0
*
*/
public class Country implements Serializable {
    private int id;
    private String country;

    public Country() {
    }

    public Country(int id, String country) {
        this.id = id;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country='" + country + '\'' +
                '}';
    }
}
