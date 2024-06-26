package com.horstman.corejava;

// классы этого файла входят в указанный пакет

import java.time.*;

// операторы import следуют после оператора package

/**
 * @version 1.11 2015-05-08
 * @author Cay Horstmann
 */
public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
