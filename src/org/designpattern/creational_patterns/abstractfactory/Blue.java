package org.designpattern.creational_patterns.abstractfactory;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
