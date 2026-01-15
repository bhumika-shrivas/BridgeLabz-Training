package com.day10.birdsanctuary;

import java.util.*;

public class SanctuaryApp {
    public static void main(String[] args) {

        ArrayList<Bird> birds = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
            1. Add Bird
            2. Show All Birds
            3. Sanctuary Report
            4. Exit
            """);

            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Type (Eagle/Duck/Penguin): ");
                    String t = sc.next();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();

                    Bird b = switch (t.toLowerCase()) {
                        case "eagle" -> new Eagle(id, name);
                        case "duck" -> new Duck(id, name);
                        default -> new Penguin(id, name);
                    };
                    birds.add(b);
                }

                case 2 -> birds.forEach(b -> {
                    b.eat();
                    if (b instanceof Flyable f) f.fly();
                    if (b instanceof Swimmable s) s.swim();
                });

                case 3 -> {
                    long fly = birds.stream().filter(b -> b instanceof Flyable).count();
                    long swim = birds.stream().filter(b -> b instanceof Swimmable).count();
                    System.out.println("Flyable: " + fly + ", Swimmable: " + swim);
                }

                case 4 -> { return; }
            }
        }
    }
}
