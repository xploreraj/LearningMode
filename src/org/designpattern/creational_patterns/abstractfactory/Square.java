package org.designpattern.creational_patterns.abstractfactory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}