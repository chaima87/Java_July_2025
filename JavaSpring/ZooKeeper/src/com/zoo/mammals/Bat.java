package com.zoo.mammals;

public class Bat extends Mammal {

    public Bat() {
        this.energyLevel = 300;
    }

    public void fly() {
        this.energyLevel -= 50;
        System.out.println("The bat takes off into the air! (-50 energy)");
    }

    public void eatHumans() {
        this.energyLevel += 25;
        System.out.println("The bat feasts on humans... (+25 energy)");
    }

    public void attackTown() {
        this.energyLevel -= 100;
        System.out.println("The bat attacks a town in a blaze of fire! (-100 energy)");
    }
}
