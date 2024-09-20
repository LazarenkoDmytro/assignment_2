package com.company;

import java.util.Arrays;
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

    private static void drawFigure(Scanner scanner) {
        System.out.print("Enter the height of the figure: ");
        int height = scanner.nextInt();
        String star = "*";

        for (int i = 1; i <= 2 * height - 1; i++) {
            System.out.println(star.repeat(height - Math.abs(height - i)));
        }
    }

    private static void findPrimeNumbers() {
        int n = 100;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    private static void drawHourglass(Scanner scanner) {
        System.out.print("Enter the width of the hourglass: ");
        int width = scanner.nextInt();

        String space = " ";
        String star = "*";
        int middle = (width + 1) / 2;
        for (int i = 1; i <= width; i++) {
            int spacesNumber = middle - Math.abs(middle - i) - 1;
            int starsNumber = width - 2 * spacesNumber;

            System.out.println(space.repeat(spacesNumber) + star.repeat(starsNumber) + space.repeat(spacesNumber));
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            isInsideCircle(scanner);
            isInsideTriangle(scanner);
            isLuckyTicket(scanner);
            isPalindrome(scanner);
            drawFigure(scanner);
            findPrimeNumbers();
            drawHourglass(scanner);
        }
    }
}