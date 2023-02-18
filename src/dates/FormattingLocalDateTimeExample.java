package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public class FormattingLocalDateTimeExample {
	
	public static void parseLocalDateTime() {
		
		String dateTime = "2022-06-23T20:50:45";
		LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
		System.out.println("dateTime : " + dateTime);
		
		LocalDateTime localDateTime1 = LocalDateTime.
				parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		System.out.println("localDateTime1 : " + localDateTime1);
		
		/*
		 * custom format
		 */
		String dateTime1 = "2022-06-23T20|50|45";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
		LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
		System.out.println("localDateTime2 : " + localDateTime2);
		
		String dateTime2 = "2022/06/23T20|50|45";
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd'T'HH|mm|ss");
		LocalDateTime localDateTime3 = LocalDateTime.parse(dateTime2, dateTimeFormatter2);
		System.out.println("localDateTime3 : " + localDateTime3);
		
		String dateTime3 = "2022/06/23abc20|50|45";
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd'abc'HH|mm|ss");
		LocalDateTime localDateTime4 = LocalDateTime.parse(dateTime3, dateTimeFormatter3);
		System.out.println("localDateTime4 :" + localDateTime4);
		
		String dateTime4 = "2022*06*23abc20*50*45";
		DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("yyyy*MM*dd'abc'HH*mm*ss");
		LocalDateTime localDateTime5 = LocalDateTime.parse(dateTime4, dateTimeFormatter4);
		System.out.println(" localDateTime5 - : " + localDateTime5);
		
	}
	
	public static void formatLocalDateAndTime() {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy*MM*dd'abc'HH*mm*ss");
		LocalDateTime localDateTime = LocalDateTime.now();
		String convertedDateTime =  localDateTime.format(dateTimeFormatter);
		System.out.println("convertedDateTime : " + convertedDateTime);
		
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd'abc'HH|mm|ss");
		LocalDateTime localDateTime2 = LocalDateTime.now();
		String convertedDateTime1 = localDateTime.format(dateTimeFormatter2);
		System.out.println("convertedDateTime1 : " + convertedDateTime1);
		
	}

	public static void main(String[] args) {
		
		parseLocalDateTime();
		formatLocalDateAndTime();
		

	}

}
