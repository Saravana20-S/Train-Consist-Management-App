package com.trainconsistapp.totalcapacity;

import java.util.ArrayList;
import java.util.List;

public class UseCase10TrainConsistMgmnt {

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
            return  name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC10 - Count Total Seats in Train (reduce)");
        System.out.println("==================================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // Display all bogies
        System.out.println("Bogies in Train:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Calculate total seating capacity using Stream reduce()
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display total seating capacity
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats + " Seats");

        System.out.println("\nUC10 aggregation completed successfully.");
    }
}