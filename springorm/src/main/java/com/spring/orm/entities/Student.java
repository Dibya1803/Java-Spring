package com.spring.orm.entities;



@jakarta.persistence.Entity
@jakarta.persistence.Table(name="student_details")
public class Student {
	
	@jakarta.persistence.Id
	@jakarta.persistence.Column(name="student_id")
	private int studentId;
	@jakarta.persistence.Column(name="student_name")
	private String studentName;
	@jakarta.persistence.Column(name="student_city")
	private String studentCity;
	
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

	public Student() {
		
	}

	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
}
