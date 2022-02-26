package com.example.ExceptionPackage.Checked;

public class ClassNotFoundExceptionHandling {
    private final static String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

    // stdin / stdout/ stderr
    public static void main(String[] args) {
        try {
            System.out.println("Loading JDBC Driver : " + DRIVER_CLASS_NAME);
            Class.forName(DRIVER_CLASS_NAME);
        } catch (ClassNotFoundException | ArithmeticException ex) {
            System.out.println("Exception : " + "While Loading Classname [ " + DRIVER_CLASS_NAME + " ]");
        }
    }
}
