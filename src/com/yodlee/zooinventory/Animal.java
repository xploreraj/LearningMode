package com.yodlee.zooinventory;

/**
 * Created by rbiswas on 7/3/2014.
 */
public class Animal {
    public static enum AnimalClass {
        mammal,
        reptile,
        bird,
        fish,
        amphibian,
        invertebrate
    }

    public AnimalClass animalClass;
    public String name, species, habitat, food, temperament;
    public Double weight;
    public FoodRecipe foodRecipe;

    @Override
    public String toString() {
        return name + "(" + animalClass + ", " + species + ")";
    }
}