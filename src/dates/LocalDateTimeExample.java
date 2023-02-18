package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime :  " + localDateTime);

		LocalDateTime localDateTime1 = LocalDateTime.of(2022, 06, 21, 17, 42, 46, 872);
		System.out.println("localDateTime1 :" + localDateTime1);

		LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("localDateTime2 :" + localDateTime2);
		
		/*
		 * Getting the time and date from LocalDate Time instance
		 */
		
		System.out.println("hour : " + localDateTime.getHour());
		System.out.println("getMinute : " + localDateTime.getMinute());
		System.out.println("getDayOfMonth : " + localDateTime.getDayOfMonth());
		System.out.println("DAY_OF_MONTH : " + localDateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println("ALIGNED_DAY_OF_WEEK_IN_YEAR : " 
					+ localDateTime.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
		System.out.println("DAY_OF_WEEK : " + localDateTime.get(ChronoField.DAY_OF_WEEK));
		
		/*
		 * Modifying the localDateTime
		 */
		System.out.println("plusHours :" + localDateTime.plusHours(2));
		System.out.println("minusDays :" + localDateTime.minusDays(2));
		System.out.println("plusDays :" + localDateTime.plusDays(2));
		System.out.println("withMonth :" + localDateTime.withMonth(12));
		
		/*
		 * Converting localdate, localtime to localdatetime and viceversa
		 */

		LocalDate localDate = LocalDate.of(2022, 06, 22);
		System.out.println("atTime : " + localDate.atTime(18,07));
		
		LocalTime localTime = LocalTime.of(18, 19);
		System.out.println(" atDate: " + localTime.atDate(localDate));
		
		LocalDateTime localDateTime3 = localTime.atDate(localDate);
		System.out.println("toLocalDate :" + localDateTime3.toLocalDate());
		System.out.println("toLocalTime :" + localDateTime3.toLocalTime());
	}

}
