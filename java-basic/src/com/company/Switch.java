package com.company;

import java.util.Scanner;

public class Switch {
    public static void run () {
        Scanner scanner = new Scanner(System.in);

        // When no match, will run default
        // When has match but no break, will run the matched one and all after ones

        System.out.println("Select from a, b, c");
        String choice = scanner.nextLine();

        switch (choice) {
            case "a":
            case "A":
                System.out.println("A");
//                break;
            case "b":
            case "B":
                System.out.println("B");
//                break;
            case "c":
            case "C":
                System.out.println("C");
//                break;
            default:
                System.out.println("Nothing");
        }
    }
}
