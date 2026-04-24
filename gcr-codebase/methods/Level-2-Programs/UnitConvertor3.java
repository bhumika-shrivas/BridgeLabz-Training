import java.util.*;

// UnitConvertor utility class
public class UnitConvertor3 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {

        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        double celsius = farhenheit2celsius;

        return celsius;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {

        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        double farhenheit = celsius2farhenheit;

        return farhenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {

        double pounds2kilograms = 0.453592;
        double kilograms = pounds * pounds2kilograms;

        return kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {

        double kilograms2pounds = 2.20462;
        double pounds = kilograms * kilograms2pounds;

        return pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {

        double gallons2liters = 3.78541;
        double liters = gallons * gallons2liters;

        return liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {

        double liters2gallons = 0.264172;
        double gallons = liters * liters2gallons;

        return gallons;
    }
}

class UnitConvertorTest3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.print("Enter Fahrenheit: ");
        double farhenheit = sc.nextDouble();
        System.out.println(farhenheit + " Fahrenheit to Celsius = "
                + UnitConvertor3.convertFarhenheitToCelsius(farhenheit));

        // Celsius to Fahrenheit
        System.out.print("Enter Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius + " Celsius to Fahrenheit = "
                + UnitConvertor3.convertCelsiusToFarhenheit(celsius));

        // Pounds to Kilograms
        System.out.print("Enter pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds to Kilograms = "
                + UnitConvertor3.convertPoundsToKilograms(pounds));

        // Kilograms to Pounds
        System.out.print("Enter kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kilograms to Pounds = "
                + UnitConvertor3.convertKilogramsToPounds(kilograms));

        // Gallons to Liters
        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons to Liters = "
                + UnitConvertor3.convertGallonsToLiters(gallons));

        // Liters to Gallons
        System.out.print("Enter liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters to Gallons = "
                + UnitConvertor3.convertLitersToGallons(liters));

        sc.close();
    }
}
