package com.trainconsistapp.performancecomparison;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase13TrainConsistMgmnt {

    // Inner Bogie class
    static class Bogie {

        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Bogie Name: " + name + ", Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("==================================================\n");

        // Create a collection of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 108));
        bogies.add(new Bogie("Executive Chair", 52));
        bogies.add(new Bogie("General", 90));

        // ---------------- Loop-based Filtering ----------------

        long loopStart = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();

        for (Bogie bogie : bogies) {
            if (bogie.capacity > 60) {
                loopResult.add(bogie);
            }
        }

        long loopEnd = System.nanoTime();

        // ---------------- Stream-based Filtering ----------------

        long streamStart = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();

        // Display Results

        System.out.println("Bogies with Capacity > 60:");

        for (Bogie bogie : streamResult) {
            System.out.println(bogie);
        }

        System.out.println("\nLoop Execution Time   : " + (loopEnd - loopStart) + " ns");
        System.out.println("Stream Execution Time : " + (streamEnd - streamStart) + " ns");

        System.out.println("\nUC13 performance comparison completed successfully.");
    }
}