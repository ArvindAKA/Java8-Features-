package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {

	public static void parseLocaldate() {

		/*
		 * String to a Local Date
		 */

		String date = "2022-06-23";
		LocalDate localDate = LocalDate.parse(date);
		System.out.println("localDate :" + localDate);
		LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDate1 : " + localDate1);

		String date1 = "20220623"; // yyyyMMdd
		LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println("localDate2 : " + localDate2);

		/*
		 * Custom Date format
		 */
		String date2 = "2022|06|23";
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
		System.out.println("localDate3 : " + localDate3);

		String date3 = "2022*06*23";
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy*MM*dd");
		LocalDate localDate4 = LocalDate.parse(date3, dateTimeFormatter2);
		System.out.println("localDate4 : " + localDate4);

		String date4 = "2022/06/23";
		DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate5 = LocalDate.parse(date4, dateTimeFormatter3);
		System.out.println("localDate5 : " + localDate5);

		/*
		 * String date5 = "2022#06#23"; // reserved pattern # cannot be used - this will
		 * throw exception DateTimeFormatter dateTimeFormatter4 =
		 * DateTimeFormatter.ofPattern("yyyy#DD#mm"); LocalDate localDate6 =
		 * LocalDate.parse(date5, dateTimeFormatter4); System.out.println("localDate6 :"
		 * + localDate6);
		 */

	}

	public static void formatLocaldate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
		LocalDate localDate = LocalDate.now();
		String fromattedDate = localDate.format(formatter);
		System.out.println("fromattedDate:  " + fromattedDate);

		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate2 = LocalDate.now();
		String formattedDate = localDate2.format(formatter1);
		System.out.println("formattedDate : " + formattedDate);
	}

	public static void main(String[] args) {

		parseLocaldate();
		formatLocaldate();

	}

}
