package javatest.other.internationalization.oca_date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;

public class ManipulateDateTime {
public static void main(String[] args) {

	System.out.println("Forward in time: ");

	LocalDate date1 = LocalDate.of(2014, Month.JANUARY, 20);
	System.out.println(date1); // 2014-01-20
	date1 = date1.plusDays(2);
	System.out.println(date1); // 2014-01-22
	date1 = date1.plusWeeks(1);
	System.out.println(date1); // 2014-01-29
	date1 = date1.plusMonths(1);
	System.out.println(date1); // 2014-02-28
	date1 = date1.plusYears(5);
	System.out.println(date1); // 2019-02-28

	System.out.println();


	System.out.println("\n\nBackward in time: ");

	LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
	LocalTime time2 = LocalTime.of(5, 15);
	LocalDateTime dateTime1 = LocalDateTime.of(date2, time2);
	System.out.println(dateTime1); // 2020-01-20T05:15
	dateTime1 = dateTime1.minusDays(1);
	System.out.println(dateTime1); // 2020-01-19T05:15
	dateTime1 = dateTime1.minusHours(10);
	System.out.println(dateTime1); // 2020-01-18T19:15
	dateTime1 = dateTime1.minusSeconds(30);
	System.out.println(dateTime1); // 2020-01-18T19:14:30


	System.out.println("\n\nCan be chained:\nLocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);\n" +
		                   "\tLocalTime time3 = LocalTime.of(5, 15);\n" +
		                   "\tLocalDateTime dateTime2 = LocalDateTime.of(date3, time3)\n" +
		                   "\t\t.minusDays(1).minusHours(10).minusSeconds(30);");
	LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
	LocalTime time3 = LocalTime.of(5, 15);
	LocalDateTime dateTime2 = LocalDateTime.of(date3, time3)
		.minusDays(1).minusHours(10).minusSeconds(30);

	System.out.println("dateTime2 = " + dateTime2);

	// Manipulate Old
	System.out.println("\nManipulate old: ");

	Calendar oldWay1 = Calendar.getInstance();
	oldWay1.set(2021, Calendar.APRIL, 20);

	System.out.println("Oldway before subtract 1 day: " + oldWay1.getTime());

	oldWay1.add(Calendar.DATE, -1);

	System.out.println("After " + oldWay1.getTime());



}
}
