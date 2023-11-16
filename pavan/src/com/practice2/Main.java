package com.practice2;

public class Main {
    public static void main(String[] args) {
        Person[] people ={ new Student(), new Teacher()};
        for(Person person: people)
            person.greet();
    }
}
