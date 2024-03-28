import java.util.*;

/**
 * В этой программе демонстрируется применение
 * цикла <code>do-while</code>
 * @version 1.20 2004-02-10
 * @author Cay Horstman
 */
public class Retirement2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		String input;
		
		// Обносить остаток на счете, пока работник
		// не готов выти на пенсию
		do {
			// добавить ужегодный взнос и проценты
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			year++;
			
			// вывести текущий остаток на счету
			System.out.printf("After year %d, your balance is %,.2f%n", year, balance);
			
			// запросить готовность работника выйти 
			// на пенсию и получить ответ
			System.out.print("Ready to retire? (Y/N) ");
			input = in.next();
			
		} while (input.equals("N"));
	}
}
