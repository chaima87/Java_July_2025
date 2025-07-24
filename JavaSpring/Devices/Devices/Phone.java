package com.devices.project;

public class Phone extends Devices {
	
	//make call method
public void makeCall() {
	int newBatteryLevel = this.getBattery()-5;
	this.setBattery(newBatteryLevel);
	//Print the new battery level after call
	System.out.println("Your battery level after the cal is: "+this.getBattery());
	
	//critical message
	
	this.criticalMessage();
}
//play game method
public void playGame() {
	if(this.getBattery()>=25) {
		
		//calculate the new battery level after playing a game
		int newBatteryLevel = this.getBattery()-20;
		
		//set the new batteryLevel
		this.setBattery(newBatteryLevel);
		//Print the new battery level play a game
		System.out.println("Your battery level after playin a game is: "+this.getBattery());
		
		//Nionja bonus : critical battery level
		this.criticalMessage();
	}else System.out.println("Your Battery level should not be below 25 before playing ");
	
}

//charge method
public void charge() {
	int newBatteryLevel = this.getBattery()+50;
	this.setBattery(newBatteryLevel);
	//Print the new battery level charge
	System.out.println("Your battery level after charge is: "+this.getBattery());
}

//critical message
public void criticalMessage() {
Boolean compareWith10 = this.status()<10;
	
	//show the message if true
	if(compareWith10) {
		System.out.println("Critical battery Level !! Charge it ^^");
	}
}

}
