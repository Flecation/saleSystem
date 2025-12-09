package project.models;

import java.sql.Timestamp;

public class sale {
    private int saleId,userId;
    private double saleTotal;
    private Timestamp saleDate;

    public sale(){}

    public sale(int saleId, int userId, double saleTotal, Timestamp saleDate) {
        this.saleId = saleId;
        this.userId = userId;
        this.saleTotal = saleTotal;
        this.saleDate = saleDate;
    }

    public sale(int userId, double saleTotal, Timestamp saleDate) {
        this.userId = userId;
        this.saleTotal = saleTotal;
        this.saleDate = saleDate;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(double saleTotal) {
        this.saleTotal = saleTotal;
    }

    public Timestamp getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Timestamp saleDate) {
        this.saleDate = saleDate;
    }
}
