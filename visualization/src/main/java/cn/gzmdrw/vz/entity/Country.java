package cn.gzmdrw.vz.entity;

import java.io.Serializable;
import java.util.List;

/*
*@Create by  WGuangZhi  1300847590@qq.com 2019/9/18 18:02
*@Version V1.0
*
*/
public class Country implements Serializable {
    private int id;
    private String country;
    private List<GDP> y_gdps;//以年开始读取数据
    private List<Year> c_years;//以国家开始读取数据

    public Country() {
    }

    public Country(int id, String country, List<GDP> y_gdps, List<Year> c_years) {
        this.id = id;
        this.country = country;
        this.y_gdps = y_gdps;
        this.c_years = c_years;
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

    public List<GDP> getY_gdps() {
        return y_gdps;
    }

    public void setY_gdps(List<GDP> y_gdps) {
        this.y_gdps = y_gdps;
    }

    public List<Year> getC_years() {
        return c_years;
    }

    public void setC_years(List<Year> c_years) {
        this.c_years = c_years;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", y_gdps=" + y_gdps +
                ", c_years=" + c_years +
                '}';
    }
}
