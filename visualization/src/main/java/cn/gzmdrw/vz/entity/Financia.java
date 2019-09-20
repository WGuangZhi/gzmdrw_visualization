package cn.gzmdrw.vz.entity;

import java.io.Serializable;
import java.util.List;

public class Financia implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int yearId;
    private float f_income;
    private float f_expenditure;
    private float income_rate;
    private float expenditure_rate;
    private List<Year> f_years;

    public Financia() {
        super();
    }

    public Financia(int id, int yearId, float f_income, float f_expenditure, float income_rate, float expenditure_rate,
                    List<Year> f_years) {
        super();
        this.id = id;
        this.yearId = yearId;
        this.f_income = f_income;
        this.f_expenditure = f_expenditure;
        this.income_rate = income_rate;
        this.expenditure_rate = expenditure_rate;
        this.f_years = f_years;
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

    public float getF_income() {
        return f_income;
    }

    public void setF_income(float f_income) {
        this.f_income = f_income;
    }

    public float getF_expenditure() {
        return f_expenditure;
    }

    public void setF_expenditure(float f_expenditure) {
        this.f_expenditure = f_expenditure;
    }

    public float getIncome_rate() {
        return income_rate;
    }

    public void setIncome_rate(float income_rate) {
        this.income_rate = income_rate;
    }

    public float getExpenditure_rate() {
        return expenditure_rate;
    }

    public void setExpenditure_rate(float expenditure_rate) {
        this.expenditure_rate = expenditure_rate;
    }

    public List<Year> getF_years() {
        return f_years;
    }

    public void setF_years(List<Year> f_years) {
        this.f_years = f_years;
    }

    @Override
    public String toString() {
        return "Financia [id=" + id + ", yearId=" + yearId + ", f_income=" + f_income + ", f_expenditure="
                + f_expenditure + ", income_rate=" + income_rate + ", expenditure_rate=" + expenditure_rate + "]";
    }


}
