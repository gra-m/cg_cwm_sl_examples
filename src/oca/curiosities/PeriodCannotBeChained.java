package oca.curiosities;
// only the years are taken from date: 5/10/13 22:33 AM (AnswerB) but prints localized to your machine.
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PeriodCannotBeChained {
public static void main(String[] args) {
	LocalDateTime d = LocalDateTime.of(2015, 5, 10, 22, 33);

	Period p = Period.ofDays(1).ofYears(2);
	d = d.minus(p);

	DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
	System.out.println(f.format(d));

}
}
