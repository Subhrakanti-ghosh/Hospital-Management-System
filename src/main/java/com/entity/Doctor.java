package com.entity;

public class Doctor {

	private int iddoctor;
	

	private String fullName;
	private String dob;
	private String qualification;
	private String specialist;
	private String email;
	private String mobNo;
	private String password;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String fullName, String dob, String qualification, String specialist, String email, String mobNo,
			String password) {
		super();
		this.fullName = fullName;
		this.dob = dob;
		this.qualification = qualification;
		this.specialist = specialist;
		this.email = email;
		this.mobNo = mobNo;
		this.password = password;
	}

	public Doctor(int iddoctor, String fullName, String dob, String qualification, String specialist, String email,
			String mobNo, String password) {
		super();
		this.iddoctor = iddoctor;
		this.fullName = fullName;
		this.dob = dob;
		this.qualification = qualification;
		this.specialist = specialist;
		this.email = email;
		this.mobNo = mobNo;
		this.password = password;
	}

	public int getIddoctor() {
		return iddoctor;
	}

	public void setIddoctor(int iddoctor) {
		this.iddoctor = iddoctor;
	}



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}