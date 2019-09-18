package cn.gzmdrw.vz.entity;

import java.io.Serializable;
import java.util.List;

/*
*@Create by  WGuangZhi  1300847590@qq.com 2019/9/18 18:02
*@Version V1.0
*
*/
public class Year implements Serializable {
    private int id;
    private int year;
    private List<Country> y_countries;//以年开始读取数据
    private List<GDP> c_gdps;//以年开始读取数据
    public Year() {
    }

    public Year(int id, int year, List<Country> y_countries, List<GDP> c_gdps) {
        this.id = id;
        this.year = year;
        this.y_countries = y_countries;
        this.c_gdps = c_gdps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Country> getY_countries() {
        return y_countries;
    }

    public void setY_countries(List<Country> y_countries) {
        this.y_countries = y_countries;
    }

    public List<GDP> getC_gdps() {
        return c_gdps;
    }

    public void setC_gdps(List<GDP> c_gdps) {
        this.c_gdps = c_gdps;
    }

    @Override
    public String toString() {
        return "Year{" +
                "id=" + id +
                ", year=" + year +
                ", y_countries=" + y_countries +
                ", c_gdps=" + c_gdps +
                '}';
    }
}
