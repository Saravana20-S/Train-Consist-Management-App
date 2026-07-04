package com.trainconsistapp.linkedhashsetformation;

import java.util.LinkedHashSet;

public class UseCase5TrainConsistMgmnt {
    public static void main(String[] args) {
        // Create LinkedHashSet to represent the train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        System.out.println("===========================================");
        System.out.println(" UC5 - Preserve insertion order of Bogies ");
        System.out.println("===========================================");
        System.out.println();

        // Attach bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach a duplicate bogie
        trainFormation.add("Sleeper");

        // Display the final train formation
        System.out.println("Final Train Formation:");
        System.out.println(trainFormation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and ignores duplicate automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}

