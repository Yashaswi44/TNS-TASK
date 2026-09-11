package com.tnsif.yashaswi.HospitalStaff;
public class Doctor extends Staff {
	private String Specialization;
	//setter method
	public void setSpecialization(String Specialization) {
		this.Specialization=Specialization;
	}
	//getter method
	public String getSpecialization() {
		return Specialization;
	}
	//method
	public void displayDoctorDetails() {
		System.out.println("Specialization is:" +Specialization);
	}
}
