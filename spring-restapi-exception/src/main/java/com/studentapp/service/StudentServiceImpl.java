package com.studentapp.service;


import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.studentapp.exceptions.CityNotFoundException;
import com.studentapp.exceptions.IdNotFoundException;
import com.studentapp.exceptions.StudentNotFoundException;
import com.studentapp.model.Student;
@Service
public class StudentServiceImpl implements StudentService {

	
	@Override
	public Student getStudentbyId(Integer studentId) {
		// TODO Auto-generated method stub
		
		Student student=getAll().stream().filter((stu)->stu.getStudentId().equals(studentId)).findFirst().orElseThrow(()->new IdNotFoundException("Invalid Id!!!!"));	
		return student;
	 
	}

	@Override
	public List<Student> getStudentByCity(String city) {
		// TODO Auto-generated method stub
	List<Student> studentByCity=getAll().stream().filter((stu)->stu.getCity().equals(city)).collect(Collectors.toList());
	if(studentByCity.isEmpty()) {
		throw new CityNotFoundException("No student found in this city");
	}
	return studentByCity;
	
	}
	
	private List<Student> getAll(){
		return Arrays.asList(new Student("Rajat",123,"Delhi"),
				new Student("Raju",163,"Delhi"),
				new Student("Rajeev",173,"Delhi"),
				new Student("Raj",193,"chennai"),
				new Student("Roman",1333,"ohio")
				
				);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		List<Student> studentList= getAll();
		return studentList;
		
	}

	@Override
	public List<Student> getStudentStartWith(String start) {
		// TODO Auto-generated method stub
		List<Student> studentList= getAll().stream().filter((stu)->stu.getStudentName().contains(start)).collect(Collectors.toList());
		if(studentList.isEmpty()) {
			throw new StudentNotFoundException("No student found with this name");
		}
		return studentList;
	
	}

}
