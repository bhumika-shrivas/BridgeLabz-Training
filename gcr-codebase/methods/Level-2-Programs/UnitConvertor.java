import java.util.*;
// UnitConvertor utility class
public class UnitConvertor {

    // Method To convert kilometers to miles
    public static double convertKmToMiles(double km) {

        double km2miles = 0.621371;
        double miles = km * km2miles;

        return miles;
    }

    // Method To convert miles to kilometers
    public static double convertMilesToKm(double miles) {

        double miles2km = 1.60934;
        double km = miles * miles2km;

        return km;
    }

    // Method To convert meters to feet
    public static double convertMetersToFeet(double meters) {

        double meters2feet = 3.28084;
        double feet = meters * meters2feet;

        return feet;
    }

    // Method To convert feet to meters
    public static double convertFeetToMeters(double feet) {

        double feet2meters = 0.3048;
        double meters = feet * feet2meters;

        return meters;
    }
}

class UnitConvertorTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Kilometer to Miles
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        System.out.println(km +" km to Miles = " + UnitConvertor.convertKmToMiles(km));

        // Miles to Kilometer
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println(miles +" miles to Kilometers = " + UnitConvertor.convertMilesToKm(miles));

        // Meters to Feet
        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters +" meters to Feet = " + UnitConvertor.convertMetersToFeet(meters));

        // Feet to Meters
        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet +" feet to Meters = " + UnitConvertor.convertFeetToMeters(feet));

        sc.close();
    }
}
