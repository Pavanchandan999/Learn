package com.practice1;

public class Main{
    public static void main(String[] args) {
        // create an array of Shape objects (including rectangle and circle)
        Shape[] shapes = {new Rectangle(2,4), new Circle(5)};
        // call the calculateArea() method on each object in the array
        for(Shape shape:shapes)
            System.out.println("Area " +shape.calculateArea());
    }
}

