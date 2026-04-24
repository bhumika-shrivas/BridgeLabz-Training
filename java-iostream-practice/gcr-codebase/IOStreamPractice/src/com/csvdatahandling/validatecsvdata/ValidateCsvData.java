package com.csvdatahandling.validatecsvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCsvData {

    // Regex for email validation
	private static final String EMAIL_REGEX =
			"^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";


    // Regex for exactly 10 digit phone number
    private static final String PHONE_REGEX =
            "^[0-9]{10}$";

    public static void main(String[] args) {

        String filePath =
            "O:/Java Programming Workspace/java-io-streams-practice/gcr-codebase/IOStreamsPractice/src/com/csvdatahandling/validatecsvdata/employees_contact.csv";

        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            boolean isHeader = true;

            System.out.println("Invalid Records Found:\n");

            while ((line = br.readLine()) != null) {

                // Skip header row
                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");

                String id = data[0];
                String name = data[1];
                String email = data[2];
                String phone = data[3];

                boolean isEmailValid = emailPattern.matcher(email).matches();
                boolean isPhoneValid = phonePattern.matcher(phone).matches();

                // If any validation fails
                if (!isEmailValid || !isPhoneValid) {

                    System.out.println("Invalid Row:");
                    System.out.println("ID    : " + id);
                    System.out.println("Name  : " + name);

                    if (!isEmailValid)
                        System.out.println("Email : " + email + "  <-- Invalid Email");
                    else
                        System.out.println("Email : " + email);

                    if (!isPhoneValid)
                        System.out.println("Phone : " + phone + "  <-- Invalid Phone");
                    else
                        System.out.println("Phone : " + phone);

                    System.out.println("----------------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}

