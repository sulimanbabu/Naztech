package com.naztech.sl.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


public class Employee {
	@NonNull
	private int empId;
	private String name;
	private String country;
	private String city;
	private double salary;
	private int zipcode;
	public Employee(){
		empId = 0;
		name = "";
		country = " ";
		city=" ";
		salary=0;
		zipcode=0;
	}
  public Employee(int empId, String name, String country, String city, double salary, int zipcode) {
		super();
		this.empId = empId;
		this.name = name;
		this.country = country;
		this.city = city;
		this.salary = salary;
		this.zipcode = zipcode;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}	
	
	@Override
	public boolean equals(Object obj) {
		Employee employee=(Employee)obj;
		if(this.empId == employee.empId && this.name.equals(employee.name) && this.country.equals(employee.country) && this.city.equals(employee.city) && this.salary==employee.salary && this.zipcode==employee.zipcode)
		return true;
		else 
			return false;
	}
	

}

