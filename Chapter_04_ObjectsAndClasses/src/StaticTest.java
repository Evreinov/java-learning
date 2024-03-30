/**
 * В этой программе демонстрируются статические методы
 * @version 1.02 2008-04-10
 * @author Cay Horstmann
 */
public class StaticTest {

	public static void main(String[] args) {
		// заполнить массив staff тремя объектами типа Employee
		Employee2[] staff = new Employee2[3];
		
		staff[0] = new Employee2("Tom", 40000);
		staff[1] = new Employee2("Dick", 60000);
		staff[2] = new Employee2("Harry", 65000);
		
		// вывести данные обо всех объектах типа Employee
		for(Employee2 e : staff) {
			e.setId();
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
		}
		
		int n = Employee2.getNextId(); // вызвать статический метод
		System.out.println("Next available id=" + n);
	}

}

class Employee2{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee2(String n, double s) {
		name = n;
		salary = s;
		id = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		id = nextId; // установить следующий доступный идентификатор
		nextId++;
	}
	
	public static int getNextId() {
		return nextId; // возвратить статическое поле
	}
	
	public static void main(String[] args) // выполнить модульный тест
	{
		var e = new Employee2("Harry", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
