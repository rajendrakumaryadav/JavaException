package com.example.ExceptionPackage.Checked;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class FileNotFoundExceptionHandling {
//    private static PrintWriter printWriter;

    public static void main(String[] args) {
        try (var printWriter = new PrintWriter("./test.txt")) {
            printWriter.println("Hello, World!");
            System.out.println("Saved!");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
//            printWriter.close();
            System.out.println("Out of Tasks!");
        }

        System.out.println("In Main Out of try-catch...");
    }
}
