package cn.gzmdrw.vz.entity;

import java.io.Serializable;
/*
*@Create by  WGuangZhi  1300847590@qq.com 2019/9/18 18:02
*@Version V1.0
*
*/
public class Year implements Serializable {
    private int id;
    private int year;

    public Year() {
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

    @Override
    public String toString() {
        return "Year{" +
                "id=" + id +
                ", year=" + year +
                '}';
    }
}
