package com.codecool.kitchen;

import java.util.Date;

public class Kitchen {
    public static void main(String[] args) {
        Chef chef = new Chef("Juliane Schulz", new Date(1993- 5 -30), 1200.5);

        chef.doTaxReport();
        chef.setKnifeReceived();
        System.out.println("\n");
        chef.doCook();

    }
}
