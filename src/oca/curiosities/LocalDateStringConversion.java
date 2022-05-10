package oca.curiosities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateStringConversion {
public static void main(String[] args) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	//LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE_TIME); // fails because iso local date includes and expects time.

// Take string in, parse in particular format
	LocalDate date = LocalDate.parse("2018-04-30", formatter);
	//LocalDate dateB = LocalDate.parse("2018/04/30", formatter);// incorrect formatter used
	LocalDate date1 = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE); //29

	//System.out.println(dateB);
	System.out.println(date);
	System.out.println(date1);
	String dateString = date.format(formatter);
	System.out.println(dateString);
	String dateString1 = date.format(formatter1);
	System.out.println(dateString1);

	date = date.plusDays(2);
	System.out.println(date);

}
}
