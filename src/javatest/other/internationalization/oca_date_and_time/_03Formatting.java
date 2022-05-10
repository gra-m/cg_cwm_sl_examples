package javatest.other.internationalization.oca_date_and_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _03Formatting {

public static void main(String[] args) {
	System.out.println("date/dateTime.format(DateTimeFormatter.\nISO_LOCAL_DATE\nISO_LOCAL_TIME\nISO_LOCAL_DATE_TIME)\n");

	LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
	LocalTime time = LocalTime.of(11, 12, 34);
	LocalDateTime dateTime = LocalDateTime.of(date, time);
	System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
	System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
	System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


	System.out.println("\nFormat Styles with ZonedDateTime");


	ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("CET"));

	DateTimeFormatter madeZoneDateTimeFull = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
	DateTimeFormatter madeZoneDateTimeLong = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
	DateTimeFormatter madeZoneDateTimeMedium = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
	DateTimeFormatter madeZoneDateTimeShort = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

	DateTimeFormatter[] formatters = {madeZoneDateTimeFull, madeZoneDateTimeLong, madeZoneDateTimeMedium, madeZoneDateTimeShort};

   System.out.println("ZonedDateTime accepts all FormatStyles with .ofLocalizedDateTime, Long and full include Zone info.");

	for(DateTimeFormatter formatter: formatters){
		System.out.print("Using format: " + formatter + " ");
		System.out.println(zonedDateTime.format(formatter));
	}

	System.out.println("\nFormat Styles with ZonedDateTime");


	LocalDateTime localDateTime = LocalDateTime.now();

	DateTimeFormatter madeDateTimeFull = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	DateTimeFormatter madeDateTimeLong = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	DateTimeFormatter madeDateTimeMedium = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
	DateTimeFormatter madeDateTimeShort = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

	DateTimeFormatter[] formatters1 = {madeDateTimeFull, madeDateTimeLong, madeDateTimeMedium, madeDateTimeShort};

	System.out.println("LocalDate, LocalDateTime, ZonedDateTime, OffsetDateTime accept all" +
		                   " FormatStyles with .ofLocalizedDate, Long and full show no extra info though.");

	for(DateTimeFormatter formatter: formatters1){
		System.out.print("Using format: " + formatter + " ");
		System.out.println(localDateTime.format(formatter));
	}


}
}
