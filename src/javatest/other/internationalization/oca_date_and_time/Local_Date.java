package javatest.other.internationalization.oca_date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

class Local_Date {
public static void main(String[] args) {

	System.out.println("Print LocalDate/Time/DateTime.now():");
	System.out.println(LocalDate.now());
	System.out.println(LocalTime.now());
	System.out.println(LocalDateTime.now());

	LocalDate date1 = LocalDate.of(2021, Month.APRIL, 20);
	LocalDate date2 = LocalDate.of(2021, 4, 20);

	LocalTime time1 = LocalTime.of(6, 15); // hour and minute
	LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
	LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

	LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
	LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);


	// New way vs Java 7 and earlier:

	System.out.println(LocalDate.now());
	System.out.println(new Date());


	LocalDate newApril20th = LocalDate.of(2021, Month.APRIL, 20);

	Calendar oldWay1 = Calendar.getInstance();
	oldWay1.set(2021, Calendar.APRIL, 20);
	System.out.println("Call time to get old Calendar date after constructing " + oldWay1.getTime());


	Calendar oldWay2 = new GregorianCalendar(2021, Calendar.APRIL, 20);
	System.out.println("Same as with GregCal way: " + oldWay2.getTime());


}
}
