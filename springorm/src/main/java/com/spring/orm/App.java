package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student(3306, "Rp", "Rourkela");

		/*
		 * // Begin a transaction try { studentDao.insert(student);
		 * System.out.println("Student inserted successfully."); } catch (Exception e) {
		 * System.out.println("Error inserting student: " + e.getMessage()); }
		 */
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean run = true;
        while (run) 
        {
        	System.out.println("Press 1 for add a New Student");
            System.out.println("Press 2 for Display all students Details");
            System.out.println("Press 3 for get detail of single student");
            System.out.println("Press 4 for update students");
            System.out.println("Press 5 for delete students");
            System.out.println("Press 6 for exit");      
            try 
            {
            	int input = Integer.parseInt(br.readLine());
//            	if(input==1)
//            	{
//            		//add a new student
//            	}else if(input==2)
//            	{
//            		//display
//            	}
            	
            	switch (input) 
            	{
            	case 1:
            		//Add a New student
            		//Taking inputs from users
            		System.out.println("Enter Student id : ");
            		int sId = Integer.parseInt(br.readLine());
            		
            		System.out.println("Enter Student name : ");
            		String sName = br.readLine();
            		
            		System.out.println("Enter Student city : ");
            		String sCity = br.readLine();
            		
            		//Creating Student object and setting value
            		Student s = new Student();
            		s.setStudentId(sId);
            		s.setStudentName(sName);
            		s.setStudentCity(sCity);
            		
            		//Saving student object to database by calling insert of studentDao
            		int r = studentDao.insert(s);
            		System.out.println(r + " Student Added");
            		System.out.println("****************************************************");
            		System.out.println();
            		break;
            	
            	case 2:
            		//Display all student
            		System.out.println("************************************************");
            		List<Student> allStudents = studentDao.getAllStudents();
            		for(Student st:allStudents)
            		{
            			System.out.println("Id : " + st.getStudentId());
            			System.out.println("Name : " + st.getStudentName());
            			System.out.println("City : " + st.getStudentCity());
            			System.out.println("_________________________________________________________");
            		}
            			System.out.println("************************************************");
            		break;
            	
            	case 3:
            		//Get Single Student Data
            		System.out.println("Enter Student id : ");
            		int studentId = Integer.parseInt(br.readLine());
            		Student student1 = studentDao.getStudent(studentId);
            		System.out.println("Id : " + student1.getStudentId());
        			System.out.println("Name : " + student1.getStudentName());
        			System.out.println("City : " + student1.getStudentCity());
        			System.out.println("_________________________________________________________");
            		break;
            	
            	case 4:
            		// Update Student
            		System.out.println("Enter the student id to be updated");
            		int updatedId = Integer.parseInt(br.readLine());

            		System.out.println("Press 1 for update the name");
            		System.out.println("Press 2 for update the city");
            		System.out.println("Press 3 for update both name and city");

            		System.out.println("Enter your choice for what do you want to update?");
            		int choice = Integer.parseInt(br.readLine());

            		Student std1 = studentDao.getStudent(updatedId);

            		String updatedName = std1.getStudentName();
            		String updatedCity = std1.getStudentCity();

            		switch (choice) {
            		    case 1:
            		        System.out.println("Enter the name to be updated");
            		        updatedName = br.readLine();
            		        // Setting the student object's value
            		        std1 = new Student(updatedId, updatedName, updatedCity);
            		        System.out.println("Name updated successfully");
            		        break;

            		    case 2:
            		        System.out.println("Enter the city name to be updated");
            		        updatedCity = br.readLine();
            		        // Setting the student object's value
            		        std1 = new Student(updatedId, updatedName, updatedCity);
            		        System.out.println("City updated successfully");
            		        break;

            		    case 3:
            		        System.out.println("Enter the name to be updated");
            		        updatedName = br.readLine();
            		        System.out.println("Enter the city name to be updated");
            		        updatedCity = br.readLine();
            		        // Setting the student object's value
            		        std1 = new Student(updatedId, updatedName, updatedCity);
            		        System.out.println("Name and city updated successfully");
            		        break;
            		}

            		studentDao.updateStudent(std1);
            		System.out.println("Student Data Updated successfully");
            		break;
            		
            	
            	case 5:
            		//Delete Student
            		System.out.println("Enter Student id : ");
            		int dltstudentId = Integer.parseInt(br.readLine());
            		studentDao.deleteStudent(dltstudentId);
            		System.out.println("Student Deleted");
            		break;
            	
            	case 6:
            		//Exit
            		run = false;
            		break;
            		
				}
            	
            	
			} 
            catch (Exception e) 
            {
				System.out.println("Invalid input Try with another one !!");
				System.out.println(e.getMessage());
			}
        }
        System.out.println("Thank You For using My Application");
        System.out.println("See You Again !!");
    }
}



