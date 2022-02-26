package com.example.ErrorPackage;

public class StackOverErrorExample {
    private static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return factorial(number - 1) * number;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
