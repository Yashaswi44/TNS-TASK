package com.tnsif.SchoolManagemnetSystem;
public class person {
	private String Name;
	private int Age;
	//setter method
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setAge(int Age) {
		this.Age=Age;
	}
	//getter method
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age;
	}
	//method
	public void displayPersonDetails() {
		System.out.println("Name of the Person is:" +Name);
		System.out.println("Age of the Person is:" +Age);
	}
}
