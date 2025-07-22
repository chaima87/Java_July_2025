package com.zoo.mammals;

public class Gorilla extends Mammal {

    public void throwSomething() {
        this.energyLevel -= 5;
        System.out.println("The gorilla has thrown something! (-5 energy)");
    }

    public void eatBananas() {
        this.energyLevel += 10;
        System.out.println("The gorilla eats a banana and looks happy. (+10 energy)");
    }

    public void climb() {
        this.energyLevel -= 10;
        System.out.println("The gorilla climbs a tree. (-10 energy)");
    }
}
