package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser implements HIPAACompliantAdmin {

    private Integer employeeID;
    private String role;
    private String pin;
    private ArrayList<String> securityIncidents;

    // Constructor
    public AdminUser(Integer employeeID, String role) {
        this.employeeID = employeeID;
        this.role = role;
        this.securityIncidents = new ArrayList<>();
    }

    
    public boolean assignPin(int pin) {
        if (String.valueOf(pin).length() >= 6) {
            this.pin = String.valueOf(pin);
            return true;
        }
        return false;
    }

    
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (this.employeeID.equals(confirmedAuthID)) {
            return true;
        }
        this.authIncident();
        return false;
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
    }

    public void authIncident() {
        String report = String.format(
            "Datetime: %s, ID: %d, Note: AUTHORIZATION ATTEMPT FAILED",
            new Date(), this.employeeID
        );
        this.securityIncidents.add(report);
    }

    // Optional getters
    public Integer getEmployeeID() {
        return employeeID;
    }

    public String getRole() {
        return role;
    }

    public String getPin() {
        return pin;
    }
}
