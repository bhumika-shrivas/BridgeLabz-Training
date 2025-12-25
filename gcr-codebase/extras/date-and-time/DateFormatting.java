import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting{

    public static void main(String[] args) {

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Display date in different formats
        displayFormat1(currentDate);
        displayFormat2(currentDate);
        displayFormat3(currentDate);
    }

    // Format: dd/MM/yyyy
    public static void displayFormat1(LocalDate date) {

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Format 1: " + date.format(formatter));
    }

    // Format: yyyy-MM-dd
    public static void displayFormat2(LocalDate date) {

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Format 2: " + date.format(formatter));
    }

    // Format: EEE, MMM dd, yyyy
    public static void displayFormat3(LocalDate date) {

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Format 3: " + date.format(formatter));
    }
}
