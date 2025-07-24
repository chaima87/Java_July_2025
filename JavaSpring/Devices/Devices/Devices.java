package com.devices.project;

public class Devices {
private Integer battery;

public Integer getBattery() {
	return battery;
}

public void setBattery(Integer battery) {
	this.battery = battery;
}
public int status() {
	System.out.println("Your batteri level is : "+this.getBattery());
	return this.getBattery();
}

public Devices() {
	super();
	this.battery=100;
}
}
