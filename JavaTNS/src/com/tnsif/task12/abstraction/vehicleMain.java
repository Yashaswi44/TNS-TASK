package com.tnsif.task12.abstraction;

public class vehicleMain {
	public static void main(String [] args) {
		Bike b=new Bike();
		b.start();
		b.stop();
		
		Car c=new Car();
		c.start();
		c.stop();
	}
}
