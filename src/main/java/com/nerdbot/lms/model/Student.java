package com.nerdbot.lms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int suid;
	private String studentunivid;
	private String student_Name;
	private String student_Class;
	private String student_Branch;
	private boolean black_listed;
	public int getSuid() {
		return suid;
	}
	public void setSuid(int suid) {
		this.suid = suid;
	}
	public String getStudentunivid() {
		return studentunivid;
	}
	public void setStudentunivid(String studentunivid) {
		this.studentunivid = studentunivid;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getStudent_Class() {
		return student_Class;
	}
	public void setStudent_Class(String student_Class) {
		this.student_Class = student_Class;
	}
	public String getStudent_Branch() {
		return student_Branch;
	}
	public void setStudent_Branch(String student_Branch) {
		this.student_Branch = student_Branch;
	}
	public boolean isBlack_listed() {
		return black_listed;
	}
	public void setBlack_listed(boolean black_listed) {
		this.black_listed = black_listed;
	}

	

}
