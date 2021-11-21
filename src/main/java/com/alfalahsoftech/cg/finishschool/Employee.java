package com.alfalahsoftech.cg.finishschool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private String address;
	private Date age;
	
	public Employee(int empId, String empName, Date age) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	public Date getAge() {
		return age;
	}

	public void setAge(Date age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return empName.compareTo(o.empName);
	}
	
	public static void main(String[] args) {
		List<Employee> empl = new ArrayList<>();
		empl.add(new Employee(1101, "Sahu", new Date(1992,5,5)));
		empl.add(new Employee(1102, "Rana",new Date(1993,1,15)));
//		Collections.sort(empl);
//		System.out.println(empl);
		Collections.sort(empl,new Comparator<Employee>() {
			@Override
			public int compare(Employee e, Employee e1) {
				
				return e.getAge().compareTo(e1.getAge());
			}
		});
		System.out.println(empl);
		
		//JDK 1.8
		Collections.sort(empl,(e, e1) -> e.getAge().compareTo(e1.getAge()));
			
		
		
		
	}

}
