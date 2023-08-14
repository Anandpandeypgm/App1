package com.example.javalib.main;

public class MyClass {
    public static void main(String[] args){


        Animal dog = new Dog();
        Animal cat = new Cat();
        cat.animalSound();
        dog.animalSound();
        dog.sleep();
        cat.sleep();

    }
}
