package com.devices.project;

public class DeviceTest {
	public static void main(String[] args) {
		//create a phone instance
		Phone phone1=new Phone();
		
		//call method :3 times
		phone1.makeCall();
		phone1.makeCall();
		phone1.makeCall();
		
		//play method : 2 times
		phone1.playGame();
		phone1.playGame();
		phone1.playGame();
		phone1.playGame();
		phone1.playGame();
		
		//charge method one time 
		//phone1.charge();
	}
}
