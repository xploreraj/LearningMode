package org.designpattern.creational_patterns.builder;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.0f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}