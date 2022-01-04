package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("a: ");
        a = scanner.nextDouble();
        System.out.println("b: ");
        b = scanner.nextDouble();
        System.out.println("c: ");
        c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Nghiệm của phương trình là x = %f!\n", answer);
        } else {
            if (b == 0) {
                System.out.print("Phương trình có vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm ");
            }
        }
    }
}
