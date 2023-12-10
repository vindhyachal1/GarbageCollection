package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


        // Creating strings without the new keyword
        String a = "Hello";
        String b = "World";

        // Concatenating strings
        String s1 = a + b;

        // Creating strings with the new keyword
        String c = new String("Java");
        String d = new String("Programming");

        // Concatenating strings
        String s2 = c + d;

        // Creating additional objects
        for (int i = 0; i < 1000000; i++) {
            String temp = new String("Temp" + i);
        }

        // Printing the concatenated strings before garbage collection
        System.out.println("Before Garbage Collection:");
        System.out.println("Concatenated String 1: " + s1);
        System.out.println("Concatenated String 2: " + s2);

        // Printing memory usage before garbage collection
        long beforeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory Usage Before Garbage Collection: " + beforeMemory + " bytes");


        // Explicitly setting references to null
        a = null;
        b = null;
        c = null;
        d = null;

        // Suggesting garbage collection
        System.gc();

        // Printing a message before and after garbage collection
        System.out.println("\nGarbage Collection in Progress...\n");
        // Waiting for a moment to observe the effect
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Suggesting garbage collection again
        System.gc();

        // Printing the concatenated strings after garbage collection
        System.out.println("\nAfter Garbage Collection:");
        System.out.println("Concatenated String 1: " + s1);
        System.out.println("Concatenated String 2: " + s2);

        // Printing memory usage after garbage collection
        long afterMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("Memory Usage After Garbage Collection: " + afterMemory + " bytes");


    }

}
