package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started......!" );
        
          //spring jdbc => jdbcTemplate
		  ApplicationContext context =new AnnotationConfigApplicationContext(JdbcConfig.class);
		  
		  StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		  
		  //insert 
		  Student student = new Student();
		  student.setId(231);
		  student.setName("TRP");
		  student.setCity("IOK");
		  int result = studentDao.insert(student);
		  System.out.println("Student Added" + result);
		  System.out.println("***********************************");
        
		  //Update
		  Student student1 = new Student();
		  student1.setId(226);
		  student1.setName("JS");
		  student1.setCity("OD");
		  int result1 = studentDao.change(student1);
		  System.out.println("Data is Upadated Secuessfully" + result1 );
		  System.out.println("+++++++++++++++++++++++++++++++++++++");
      
		  
		  //Delete
		  int result2 = studentDao.delete(123);
		  System.out.println("Entered Details deleted from the table" + result2);
		  System.out.println("-------------------------------------------");
		  
		  //Get single row Data  
		  Student student3 = studentDao.getStudent(183);
		  System.out.println(student3);
		  System.out.println("##########################################");
		
		  
		  //Get multiple row data
		  List<Student> students = studentDao.getAllStudents();
		  for(Student s:students) 
		  {
			  System.out.println(s);
			
		  }
    
    }
    
}
