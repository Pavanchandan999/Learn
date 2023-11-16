package com.practice1;

import com.practice1.Shape;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
