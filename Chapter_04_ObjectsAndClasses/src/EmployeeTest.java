import java.time.*;

/**
 * В этой программе проверяется класс Employee
 * @version 1.13 2018-04-10
 * @author Cay Hortsmann
 */
public class EmployeeTest {

	public static void main(String[] args) {
		// заполнить массив staff тремя
		// объектами типа Уьздщнуу
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
		
		// поднять всем работникам зарплату на 5%
		for (Employee e : staff)
			e.raiseSalary(5);
		
		// вывести данные обо всех объектах типа Employee
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
	}
}

class Employee{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int mouth, int day) {
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, mouth, day);
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
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
