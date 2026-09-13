package com.tnsif.task12.abstraction;

public abstract class Vehicle {
	abstract void start();
	abstract void stop();
}
class Bike extends Vehicle{
	public void start() {
		System.out.println("Bike starts with a self start");
	}
	public void stop() {
		System.out.println("Bike stops using Breaks");
	}
}
class Car extends Vehicle{
	public void start() {
		System.out.println("Car starts with a key");
	}
	public void stop() {
		System.out.println("Car stops using Breaks");
	}
} 
