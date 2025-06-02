package xyz;

import java.util.Scanner;

public class Switchstmt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter day number
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();

        // Use switch-case to determine the day name
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number! Please enter a number from 1 to 7.");
        }

        // Close scanner
        scanner.close();
    }
}