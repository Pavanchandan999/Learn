package com.practice3;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(3,4), new Circle(5)};
        for(Shape shape:shapes)
            System.out.println("Area " +shape.calculateArea());

    }
}
