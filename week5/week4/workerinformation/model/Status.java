package com.jmc.week4.workerinformation.model;

public class Status {
    private String id;
    private StatusSalary own_sta;

    public Status() {

    }

    public Status(String id, StatusSalary own_sta) {
        this.id = id;
        this.own_sta = own_sta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StatusSalary getOwn_sta() {
        return own_sta;
    }

    public void setOwn_sta(StatusSalary own_sta) {
        this.own_sta = own_sta;
    }
}
