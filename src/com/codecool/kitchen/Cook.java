package com.codecool.kitchen;

import java.util.Date;

public class Cook extends Employee {
    protected boolean knifeReceived = false;


    public Cook(String name, Date birthDate, double salary) {
        super(name, birthDate, salary);
    }

    protected void setKnifeReceived() {
        this.knifeReceived = true;
        System.out.println(this.name + " received her/him knife");
    }

    @Override
    protected void doCook() {
        super.doCook();
    }
}
