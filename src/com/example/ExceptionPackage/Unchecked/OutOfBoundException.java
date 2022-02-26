package com.example.ExceptionPackage.Unchecked;

public class OutOfBoundException {

    public static void main(String[] args) {
        int[] a = new int[5];
        try {
            a[10] = 50;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception : " + ex.getMessage());
        }
        System.out.println("Done!");
    }
}

