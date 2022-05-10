package javatest.other.internationalization.oca_date_and_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
// reuseable with different periods..
class _02Periods {
public static void main(String[] args) {
	LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
	LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
	Period period = Period.of(0,1,0); // period ofYears ofMonths ofWeeks ofDays also available
	performAnimalEnrichment(start, end, period);
}
private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                            Period period) { // uses the generic period
	LocalDate upTo = start;
	while (upTo.isBefore(end)) {
		System.out.println("give new toy: " + upTo);
		upTo = upTo.plus(period); // adds the period
	}}
}
