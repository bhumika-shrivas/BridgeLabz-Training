/*Write a program to calculate the volume of a cylinder. Take the radius and height as inputs and use the formula:
Volume = π * radius^2 * height.*/

import java.util.Scanner;

class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder = " + volume);
    }
}
