package cn.gzmdrw.vz.entity;

import java.io.Serializable;

public class Import implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private int yearId;
    private float total_imports;
    private float imports_products;
    private float imports_foods;
    private float imports_beverages;
    private float imports_edible;
    private float imports_fuels;
    private float imports_animal;
    private float imports_goods;
    private float imports_chemicals;
    private float imports_textile;
    private float imports_machinery;
    private float imports_miscel;
    private float imports_commod;

    public Import() {
        super();
    }

    public Import(int id, int yearId, float total_imports, float imports_products, float imports_foods,
                  float imports_beverages, float imports_edible, float imports_fuels, float imports_animal,
                  float imports_goods, float imports_chemicals, float imports_textile, float imports_machinery,
                  float imports_miscel, float imports_commod) {
        super();
        this.id = id;
        this.yearId = yearId;
        this.total_imports = total_imports;
        this.imports_products = imports_products;
        this.imports_foods = imports_foods;
        this.imports_beverages = imports_beverages;
        this.imports_edible = imports_edible;
        this.imports_fuels = imports_fuels;
        this.imports_animal = imports_animal;
        this.imports_goods = imports_goods;
        this.imports_chemicals = imports_chemicals;
        this.imports_textile = imports_textile;
        this.imports_machinery = imports_machinery;
        this.imports_miscel = imports_miscel;
        this.imports_commod = imports_commod;
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

    public float getTotal_imports() {
        return total_imports;
    }

    public void setTotal_imports(float total_imports) {
        this.total_imports = total_imports;
    }

    public float getImports_products() {
        return imports_products;
    }

    public void setImports_products(float imports_products) {
        this.imports_products = imports_products;
    }

    public float getImports_foods() {
        return imports_foods;
    }

    public void setImports_foods(float imports_foods) {
        this.imports_foods = imports_foods;
    }

    public float getImports_beverages() {
        return imports_beverages;
    }

    public void setImports_beverages(float imports_beverages) {
        this.imports_beverages = imports_beverages;
    }

    public float getImports_edible() {
        return imports_edible;
    }

    public void setImports_edible(float imports_edible) {
        this.imports_edible = imports_edible;
    }

    public float getImports_fuels() {
        return imports_fuels;
    }

    public void setImports_fuels(float imports_fuels) {
        this.imports_fuels = imports_fuels;
    }

    public float getImports_animal() {
        return imports_animal;
    }

    public void setImports_animal(float imports_animal) {
        this.imports_animal = imports_animal;
    }

    public float getImports_goods() {
        return imports_goods;
    }

    public void setImports_goods(float imports_goods) {
        this.imports_goods = imports_goods;
    }

    public float getImports_chemicals() {
        return imports_chemicals;
    }

    public void setImports_chemicals(float imports_chemicals) {
        this.imports_chemicals = imports_chemicals;
    }

    public float getImports_textile() {
        return imports_textile;
    }

    public void setImports_textile(float imports_textile) {
        this.imports_textile = imports_textile;
    }

    public float getImports_machinery() {
        return imports_machinery;
    }

    public void setImports_machinery(float imports_machinery) {
        this.imports_machinery = imports_machinery;
    }

    public float getImports_miscel() {
        return imports_miscel;
    }

    public void setImports_miscel(float imports_miscel) {
        this.imports_miscel = imports_miscel;
    }

    public float getImports_commod() {
        return imports_commod;
    }

    public void setImports_commod(float imports_commod) {
        this.imports_commod = imports_commod;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Import [id=" + id + ", yearId=" + yearId + ", total_imports=" + total_imports + ", imports_products="
                + imports_products + ", imports_foods=" + imports_foods + ", imports_beverages=" + imports_beverages
                + ", imports_edible=" + imports_edible + ", imports_fuels=" + imports_fuels + ", imports_animal="
                + imports_animal + ", imports_goods=" + imports_goods + ", imports_chemicals=" + imports_chemicals
                + ", imports_textile=" + imports_textile + ", imports_machinery=" + imports_machinery
                + ", imports_miscel=" + imports_miscel + ", imports_commod=" + imports_commod + "]";
    }

}
