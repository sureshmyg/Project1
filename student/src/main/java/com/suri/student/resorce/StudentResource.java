package com.suri.student.resorce;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.suri.student.Service.StudentService;
import com.suri.student.model.Student;

@Path("/studentinfo")   
public class StudentResource {
	
	StudentService sutser=new StudentService();

@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Student> getStudentDetails(){
return sutser.getAllStudents();
}
}