package com.tnsif.yashaswi.HospitalStaff;
public class HospitalMain {
	public static void main(String[] args) {
		Doctor doctor=new Doctor();
		doctor.setName("Dr.Kranthi");
		doctor.setStaffId(133616);
		doctor.setSpecialization("Childern Specialist");
		System.out.println("___Doctor Details___");
		doctor.displayStaffDetails();
		doctor.displayDoctorDetails();
		Nurse nurse=new Nurse();
		nurse.setName("Harini");
		nurse.setStaffId(133000);
		nurse.setWard("ICU");
		System.out.println("___Nurse Details___");
		nurse.displayStaffDetails();
		nurse.dispalyNurseDetails();
	}
}
