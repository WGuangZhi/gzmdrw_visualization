package cn.gzmdrw.vz.entity;

import java.io.Serializable;

public class Export implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private int yearId;
    private float total_exports;
    private float exports_products;
    private float exports_foods;
    private float exports_beverages;
    private float exports_edible;
    private float exports_fuels;
    private float exports_animal;
    private float exports_goods;
    private float exports_chemicals;
    private float exports_textile;
    private float exports_machinery;
    private float exports_miscel;
    private float exports_commod;

    public Export() {
        super();
    }

    public Export(int id, int yearId, float total_exports, float exports_products, float exports_foods,
                  float exports_beverages, float exports_edible, float exports_fuels, float exports_animal,
                  float exports_goods, float exports_chemicals, float exports_textile, float exports_machinery,
                  float exports_miscel, float exports_commod) {
        super();
        this.id = id;
        this.yearId = yearId;
        this.total_exports = total_exports;
        this.exports_products = exports_products;
        this.exports_foods = exports_foods;
        this.exports_beverages = exports_beverages;
        this.exports_edible = exports_edible;
        this.exports_fuels = exports_fuels;
        this.exports_animal = exports_animal;
        this.exports_goods = exports_goods;
        this.exports_chemicals = exports_chemicals;
        this.exports_textile = exports_textile;
        this.exports_machinery = exports_machinery;
        this.exports_miscel = exports_miscel;
        this.exports_commod = exports_commod;
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

    public float getTotal_exports() {
        return total_exports;
    }

    public void setTotal_exports(float total_exports) {
        this.total_exports = total_exports;
    }

    public float getExports_products() {
        return exports_products;
    }

    public void setExports_products(float exports_products) {
        this.exports_products = exports_products;
    }

    public float getExports_foods() {
        return exports_foods;
    }

    public void setExports_foods(float exports_foods) {
        this.exports_foods = exports_foods;
    }

    public float getExports_beverages() {
        return exports_beverages;
    }

    public void setExports_beverages(float exports_beverages) {
        this.exports_beverages = exports_beverages;
    }

    public float getExports_edible() {
        return exports_edible;
    }

    public void setExports_edible(float exports_edible) {
        this.exports_edible = exports_edible;
    }

    public float getExports_fuels() {
        return exports_fuels;
    }

    public void setExports_fuels(float exports_fuels) {
        this.exports_fuels = exports_fuels;
    }

    public float getExports_animal() {
        return exports_animal;
    }

    public void setExports_animal(float exports_animal) {
        this.exports_animal = exports_animal;
    }

    public float getExports_goods() {
        return exports_goods;
    }

    public void setExports_goods(float exports_goods) {
        this.exports_goods = exports_goods;
    }

    public float getExports_chemicals() {
        return exports_chemicals;
    }

    public void setExports_chemicals(float exports_chemicals) {
        this.exports_chemicals = exports_chemicals;
    }

    public float getExports_textile() {
        return exports_textile;
    }

    public void setExports_textile(float exports_textile) {
        this.exports_textile = exports_textile;
    }

    public float getExports_machinery() {
        return exports_machinery;
    }

    public void setExports_machinery(float exports_machinery) {
        this.exports_machinery = exports_machinery;
    }

    public float getExports_miscel() {
        return exports_miscel;
    }

    public void setExports_miscel(float exports_miscel) {
        this.exports_miscel = exports_miscel;
    }

    public float getExports_commod() {
        return exports_commod;
    }

    public void setExports_commod(float exports_commod) {
        this.exports_commod = exports_commod;
    }

    @Override
    public String toString() {
        return "Export [id=" + id + ", yearId=" + yearId + ", total_exports=" + total_exports + ", exports_products="
                + exports_products + ", exports_foods=" + exports_foods + ", exports_beverages=" + exports_beverages
                + ", exports_edible=" + exports_edible + ", exports_fuels=" + exports_fuels + ", exports_animal="
                + exports_animal + ", exports_goods=" + exports_goods + ", exports_chemicals=" + exports_chemicals
                + ", exports_textile=" + exports_textile + ", exports_machinery=" + exports_machinery
                + ", exports_miscel=" + exports_miscel + ", exports_commod=" + exports_commod + "]";
    }

}
