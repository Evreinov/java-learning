import java.util.*;

/**
 * Эта программа демонстрирует консольный ввод
 * @version 1.10 2004-02-10
 * @author Cay Horstman
 */
public class InputTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// получить первую вводимую строку
		System.out.print("What is your name? ");
		String name = in.nextLine();
		
		// получить вторую вводимую строку
		System.out.print("How old are you? ");
		int age = in.nextInt();
		
		// вывести результат на консоль
		System.out.println("Hello, " + name
				+ ". Next year, you'll be " + (age + 1));
	}

}
