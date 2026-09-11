package com.tnsif.SchoolManagemnetSystem;
public class Student extends person {
	private int RollNo;
	private String Course;
	//setter method
	public void setRollNo(int RollNo) {
		this.RollNo=RollNo;
	}
	public void setCourse(String Course) {
		this.Course=Course;
	}
	//method
	public void displayStudentDetails() {
		System.out.println("Student RollNo is:" +RollNo);
		System.out.println("Course is:" +Course);
	}
}
