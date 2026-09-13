package com.tnsif.task12.abstraction;

public abstract class Company {
	String Name;
	String Location;
	public Company(String Name, String Location){
		this.Name=Name;
		this.Location=Location;
	}
	abstract void Details();
}
class Employee1 extends Company{
	Employee1(String Name, String Location){
		super(Name, Location);
	}

	@Override
	void Details() {
		System.out.println("The Name of the Employee1 is:"+Name);
		System.out.println("The Location is:"+Location);
	}
}
class Employee2 extends Company{
	Employee2(String Name, String Location){
		super(Name,Location);
	}

	@Override
	void Details() {
		System.out.println("The Name of the Employee2 is:"+Name);
		System.out.println("The Location is:"+Location);
	}
}

