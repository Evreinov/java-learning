/**
 * В этой программе демонстрируется передача
 * параметров в Java
 * @version 1.01 2018-04-10
 * @author Cay Horstmann
 */
public class ParamTest {

	public static void main(String[] args) {
		/*
		 * Тест 1: методы не могут видоизменять
		 * числовые параметры
		 */
		System.out.println("Testing tripleValue:");
		double percent = 10;
		System.out.println("Before: percent=" + percent);
		tripleValue(percent);
		System.out.println("After: percent=" + percent);
		
		/*
		 * Тест 2: методы могут изменять состояние объектов,
		 * передаваемых в качестве параметров
		 */
		System.out.println("\nTesting tripleSalary:");
		var harry = new Employee3("Harry", 50000);
		System.out.println("Before: salary=" + harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary=" + harry.getSalary());
		
		/*
		 * Тест 3: методы не могут присоединять новые
		 * объекты к объектным параметрам.
		 */
		System.out.println("\nTesting swap:");
		var a = new Employee3("Alice",  70000);
		var b = new Employee3("Bob", 60000);
		System.out.println("Before: a=" + a.getName());
		System.out.println("Before: b=" + b.getName());
		swap(a, b);
		System.out.println("After: a=" + a.getName());
		System.out.println("After: b=" + b.getName());
	}
	
	public static void tripleValue(double x) {
		// не сработает!
		x = 3 * x;
		System.out.println("End of method: x=" + x);
	}
	
	public static void tripleSalary(Employee3 x) {
		// сработает! 
		x.raiseSalary(200);
		System.out.println("End of method: salary=" + x.getSalary());
	}
	
	public static void swap (Employee3 x, Employee3 y) {
		Employee3 temp = x;
		x = y;
		y = temp;
		System.out.println("End of method: x=" + x.getName());
		System.out.println("End of method: y=" + y.getName());
	}
}


class Employee3 { // упрощенный класс Employee
	private String name;
	private double salary;
	
	public Employee3(String n, double s) {
		name = n;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
