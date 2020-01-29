package com.codecool.kitchen;

import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class Chef extends Employee {
    protected boolean knifeReceived = false;

    public Chef(String name, Date birthDate, double salary) {
        super(name, birthDate, salary);
    }

    protected void setKnifeReceived() {
        this.knifeReceived = true;
        System.out.println(this.name + " received her/him knife");
    }

    @Override
    protected void doCook() {
        super.doCook();
        String[] types = {"carrot", "potato", "meat"};
        KitchenHelper kitchenHelper = new KitchenHelper("Harri Kovanen", new Date(1999-4-21), 600.85);
        List<String> ingredients = kitchenHelper.getIngredients();
        Timer t = new Timer();
        final int[] counter = {0};
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                if (ingredients.size() > 0) {
                    if (Math.random() * 100 < 80) {
                        int randomNumber = ThreadLocalRandom.current().nextInt(0, types.length);
                        System.out.println("Give me a " + types[randomNumber]);
                        if (ingredients.contains(types[randomNumber])) {
                            ingredients.remove(types[randomNumber]);
                            counter[0]++;
                            System.out.println("Here is your " + types[randomNumber] + "\n" );
                        } else {
                            System.out.println("We’re all out \n");
                        }
                    }
                } else {
                    System.out.println("Bon appetite!\n" + "It was made from " + counter[0] + " ingredients");
                    t.cancel();
                }
            }
        }, 0, 1000);
    }


}
