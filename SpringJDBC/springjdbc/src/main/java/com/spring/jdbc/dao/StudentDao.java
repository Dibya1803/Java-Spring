package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	public int insert(Student student );
	public int change(Student student);
	public int delete(int studentId);
	public Student getStudent(int studnetId);
	public List<Student> getAllStudents();
	
}
