package com.example.ExceptionPackage.Unchecked;

public class CustomExceptionHandling {
    final static String DATA = null;

    public static void main(String[] args) throws NullDataFieldException {
        if (DATA == null) {
            System.out.println(DATA.length());
        } else {
            throw new NullDataFieldException("Data Field is null");
        }
    }
}
