package com.lambdaexpression.notificationfiltering;

import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Alert> alerts = new ArrayList<>();

        alerts.add(new Alert("Heart rate critical", "EMERGENCY", 5));
        alerts.add(new Alert("Take morning medicine", "MEDICATION", 2));
        alerts.add(new Alert("Routine check reminder", "INFO", 1));
        alerts.add(new Alert("Blood pressure high", "EMERGENCY", 4));

        // Preference 1: Show only emergency alerts
        Predicate<Alert> emergencyOnly =
                alert -> alert.getType().equals("EMERGENCY");

        // Preference 2: Show high severity alerts (>= 4)
        Predicate<Alert> highSeverity =
                alert -> alert.getSeverity() >= 4;

        // Preference 3: Combine preferences
        Predicate<Alert> emergencyAndCritical =
                emergencyOnly.and(highSeverity);

        System.out.println("---- Emergency Alerts ----");
        AlertFilter.filterAlerts(alerts, emergencyOnly)
                   .forEach(System.out::println);

        System.out.println("\n---- High Severity Alerts ----");
        AlertFilter.filterAlerts(alerts, highSeverity)
                   .forEach(System.out::println);

        System.out.println("\n---- Emergency + Critical Alerts ----");
        AlertFilter.filterAlerts(alerts, emergencyAndCritical)
                   .forEach(System.out::println);
    }
}
