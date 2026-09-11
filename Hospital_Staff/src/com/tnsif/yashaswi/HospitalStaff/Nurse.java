package com.tnsif.yashaswi.HospitalStaff;
public class Nurse extends Staff {
	private String Ward;
	//setter method
	public void setWard(String Ward) {
		this.Ward=Ward;
	}
	//getter method
	public String getWard() {
		return Ward;
	}
	//method
	public void dispalyNurseDetails() {
		System.out.println("Ward is:" +Ward);
	}
}
