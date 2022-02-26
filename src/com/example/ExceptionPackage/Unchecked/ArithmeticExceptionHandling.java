package com.example.ExceptionPackage.Unchecked;

public class ArithmeticExceptionHandling {
    static void divide(int a, int b) throws ArithmeticException {
        System.out.println(a / b);

    }

    static void divide(double a, double b) {
        System.out.println(a / b);
    }

    static void divide(String a, String b) {
        try {
            var x = Integer.parseInt(a);
            var y = Integer.parseInt(b);
            System.out.println(x / y);
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("Exception " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            divide(10, 5);
            divide(10, 0);
            divide(10, 2);

        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
        divide("10", "0A");
    }
}
