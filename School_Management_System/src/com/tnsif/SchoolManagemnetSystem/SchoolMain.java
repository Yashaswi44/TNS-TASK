package com.tnsif.SchoolManagemnetSystem;
public class SchoolMain {
	public static void main(String[] args) {
		Student student=new Student();
		student.setName("T.yashaswi");
		student.setAge(22);
		student.setRollNo(69);
		student.setCourse("Java");
		System.out.println("___Student Details___");
		student.displayPersonDetails();
		student.displayStudentDetails();
	}
}
