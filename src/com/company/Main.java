package com.company;

import java.util.Scanner;

public class Main {
    private static void isInsideCircle(Scanner scanner) {
        System.out.print("Enter the coordinates of the point: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println(x * x + y * y <= 16 ? "Inside" : "Outside");
    }

    public static void main(String[] args) {
        isInsideCircle();
        try (Scanner scanner = new Scanner(System.in)) {
            isInsideCircle(scanner);
        }
    }
}