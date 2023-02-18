package dates;

import java.sql.Date;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FromattingLocalTimeExample {

	public static void parseTime() {
		String time = "20:00";
		LocalTime localTime = LocalTime.parse(time);
		System.out.println("localTime : " + localTime);
		
		LocalTime localTime2 = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("localTime2 : " + localTime2);
		
		/*
		 * Custom defined format
		 */
		String time1 = "13*00";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
		LocalTime localTime3 =   LocalTime.parse(time1, dateTimeFormatter);
		System.out.println("result : " + localTime3);
		
		String time2 = "20//00";
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH//mm"); //hh = 1 to 12 hrs only 
		LocalTime localTime4 = LocalTime.parse(time2, dateTimeFormatter1);
		System.out.println("localTime4 : " + localTime4);
		
		String time3 = "20:00:40";
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime localTime5 = LocalTime.parse(time3, dateTimeFormatter2);
		System.out.println("localTime5 : " + localTime5);
		
		String time4 = "20*48*55";
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime6 = LocalTime.parse(time4, dateTimeFormatter3);
		System.out.println("localTime6 : " + localTime6);
		

	}

	public static void formatTime() {
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm*ss");
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);
		String formattedTime =  localTime.format(dateTimeFormatter);
		System.out.println("formattedTime : " + formattedTime);
		
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH//mm//ss");
		LocalTime localTime2 = LocalTime.now();
		System.out.println("localTime2 : " + localTime2);
		String formattedTime1 = localTime2.format(dateTimeFormatter2);
		System.out.println("formattedTime1 : " + formattedTime1);
		

	}

	public static void main(String[] args) {

		parseTime();
		formatTime();

	}

}
