import java.util.*;

// UnitConvertor utility class
public class UnitConvertor2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {

        double yards2feet = 3;
        double feet = yards * yards2feet;

        return feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {

        double feet2yards = 0.333333;
        double yards = feet * feet2yards;

        return yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {

        double meters2inches = 39.3701;
        double inches = meters * meters2inches;

        return inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {

        double inches2meters = 0.0254;
        double meters = inches * inches2meters;

        return meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {

        double inches2cm = 2.54;
        double centimeters = inches * inches2cm;

        return centimeters;
    }
}

class UnitConvertorTest2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Yards to Feet
        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println(yards + " yards to Feet = "
                + UnitConvertor2.convertYardsToFeet(yards));

        // Feet to Yards
        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet to Yards = "
                + UnitConvertor2.convertFeetToYards(feet));

        // Meters to Inches
        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println(meters + " meters to Inches = "
                + UnitConvertor2.convertMetersToInches(meters));

        // Inches to Meters
        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println(inches + " inches to Meters = "
                + UnitConvertor2.convertInchesToMeters(inches));

        // Inches to Centimeters
        System.out.print("Enter inches: ");
        inches = sc.nextDouble();
        System.out.println(inches + " inches to Centimeters = "
                + UnitConvertor2.convertInchesToCentimeters(inches));

        sc.close();
    }
}
