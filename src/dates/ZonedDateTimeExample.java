package dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);

		System.out.println("getOffset :" + zonedDateTime.getOffset());

		System.out.println("zone id : " + zonedDateTime.getZone());

		// System.out.println("zonedDateTime :" + ZoneId.getAvailableZoneIds());

		// readable format

		// ZoneId.getAvailableZoneIds().stream().forEach(zone->System.out.println(zone));

		System.out.println(" size of Zones : " + ZoneId.getAvailableZoneIds().size());

		// CST, EST, MST, PST

		System.out.println("Chicago :" + ZonedDateTime.now(ZoneId.of("America/Chicago")));
		System.out.println("Detroit :" + ZonedDateTime.now(ZoneId.of("America/Detroit")));
		System.out.println("Los_Angeles :" + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
		System.out.println("Los_Angeles :" + ZonedDateTime.now(ZoneId.of("America/Denver")));

		System.out.println("Berlin :" + ZonedDateTime.now(ZoneId.of("Europe/Berlin")));

		System.out.println("ZonedDateTime using clock:" + ZonedDateTime.now(ZoneId.of("America/Denver")));

		LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("America/Detroit"));
		System.out.println("localDateTime :" + localDateTime);

		LocalDateTime loDateTime1 = LocalDateTime.now(Clock.system(ZoneId.of("America/Detroit")));
		System.out.println("Detroit clock system  : " + loDateTime1);

		LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println("localDateTime2  : " + localDateTime2);
		
		
		/*
		 * Convert Localdate time instanst to zoned localdate time 
		 */
		
		LocalDateTime localDateTime3 = LocalDateTime.now();
		
		System.out.println("localDateTime3 :" + localDateTime3);
		
		ZonedDateTime zonedDateTime2 =   localDateTime3.atZone(ZoneId.of("America/Chicago"));
		System.out.println("zonedDateTime2 :" + zonedDateTime2);
		
		ZonedDateTime zonedDateTime3 = Instant.now().atZone(ZoneId.of("America/Detroit"));
		
		System.out.println("zonedDateTime3 : " + zonedDateTime3);
		
		OffsetDateTime offsetDateTime =  localDateTime3.atOffset(ZoneOffset.ofHours(-6));
		
		System.out.println("offsetDateTime : " + offsetDateTime);
	}

}
