package com.trainconsistapp.filterbogies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmnt {

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
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("==================================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Display all bogies
        System.out.println("All Passenger Bogies:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Filter bogies with capacity greater than 60
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nPassenger Bogies with Capacity > 60:");
        for (Bogie bogie : filteredBogies) {
            System.out.println(bogie);
        }

        System.out.println("\nUC8 stream filtering completed successfully.");
    }
}