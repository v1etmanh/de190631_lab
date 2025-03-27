package com.jmc.week5.fruitmanagement.model;

public class Customer {
    private static int cus_id=0;
    private int cusId;
    private String name;
    private double total;
    public Customer( String name) {
        this.cusId = cus_id++;
        this.name = name;
        total=0.0;
    }
    public Customer( String name,double x) {
        this.cusId = cus_id++;
        this.name = name;
        total=x;
    }
    public Customer( int id,String name,double x) {
        this.cusId = id;
        this.name = name;
        total=0.0;
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", name='" + name + '\'' +
                "total="+total+
                '}';
    }
}
