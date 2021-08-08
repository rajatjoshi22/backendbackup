package com.training.basics;

public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee employee=new Employee();
    employee.setEmpName("Rajat");
    employee.setEmpId(167);
    Address address=new Address();
    address.setCity("NewYork");
    address.setZipcode(15689);
    employee.setAddress(address);
    System.out.println(employee);
	}

}
