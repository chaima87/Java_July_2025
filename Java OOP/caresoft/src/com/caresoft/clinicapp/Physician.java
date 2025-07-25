package com.caresoft.clinicapp;

public class Physician implements HIPAACompliantUser {

    private int id;
    private String pin;

    // Constructor
    public Physician(int id) {
        this.id = id;
    }

    @Override
    public boolean assignPin(int pin) {
        if (String.valueOf(pin).length() == 4) {
            this.pin = String.valueOf(pin);
            return true;
        }
        return false;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return this.id == confirmedAuthID;
    }

    
    public int getId() {
        return id;
    }

    public String getPin() {
        return pin;
    }
}
