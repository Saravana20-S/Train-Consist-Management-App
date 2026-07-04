package com.trainconsistapp.arrayssort;

import java.util.Arrays;

public class UseCase17TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("==================================================\n");

        // Array of bogie type names
        String[] bogieTypes = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display before sorting
        System.out.println("Original Bogie Names:");
        System.out.println(Arrays.toString(bogieTypes));

        // Sort using Arrays.sort()
        Arrays.sort(bogieTypes);

        // Display after sorting
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieTypes));

        System.out.println("\nUC17 Arrays.sort() completed successfully.");
    }
}