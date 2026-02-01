package com.functionalinterface.staticmethods.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public interface DateUtils {

    List<DateTimeFormatter> FORMATTERS = List.of(
            DateTimeFormatter.ofPattern("dd-MM-yyyy"),
            DateTimeFormatter.ofPattern("yyyy/MM/dd")
    );

    static LocalDate parseDate(String input) {

        for (DateTimeFormatter formatter : FORMATTERS) {
            try {
                return LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                // try next format
            }
        }
        return null;
    }
}
