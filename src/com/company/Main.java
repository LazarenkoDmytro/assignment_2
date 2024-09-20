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

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            isInsideCircle(scanner);
            isInsideTriangle(scanner);
        }
    }
}