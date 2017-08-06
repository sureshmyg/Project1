package com.suri.student.Service;

import java.util.ArrayList;
import java.util.List;

import com.suri.student.model.Student;

public class StudentService {
	
	List<Student> list=new ArrayList<Student>();
	public List<Student> getAllStudents(){
		Student s1=new Student(1,"suresh","Banga");
		Student s2=new Student(2,"suri","Bangalore");
		Student s3=new Student(3,"sun","Sky");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		return list;
	}

}
