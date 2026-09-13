package com.tnsif.task11.superkey;

public class Parent {
	String Name="Kranthi";
	public void display() {
		System.out.println("This is a parent class method");
	}
}
class Child extends Parent{
	String Name="Hari";
	public void Display() {
		System.out.println("Parent Name:"+super.Name);
		System.out.println("Child Name:"+Name);
		super.display();
		displayChild();
	}
	public void displayChild() {
		System.out.println("This is Child class method");
	}
}
