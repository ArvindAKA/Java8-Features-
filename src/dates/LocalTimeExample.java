package dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {

		LocalTime localTime = LocalTime.now();
		System.out.println("localtime : " + localTime);

		LocalTime localTime1 = LocalTime.of(23, 33);
		System.out.println("localTime1 : " + localTime1);

		LocalTime localTime2 = LocalTime.of(23, 33, 43);
		System.out.println("localTime2 : " + localTime2);
		
		LocalTime localTime3 = LocalTime.of(23, 33, 43, 77564478);
		System.out.println("localTime3 : " + localTime3);
		
		/*
		 * getting values from local time instance
		 */
		
		System.out.println(" get hour :" + localTime.getHour());
		System.out.println(" get getMinute :" + localTime.getMinute());
		System.out.println(" CLOCK_HOUR_OF_DAY : " + localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println(" get toSecondOfDay :" + localTime.toSecondOfDay());
		
		/*
		 * Modify values of Local time
		 */
		
		System.out.println("minusHours  : " + localTime.minusHours(2));
		System.out.println("minus ChronoUnit Hours  : " + localTime.minus(2, ChronoUnit.HOURS));
		System.out.println(" LocalTime.MIDNIGHT  : " + localTime.with(LocalTime.MIDNIGHT));
		System.out.println(" ChronoField.HOUR_OF_DAY : " + localTime.with(ChronoField.HOUR_OF_DAY,22));
		System.out.println(" plusMinutes : " + localTime.plusMinutes(30));
		System.out.println(" withHour : " + localTime.withHour(12));
		
	}

}
