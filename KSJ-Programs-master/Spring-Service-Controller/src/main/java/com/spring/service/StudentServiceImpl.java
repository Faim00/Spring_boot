package com.spring.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.spring.entity.Student;

@Service
public class StudentServiceImpl implements IStudentService {

	   public List<Student> loadStudents()
	   {
		   ArrayList<Student> al= new ArrayList<Student>();
		   
		   al.add(new Student(1,"Narendra","Parli"));
		   al.add(new Student(2,"Laksha","latur"));
		   al.add(new Student(3,"OM","aurangabad"));
		   al.add(new Student(4,"Vijay","mumbai"));
		   al.add(new Student(5,"Vikas","pune"));
		   
		   return al;
	   }
	   
	   public List<Student> student= loadStudents();
	   
	   public List<Student> getStudent()
	   {
		    return student;  
	   }

	@Override
	public String addStudent(Student std) {
		
		student.add(std);
		
		return "Studentd Is Added successfully";
		
	}
	
	public Student findById(int id)
	{
		  for(Student stu: student)
		  {
			  if(stu.getId()==id)
				  return stu;
		  }
		  return null;
	}
	   
	   
}
