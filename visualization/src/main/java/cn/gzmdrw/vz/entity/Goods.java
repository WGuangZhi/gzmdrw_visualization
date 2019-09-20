package cn.gzmdrw.vz.entity;

import java.io.Serializable;

public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private int yearId;
    private float total_import_export_rmb;
    private float total_export_rmb;
    private float total_import_rmb;
    private float balance_import_export_rmb;
    private float total_import_export_us;
    private float total_export_us;
    private float total_import_us;
    private float balance_import_export_us;

    public Goods() {
        super();
    }

    public Goods(int id, int yearId, float total_import_export_rmb, float total_export_rmb, float total_import_rmb,
                 float balance_import_export_rmb, float total_import_export_us, float total_export_us, float total_import_us,
                 float balance_import_export_us) {
        super();
        this.id = id;
        this.yearId = yearId;
        this.total_import_export_rmb = total_import_export_rmb;
        this.total_export_rmb = total_export_rmb;
        this.total_import_rmb = total_import_rmb;
        this.balance_import_export_rmb = balance_import_export_rmb;
        this.total_import_export_us = total_import_export_us;
        this.total_export_us = total_export_us;
        this.total_import_us = total_import_us;
        this.balance_import_export_us = balance_import_export_us;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearId() {
        return yearId;
    }

    public void setYearId(int yearId) {
        this.yearId = yearId;
    }

    public float getTotal_import_export_rmb() {
        return total_import_export_rmb;
    }

    public void setTotal_import_export_rmb(float total_import_export_rmb) {
        this.total_import_export_rmb = total_import_export_rmb;
    }

    public float getTotal_export_rmb() {
        return total_export_rmb;
    }

    public void setTotal_export_rmb(float total_export_rmb) {
        this.total_export_rmb = total_export_rmb;
    }

    public float getTotal_import_rmb() {
        return total_import_rmb;
    }

    public void setTotal_import_rmb(float total_import_rmb) {
        this.total_import_rmb = total_import_rmb;
    }

    public float getBalance_import_export_rmb() {
        return balance_import_export_rmb;
    }

    public void setBalance_import_export_rmb(float balance_import_export_rmb) {
        this.balance_import_export_rmb = balance_import_export_rmb;
    }

    public float getTotal_import_export_us() {
        return total_import_export_us;
    }

    public void setTotal_import_export_us(float total_import_export_us) {
        this.total_import_export_us = total_import_export_us;
    }

    public float getTotal_export_us() {
        return total_export_us;
    }

    public void setTotal_export_us(float total_export_us) {
        this.total_export_us = total_export_us;
    }

    public float getTotal_import_us() {
        return total_import_us;
    }

    public void setTotal_import_us(float total_import_us) {
        this.total_import_us = total_import_us;
    }

    public float getBalance_import_export_us() {
        return balance_import_export_us;
    }

    public void setBalance_import_export_us(float balance_import_export_us) {
        this.balance_import_export_us = balance_import_export_us;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Goods [id=" + id + ", yearId=" + yearId + ", total_import_export_rmb=" + total_import_export_rmb
                + ", total_export_rmb=" + total_export_rmb + ", total_import_rmb=" + total_import_rmb
                + ", balance_import_export_rmb=" + balance_import_export_rmb + ", total_import_export_us="
                + total_import_export_us + ", total_export_us=" + total_export_us + ", total_import_us="
                + total_import_us + ", balance_import_export_us=" + balance_import_export_us + "]";
    }


}
