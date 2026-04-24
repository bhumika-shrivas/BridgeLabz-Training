import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (dd-MM-yyyy): ");
        String date1 = sc.nextLine();

        System.out.print("Enter second date (dd-MM-yyyy): ");
        String date2 = sc.nextLine();

        sc.close(); // close scanner

        // Parse dates
        LocalDate firstDate = parseDate(date1);
        LocalDate secondDate = parseDate(date2);

        compareDates(firstDate, secondDate);
    }

    // Convert string to LocalDate
    public static LocalDate parseDate(String input) {

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return LocalDate.parse(input, formatter);
    }

    // Compare two dates
    public static void compareDates(LocalDate d1, LocalDate d2) {

        if (d1.isBefore(d2)) {
            System.out.println("First date is before second date");
        } else if (d1.isAfter(d2)) {
            System.out.println("First date is after second date");
        } else if (d1.isEqual(d2)) {
            System.out.println("Both dates are the same");
        }
    }
}
