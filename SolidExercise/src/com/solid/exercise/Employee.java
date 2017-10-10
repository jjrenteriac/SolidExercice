package com.solid.exercise;

import java.util.List;

public class Employee implements EmployeeActions{

	private String name;
	private String lastName;
	private double salary;
	private double bonus;
	public EmployeeType employeeType;
	
	public List<Employee> employees ;
	
	
	@Override
	public void calculateBonus(){
		for (Employee employee : employees) {
			double bonus = 0;
			
			switch (employee.employeeType) {
			case Programmer:
				bonus = employee.getSalary() * 2;
				break;
			case Manager:
				bonus = employee.getSalary() * 3;
				break;

			default:
				break;
			}
			
			employee.setBonus(bonus);
		}
	}
	
		
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployee(List<Employee> employees) {
		this.employees = employees;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}


	@Override
	public void calculateVacatons() {
		// Calculate vacations logic here
	}


	@Override
	public void encryptEmployeePasswor() {
		//Encrypt employee logic here
		
	}
	
	
}
