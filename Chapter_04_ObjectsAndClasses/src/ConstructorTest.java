import java.util.*;

/**
 * В этой програемме демонстрируется 
 * конструирование объектов
 * @version 1.02 2018-04-10
 * @author Cay Horstman
 */
public class ConstructorTest {

	public static void main(String[] args) {
		// заполнить массив staff тремя
		// объектами типа Employee
		var staff = new Employee4[3];
		
		staff[0] = new Employee4("Harry", 40000);
		staff[1] = new Employee4(60000);
		staff[2] = new Employee4();
		
		// вывести данные обо всех объектах типа Employee
		for (Employee4 e : staff)
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
	}
}

class Employee4
{
	private static int nextId;
	
	private int id;
	private String name = ""; // инициализация поля экземпляра
	
	private double salary;
	
	// статический блок инициализации
	static {
		var generator = new Random();
		// задать произвольное число 0-999 в поле nextId
		nextId = generator.nextInt(10000);
	}
	
	// блок инициализации объекта
	{
		id = nextId;
		nextId++;
	}
	
	// три перегружаемых конструктора
	public Employee4(String n, double s) {
		name = n;
		salary = s;
	}
	
	public Employee4(double s) {
		// вызвать конструктор Employee(String, double)
		this("Employee #" + nextId, s);
	}
	
	// конструктор без аргументов
	public Employee4() {
		// поле name инициализируется пустой строкой "" -
		// поле salary не устанавливается явно, см. выше;
		// a инициализируется нулем
		// поле id инициализируется в блоке инициализации
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
}