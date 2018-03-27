package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sause;
    private final List<String> ingredients;

    private Bigmac(String roll, int burgers, String sause, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sause = sause;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sause;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sause(String sause) {
            this.sause = sause;
            return this;
        }

        public BigmacBuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(roll, burgers, sause, ingredients);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSause() {
        return sause;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sause='" + sause + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
