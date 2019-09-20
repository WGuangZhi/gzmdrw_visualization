package cn.gzmdrw.vz.entity;

import java.io.Serializable;

public class Income implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private int yearId;
    private float national_income;
    private float central_income;
    private float local_income;
    private float central_income_proportion;
    private float local_income_proportion;

    public Income() {
        super();
    }

    public Income(int id, int yearId, float national_income, float central_income, float local_income,
                  float central_income_proportion, float local_income_proportion) {
        super();
        this.id = id;
        this.yearId = yearId;
        this.national_income = national_income;
        this.central_income = central_income;
        this.local_income = local_income;
        this.central_income_proportion = central_income_proportion;
        this.local_income_proportion = local_income_proportion;
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

    public float getNational_income() {
        return national_income;
    }

    public void setNational_income(float national_income) {
        this.national_income = national_income;
    }

    public float getCentral_income() {
        return central_income;
    }

    public void setCentral_income(float central_income) {
        this.central_income = central_income;
    }

    public float getLocal_income() {
        return local_income;
    }

    public void setLocal_income(float local_income) {
        this.local_income = local_income;
    }

    public float getCentral_income_proportion() {
        return central_income_proportion;
    }

    public void setCentral_income_proportion(float central_income_proportion) {
        this.central_income_proportion = central_income_proportion;
    }

    public float getLocal_income_proportion() {
        return local_income_proportion;
    }

    public void setLocal_income_proportion(float local_income_proportion) {
        this.local_income_proportion = local_income_proportion;
    }

    @Override
    public String toString() {
        return "Income [id=" + id + ", yearId=" + yearId + ", national_income=" + national_income + ", central_income="
                + central_income + ", local_income=" + local_income + ", central_income_proportion="
                + central_income_proportion + ", local_income_proportion=" + local_income_proportion + "]";
    }

}
