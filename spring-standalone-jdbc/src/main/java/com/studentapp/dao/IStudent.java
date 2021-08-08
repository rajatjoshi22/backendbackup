package com.studentapp.dao;

import java.util.List;

import com.studentapp.model.Student;

public interface IStudent {
	void addStudent(Student student);
	void updateStudent(Integer studentId,Long mobileNumber);
	List<Student> getAllStudents();
	void deleteStudent(Integer studentId);
	List<Student> getStudentByCity(String city);
	Student getStudentById(Integer studentId);
	String getNameById(Integer studentId);
}
