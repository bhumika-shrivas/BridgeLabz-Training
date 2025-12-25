import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZone {

    public static void main(String[] args) {

        // Display time in GMT
        displayTime("GMT", "GMT");

        // Display time in IST
        displayTime("IST", "Asia/Kolkata");

        // Display time in PST
        displayTime("PST", "America/Los_Angeles");
    }

    // Method to display time for a given zone
    public static void displayTime(String zoneName, String zoneId) {

        // Get current date and time for zone
        ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of(zoneId));

        // Format date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Print result
        System.out.println(zoneName + " Time: " + dateTime.format(formatter));
    }
}
