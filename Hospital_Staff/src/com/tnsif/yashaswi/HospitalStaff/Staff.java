package com.tnsif.yashaswi.HospitalStaff;
public class Staff {
	private String Name;
	private int StaffId;
	//setter method
	public void setName(String Name) {
		this.Name=Name;
	}
	public void setStaffId(int StaffId) {
		this.StaffId=StaffId;
	}
	//getter method
	public String getName() {
		return Name;
	}
	public int StaffId() {
		return StaffId;
	}
	//method
	public void displayStaffDetails() {
		System.out.println("Name is:" +Name);
		System.out.println("StaffId is:" +StaffId);
	}
}
