import java.time.*;

/**
 * @version 1.5 2015-05-08
 * @author Cay Horstmann
 */
public class CalendarTest {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today - 1);
		
		// задать 1-й день месяца
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		// 1 = понедельник, ... 7 = воскресенье
		System.out.println("Mon Tue Wed Thu Fri Sat Sum");
		for (int i = 1; i < value; i++)
			System.out.print("    ");
		
		while (date.getMonthValue() == month)
		{
			System.out.printf("%3d", date.getDayOfMonth());
			if (date.getDayOfMonth() == today)
				System.out.print("*");
			else
				System.out.print(" ");
			date = date.plusDays(1);
			if (date.getDayOfWeek().getValue() == 1)
				System.out.println();
		}
		if (date.getDayOfWeek().getValue() != 1)
			System.out.println();
	}
}
