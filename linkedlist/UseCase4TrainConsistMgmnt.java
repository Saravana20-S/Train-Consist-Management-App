package com.trainconsistapp.linkedlist;

import java.util.LinkedList;

public class UseCase4TrainConsistMgmnt {

    public static void main(String[] args) {
        // Create LinkedList for Train Consist
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies
        consist.addLast("Engine");
        consist.addLast("Sleeper");
        consist.addLast("AC");
        consist.addLast("Cargo");
        consist.addLast("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(consist);

        // Insert Pantry Car at position 2
        consist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting Pantry Car:");
        System.out.println(consist);

        // Remove first bogie
        consist.removeFirst();

        // Remove last bogie
        consist.removeLast();

        System.out.println("\nFinal Train Consist:");
        System.out.println(consist);

        System.out.println("\nUC4 LinkedList operations completed successfully.");
    }
}
