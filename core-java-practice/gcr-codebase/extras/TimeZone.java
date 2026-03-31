/*Time Zones and ZonedDateTime Write a program that displays the current
time in different time zones:
➢ GMT (Greenwich Mean Time)
➢ IST (Indian Standard Time)
➢ PST (Pacific Standard Time)
Hint: Use ZonedDateTime and ZoneId to work with different time zones.*/
//package extras;
//package extras;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");
		
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
		
        System.out.println("Current time in GMT: " + gmtTime.format(formatter));
		
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		
        System.out.println("Current time in IST: " + istTime.format(formatter));
        ZonedDateTime pastTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST: " + pastTime.format(formatter));
    }
}