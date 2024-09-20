package com.company;

import java.util.Scanner;

public class Main {
    private static void isInsideCircle(Scanner scanner) {
        System.out.print("Enter the coordinates of the point: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println(x * x + y * y <= 16 ? "Inside" : "Outside");
    }

    private static void isInsideTriangle(Scanner scanner) {
        System.out.print("Enter the coordinates of the point: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (y <= x && 6 * y >= x && 2 * y <= -3 * x + 20) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }

    private static void isLuckyTicket(Scanner scanner) {
        System.out.print("Enter the 4-digit number: ");
        int number = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < 2; i++) {
            result = result + number % 10;
            number = number / 10;
        }

        for (int i = 0; i < 2; i++) {
            result = result - number % 10;
            number = number / 10;
        }

        System.out.println(result == 0 ? "Lucky Ticket" : "Not Lucky Ticket");
    }

    public static void isPalindrome(Scanner scanner) {
        System.out.print("Enter the 6-digit number: ");
        int number = scanner.nextInt();

        int[] digits = new int[3];
        for (int i = 0; i < 3; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        for (int i = 2; i >= 0; i--) {
            if (digits[i] != number % 10) {
                System.out.println("Not a palindrome.");
                return;
            }

            number = number / 10;
        }

        System.out.println("Is a palindrome.");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            isInsideCircle(scanner);
            isInsideTriangle(scanner);
            isLuckyTicket(scanner);
            isPalindrome(scanner);
        }
    }
}