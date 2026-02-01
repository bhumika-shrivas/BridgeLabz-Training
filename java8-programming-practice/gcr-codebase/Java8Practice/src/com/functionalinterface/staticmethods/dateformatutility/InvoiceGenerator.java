package com.functionalinterface.staticmethods.dateformatutility;

/*Date Format Utility
○ Scenario: An invoice generator must format dates in multiple formats.
○ Task: Use a static interface method to format dates.*/

import java.time.LocalDate;
import java.util.Scanner;

public class InvoiceGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter invoice date (dd-MM-yyyy or yyyy/MM/dd): ");
        String inputDate = sc.nextLine();

        LocalDate date = DateUtils.parseDate(inputDate);

        if (date == null) {
            System.out.println("Invalid date input");
        } else {
            System.out.println("Invoice Date: " + date);
        }

        sc.close();
    }
}
