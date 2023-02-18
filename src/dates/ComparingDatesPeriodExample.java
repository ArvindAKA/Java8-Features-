package dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.of(2022, 01, 12);
		LocalDate localDate1 = LocalDate.of(2022, 06, 22);

		/*
		 * 
		 */
		Period period = localDate.until(localDate1);
		System.out.println("getDays :" + period.getDays()); // 22-12 = 10days
		System.out.println("getMonths :" + period.getMonths()); //06-01 = 05 months
		System.out.println("getYears :" + period.getYears()); //2022-2022
		
		Period period1 =   Period.ofDays(10);
		System.out.println("period1.getDays()  " + period1.getDays());
		
		Period period2 =   Period.ofYears(10);
		System.out.println("period1.ofYears  " + period2.ofYears(10));
		System.out.println("toTotalMonths  " + period2.toTotalMonths());
		
		Period period3 = Period.between(localDate, localDate1);
		System.out.println("Period.between " + period3.getDays() + " : " + period3.getMonths()
				+ " : " + period3.getYears());
		
		

	}

}
