package com.spring.jdbc;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;


public class DynamicEntry {

	public static void main(String[] args) {
		  System.out.println("My Program started......!");

	        // spring jdbc => jdbcTemplate
	        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

	        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

	        Scanner scanner = new Scanner(System.in);

	        // Insert
	        Student student = new Student();
	        System.out.print("Enter student ID: ");
	        student.setId(scanner.nextInt());
	        scanner.nextLine(); // consume the newline character
	        System.out.print("Enter student name: ");
	        student.setName(scanner.nextLine());
	        System.out.print("Enter student city: ");
	        student.setCity(scanner.nextLine());

	        int result = studentDao.insert(student);
	        System.out.println("Student Added: " + result);
	        System.out.println("***********************************");

	        // Update
	        Student student1 = new Student();
	        System.out.print("Enter student ID for update: ");
	        student1.setId(scanner.nextInt());
	        scanner.nextLine(); // consume the newline character
	        System.out.print("Enter updated student name: ");
	        student1.setName(scanner.nextLine());
	        System.out.print("Enter updated student city: ");
	        student1.setCity(scanner.nextLine());

	        int result1 = studentDao.change(student1);
	        System.out.println("Data is Updated Successfully: " + result1);
	        System.out.println("+++++++++++++++++++++++++++++++++++++");

	        // Delete
	        System.out.print("Enter student ID to delete: ");
	        int studentIdToDelete = scanner.nextInt();

	        int result2 = studentDao.delete(studentIdToDelete);
	        System.out.println("Entered Details deleted from the table: " + result2);
	        System.out.println("-------------------------------------------");

	        // Get single row Data
	        System.out.print("Enter student ID to retrieve: ");
	        int studentIdToRetrieve = scanner.nextInt();

	        Student student3 = studentDao.getStudent(studentIdToRetrieve);
	        System.out.println(student3);
	        System.out.println("##########################################");

	        // Get multiple row data
	        List<Student> students = studentDao.getAllStudents();
	        for (Student s : students) {
	            System.out.println(s);
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


