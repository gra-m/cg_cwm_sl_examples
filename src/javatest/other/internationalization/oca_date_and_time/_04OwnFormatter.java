package javatest.other.internationalization.oca_date_and_time;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

class _04OwnFormatter {
private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
private boolean carryOnRunning = false;

public static void main(String[] args) throws IOException {


	_04OwnFormatter own = new _04OwnFormatter();
	own.carryOnRunning = true;




	own.run();

}

private void run() throws IOException {
	do {

		System.out.println("Enter date in this format MM dd yyyy");
		String input1 = bufferedReader.readLine();
		//System.out.println("Enter date in this format MM dd yyyy z (z e.g. = CET)");
		//String input2 = bufferedReader.readLine();

		DateTimeFormatter basicDateFormat = DateTimeFormatter.ofPattern("MM dd yyyy");
		DateTimeFormatter basicZoneDateFormat = DateTimeFormatter.ofPattern("MM dd yyyy v");

		LocalDate localDate = LocalDate.parse(input1, basicDateFormat);
		//ZonedDateTime zoneDateTime = ZonedDateTime.parse(input2, basicZoneDateFormat);

		DateTimeFormatter localDateInternalStyle = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter localZonedDateInternalStyle = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(localDate.format(basicDateFormat));
		System.out.println(localDate.format(localDateInternalStyle));
		//System.out.println(zoneDateTime.format(basicZoneDateFormat));
		//System.out.println(zoneDateTime.format(localZonedDateInternalStyle));

		carryOnRunning = false;

	}while(carryOnRunning);

}
}
