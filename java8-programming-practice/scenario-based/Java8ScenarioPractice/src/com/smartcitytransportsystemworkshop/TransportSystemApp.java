package com.smartcitytransportsystemworkshop;

import java.util.*;
import java.util.stream.*;

public class TransportSystemApp {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TransportService> services = new ArrayList<>();

        System.out.print("Enter number of services: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            System.out.println("\n1.Bus  2.Metro  3.Taxi");
            System.out.print("Choose service type: ");
            int choice = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Service Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Route Name: ");
            String route = sc.nextLine();

            System.out.print("Enter Base Fare: ");
            double baseFare = Double.parseDouble(sc.nextLine());

            System.out.print("Enter Start Location Number: ");
            double start = Double.parseDouble(sc.nextLine());

            System.out.print("Enter End Location Number: ");
            double end = Double.parseDouble(sc.nextLine());

            System.out.print("Enter Passenger Count: ");
            int passengers = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Departure Hour (0-23): ");
            int time = Integer.parseInt(sc.nextLine());

            double distance = GeoUtils.calculateDistance(start, end);

            FareCalculator calc = (fare, dist) -> fare + dist * 2;
            double finalFare = calc.calculateFare(baseFare, distance);

            switch (choice) {
                case 1:
                    services.add(new BusService(name, route, finalFare, passengers, time));
                    break;
                case 2:
                    services.add(new MetroService(name, route, finalFare, passengers, time));
                    break;
                case 3:
                    services.add(new TaxiService(name, route, finalFare, passengers, time));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        // Add emergency service automatically
        services.add(new AmbulanceService());

        System.out.println("\n--- LIVE DASHBOARD ---");
        services.forEach(TransportService::printServiceDetails);

        System.out.println("\n--- Sorted by Lowest Fare ---");
        services.stream()
                .sorted((a, b) -> Double.compare(a.getFare(), b.getFare()))
                .forEach(TransportService::printServiceDetails);

        System.out.println("\n--- Grouping By Route ---");
        Map<String, List<TransportService>> grouped =
                services.stream()
                        .collect(Collectors.groupingBy(TransportService::getRoute));

        grouped.forEach((route, list) ->
                System.out.println(route + " -> " + list.size() + " services"));

        System.out.println("\n--- Peak vs Non-Peak Trips ---");
        Map<Boolean, List<TransportService>> peak =
                services.stream()
                        .collect(Collectors.partitioningBy(s -> s.getPassengers() > 50));

        System.out.println("Peak Trips: " + peak.get(true).size());
        System.out.println("Non-Peak Trips: " + peak.get(false).size());

        System.out.println("\n--- Fare Statistics ---");
        DoubleSummaryStatistics stats =
                services.stream()
                        .collect(Collectors.summarizingDouble(TransportService::getFare));

        System.out.println("Total Fare: " + stats.getSum());
        System.out.println("Average Fare: " + stats.getAverage());

        System.out.println("\n--- Emergency Services ---");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println(s.getServiceName()));
    }
}
