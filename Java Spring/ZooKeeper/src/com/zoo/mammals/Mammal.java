package com.zoo.mammals;

public class Mammal {
    protected int energyLevel;

    public Mammal() {
        this.energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println("Energy Level: " + this.energyLevel);
        return this.energyLevel;
    }
}
