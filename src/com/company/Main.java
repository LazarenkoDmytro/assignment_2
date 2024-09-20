package com.company;

import java.util.Scanner;

public class Main {
    private static void isInsideCircle() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the coordinates of the point: ");

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x * x + y * y <= 16 ? "Inside" : "Outside");
        }
    }

    public static void main(String[] args) {
        isInsideCircle();
    }
}