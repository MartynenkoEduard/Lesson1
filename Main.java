package com.company;

public class Main {

    public static void main(String[] args) {
        Exercise_1();
        // Exercise_2();
    }

    private static void Exercise_1() {
        System.out.println();
        int x = 0;
        int y = 0;
        double a = 3 * x / 3 - 7;
        double b = 4 * x * 3 - 12 * y;
        double c = 122 * x - 2;
        double d = Math.sin(x * (-3 + 2 * y) + 1);
        double e = x * 4 * Math.abs(485 - 179);
        double f = 3 + 9 * x - 5 / x - 1;
        double g = (2.5 * (4 - 6 * x) - 5);
        double h = Math.cos(x / 2) + Math.sin(x / 4);

        System.out.println("x =" + x + "a = 3 * x / 3 - 7 = " + a);
        System.out.println("x =" + x + "y = " + y + "4 * x * 3 - 12 * y = " + b);
        System.out.println("x =" + x + "122 * x - 2 = " + c);
        System.out.println("x =" + x + "y = " + y + "sin( x * (-3 + 2 * y) + 1) = " + d);
        System.out.println("x =" + x + "x * 4 * |485 - 179| = " + e);
        System.out.println("x =" + x + "3 + 9 * x - 5 / x - 1 = " + f);
        System.out.println("x =" + x + "(2.5 * (4 - 6 * x) - 5) = " + g);
        System.out.println("x =" + x + "(cos(x / 2) + sin(x / 4)) - 5) = " + h);
    }
