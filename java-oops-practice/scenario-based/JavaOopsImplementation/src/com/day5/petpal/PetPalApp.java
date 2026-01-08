package com.day5.petpal;

import java.util.Scanner;

public class PetPalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Choose pet (1-Dog, 2-Cat, 3-Bird): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        Pet pet;
        if (choice == 1) {
            pet = new Dog(name, age);
        } else if (choice == 2) {
            pet = new Cat(name, age);
        } else {
            pet = new Bird(name, age);
        }

        pet.makeSound();
        pet.showStatus();

        System.out.println("\nChoose action: 1-Feed 2-Play 3-Sleep");
        int action = sc.nextInt();

        switch (action) {
            case 1 -> pet.feed();
            case 2 -> pet.play();
            case 3 -> pet.sleep();
        }

        pet.showStatus();
    }
}