package com.trainconsistapp.exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class UseCase20TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC20 - Exception Handling During Search");
        System.out.println("==================================================\n");

        // Empty bogie collection
        List<String> bogies = new ArrayList<>();

        // Defensive validation
        if (bogies.isEmpty()) {
            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search.");
        }

        // Search logic (never executes because exception is thrown)
        String searchId = "BG101";

        if (bogies.contains(searchId)) {
            System.out.println("Bogie Found: " + searchId);
        } else {
            System.out.println("Bogie ID not found.");
        }

        System.out.println("\nUC20 completed.");
    }
}