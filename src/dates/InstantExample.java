package dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(" instant :" + instant);
		
		
		/**
	     * Gets the number of seconds from the Java epoch of 1970-01-01T00:00:00Z.
	     * <p>
	     * The epoch second count is a simple incrementing count of seconds where
	     * second 0 is 1970-01-01T00:00:00Z.
	     * The nanosecond part is returned by {@link #getNano}.
	     *
	     * @return the seconds from the epoch of 1970-01-01T00:00:00Z
	     */
		
		System.out.println("getEpochSecond :" +  instant.getEpochSecond());
		
		System.out.println(Instant.ofEpochMilli(0));
		
		Instant instant1 = Instant.now();
		
		Duration duration =   Duration.between(instant, instant1);
		System.out.println("duration : " + duration.getNano());

	}

}
