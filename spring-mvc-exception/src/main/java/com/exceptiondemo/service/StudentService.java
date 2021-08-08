package com.exceptiondemo.service;

import java.util.List;

import com.exceptiondemo.exceptions.CityNotFoundException;
import com.exceptiondemo.exceptions.IdNotFoundException;
import com.exceptiondemo.model.Student;

public interface StudentService {
	Student getStudentbyId(Integer studentId) throws IdNotFoundException;
	List<Student> getStudentByCity(String city) throws CityNotFoundException;
	List<Student> showAllStudents();
}
