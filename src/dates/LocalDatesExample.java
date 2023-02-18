package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDatesExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		
		System.out.println("localDate : " + localDate);
		
		LocalDate locaDate1 = LocalDate.of(2022, 06, 20);
		System.out.println("locaDate1 :" + locaDate1);
		
		LocalDate locaDate2 = LocalDate.ofYearDay(2022, 365);
		System.out.println("locaDate2 :" + locaDate2);
		
		System.out.println(" localDate.getMonth :" + localDate.getMonth());
		System.out.println(" localDate.getMonth value :" + localDate.getMonthValue());
		System.out.println(" localDate.getDayOfWeek :" + localDate.getDayOfWeek());
		
		System.out.println(" localDate.getDayOfYear :" + localDate.getDayOfYear());
		
		System.out.println(" localDate.DAY_OF_MONTH :" + localDate.get(ChronoField.DAY_OF_MONTH));
		
		/*
		 * Modifying the local date
		 */
		
		System.out.println("plusDays : " + localDate.plusDays(2));
		System.out.println("plusMonths : " + localDate.plusMonths(2));
		System.out.println("minusDays : " + localDate.minusDays(2));
		System.out.println("withYear : " + localDate.withYear(2021));
		System.out.println("with ChronoField : " + localDate.with(ChronoField.YEAR, 2020));
		System.out.println("with ChronoField : " + localDate.with(ChronoField.YEAR, 2020));
		System.out.println("with TemporalAdjusters : " + localDate.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println("with firstDayOfNextYear : " + localDate.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(" Minus Year :" + localDate.minusYears(1));
		System.out.println(" Minus year using ChronoUnit unit :" + localDate.minus(1, ChronoUnit.YEARS) );
		
		
		/*
		 * Supported
		 */
		
		System.out.println(" isSupported : " + localDate.isSupported(ChronoUnit.MINUTES));
		
		/*
		 * additional support methods
		 */
		
		System.out.println("Leap year : " + localDate.isLeapYear() );
		System.out.println(" Check leap year by passing date : " + LocalDate.ofYearDay(2020, 01).isLeapYear());
		System.out.println("date is equal to another  date :" + localDate.isEqual(locaDate1));
		System.out.println(" is before : " + localDate.isBefore(locaDate1));
		System.out.println("is after : " + localDate.isAfter(locaDate1));
	}
	

}
