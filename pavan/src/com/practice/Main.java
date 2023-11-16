package com.practice;

public class Main{
    public static void main(String[] args) {
         // Create an array of Animal objects (including both Cat and Dog objects)
         Animal[] animals = {  new Cat(), new Dog()};

        // Call the makeSound() method on each object in the array
         for(Animal animal: animals)
             animal.makeSound();
        }
    }





