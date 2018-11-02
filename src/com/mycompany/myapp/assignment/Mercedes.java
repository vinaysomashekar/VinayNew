package com.mycompany.myapp.assignment;

public class Mercedes extends Car{
	// Car is super class
	//Mercedes is child class
	
	public static void main (String[] args){
		Mercedes m = new Mercedes();
		m.accelerate();
		Car c = new Car();
		c.brake();
		
	}

	public void startRemotely() {
		System.out.println("Start Car Remotely");
	}
	
	@Override //@annotation
	public void brake() {
		System.out.println("braking in Mercedes");
	}
}
