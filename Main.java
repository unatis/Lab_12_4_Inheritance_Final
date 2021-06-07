package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.AnimalName = "Blackbirds";
        animal.SomeFunc();

        Animal Bird = new Birds();
        Bird.AnimalName = "Chickadees";

        Birds Bird2 = new Birds();
        Bird2.AnimalName = "Crows";
        Bird2.BirdName = "American Crow";
        Bird2.SomeFunc();

        Animal Bird3 = Bird2;
        Bird3.AnimalName = "";


    }

}
