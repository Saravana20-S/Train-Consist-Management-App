package com.trainconsistapp.sortbogies;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class UseCase7TrainConsistMgmnt {

    // Inner Bogie class to model passenger bogies
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
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("==================================================\n");

        // Create List of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));


        // Display before sorting
        System.out.println("Before Sorting:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Sort bogies based on capacity
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        System.out.println("\nUC7 sorting completed successfully.");
    }
}
