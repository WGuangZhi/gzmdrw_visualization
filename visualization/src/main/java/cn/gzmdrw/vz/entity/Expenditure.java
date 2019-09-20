package cn.gzmdrw.vz.entity;

import java.io.Serializable;

public class Expenditure implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int yearId;
    private float national_expenditure;
    private float central_expenditure;
    private float local_expenditure;
    private float central_expenditure_proportion;
    private float local_expenditure_proportion;

    public Expenditure() {
        super();
    }

    public Expenditure(int id, int yearId, float national_expenditure, float central_expenditure,
                       float local_expenditure, float central_expenditure_proportion, float local_expenditure_proportion) {
        super();
        this.id = id;
        this.yearId = yearId;
        this.national_expenditure = national_expenditure;
        this.central_expenditure = central_expenditure;
        this.local_expenditure = local_expenditure;
        this.central_expenditure_proportion = central_expenditure_proportion;
        this.local_expenditure_proportion = local_expenditure_proportion;
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

    public float getNational_expenditure() {
        return national_expenditure;
    }

    public void setNational_expenditure(float national_expenditure) {
        this.national_expenditure = national_expenditure;
    }

    public float getCentral_expenditure() {
        return central_expenditure;
    }

    public void setCentral_expenditure(float central_expenditure) {
        this.central_expenditure = central_expenditure;
    }

    public float getLocal_expenditure() {
        return local_expenditure;
    }

    public void setLocal_expenditure(float local_expenditure) {
        this.local_expenditure = local_expenditure;
    }

    public float getCentral_expenditure_proportion() {
        return central_expenditure_proportion;
    }

    public void setCentral_expenditure_proportion(float central_expenditure_proportion) {
        this.central_expenditure_proportion = central_expenditure_proportion;
    }

    public float getLocal_expenditure_proportion() {
        return local_expenditure_proportion;
    }

    public void setLocal_expenditure_proportion(float local_expenditure_proportion) {
        this.local_expenditure_proportion = local_expenditure_proportion;
    }

    @Override
    public String toString() {
        return "Expenditure [id=" + id + ", yearId=" + yearId + ", national_expenditure=" + national_expenditure
                + ", central_expenditure=" + central_expenditure + ", local_expenditure=" + local_expenditure
                + ", central_expenditure_proportion=" + central_expenditure_proportion
                + ", local_expenditure_proportion=" + local_expenditure_proportion + "]";
    }

}
