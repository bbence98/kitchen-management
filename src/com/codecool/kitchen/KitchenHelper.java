package com.codecool.kitchen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class KitchenHelper extends Employee {

    public KitchenHelper(String name, Date birthDate, double salary) {
        super(name, birthDate, salary);
    }

    List<String> ingredients = loadIngredients();

    private List<String> loadIngredients() {
        List<String> ingredients = new ArrayList<>();
        String[] types = {"carrot", "potato", "meat"};

        for (String type : types) {
            int piecesOfType = ThreadLocalRandom.current().nextInt(0, 4);
            for (int i = 0; i < piecesOfType; i++) {
                ingredients.add(type);
            }
        }
        return ingredients;
    }

    protected List<String> getIngredients() {
        return ingredients;
    }
}