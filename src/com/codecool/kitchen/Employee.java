package com.codecool.kitchen;

import java.util.Date;

public abstract class Employee {
    String name;
    Date birthDate;
    double salary;

    public Employee(String name, Date birthDate, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    protected void doTaxReport() {
        System.out.println("Tax " + this.name + " should pay is: " + this.salary * 0.99);
    }

    protected void doCook() {


    };
}
