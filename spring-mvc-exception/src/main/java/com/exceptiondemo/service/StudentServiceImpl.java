package com.exceptiondemo.service;


import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.exceptiondemo.exceptions.CityNotFoundException;
import com.exceptiondemo.exceptions.IdNotFoundException;
import com.exceptiondemo.model.Student;
@Service
public class StudentServiceImpl implements StudentService {

	
	@Override
	public Student getStudentbyId(Integer studentId) {
		// TODO Auto-generated method stub
		
		Student student=StudentDetails().stream().filter((stu)->stu.getStudentId().equals(studentId)).findFirst().orElse(null);
		if(student==null) {
			throw new IdNotFoundException("Invalid Id");
		}
		return student;
	 
	}

	@Override
	public List<Student> getStudentByCity(String city) {
		// TODO Auto-generated method stub
	List<Student> studentByCity=StudentDetails().stream().filter((stu)->stu.getCity().equals(city)).collect(Collectors.toList());
	if(studentByCity.isEmpty()) {
		throw new CityNotFoundException("Invalid City");
	}
	return studentByCity;
	
	}
	
	private List<Student> StudentDetails(){
		return Arrays.asList(new Student("Rajat",123,"Delhi"),
				new Student("Raju",163,"Delhi"),
				new Student("Rajeev",173,"Delhi"),
				new Student("Raj",193,"chennai"),
				new Student("Roman",1333,"ohio")
				
				);
	}

	@Override
	public List<Student> showAllStudents() {
		// TODO Auto-generated method stub
		return StudentDetails();
	}

}
