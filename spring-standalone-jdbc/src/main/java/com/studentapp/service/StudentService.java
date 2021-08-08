package com.studentapp.service;

import java.util.List;


import com.studentapp.model.Student;

public interface StudentService {
void addStudent(Student student);
void updateStudent(Integer studentId,Long mobileNumber);
void deleteStudent(Integer studentId);
List<Student> getAllStudents();
List<Student> getStudentByCity(String city);
Student getStudentById(Integer studentId);
String getNameById(Integer studentId);
}
