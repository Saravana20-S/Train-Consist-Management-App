package com.trainconsistapp.bogiecapacity;

import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistMgmnt {

    public static void main(String[] args) {

        // Create HashMap to store bogie-capacity mapping
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("========================================");
        System.out.println();

        // Insert bogie-capacity pairs
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 78);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);

        // Display the bogie capacities
        System.out.println("Train Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() );
        }

        System.out.println("\nUC6 bogie-capacity mapping completed.");
    }
}