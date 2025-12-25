import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input date
        System.out.print("Enter a date (dd-MM-yyyy): ");
        String inputDate = sc.nextLine();

        // Parse input date
        LocalDate date = parseDate(inputDate);

        // Perform date calculations
        LocalDate resultDate = calculateDate(date);

        // Display final result
        displayResult(resultDate);
		// close scanner
		sc.close(); 
    }

    // Convert string to LocalDate
    public static LocalDate parseDate(String input) {

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return LocalDate.parse(input, formatter);
    }

    // Add and subtract days, months, years
    public static LocalDate calculateDate(LocalDate date) {

        // Add 7 days, 1 month, 2 years
        LocalDate updatedDate = date.plusDays(7)
                                    .plusMonths(1)
                                    .plusYears(2);

        // Subtract 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        return updatedDate;
    }

    // Display output
    public static void displayResult(LocalDate date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Final Date: " + date.format(formatter));
    }
}
