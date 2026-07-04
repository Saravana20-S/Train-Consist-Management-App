package com.trainconsistapp.linearsearch;

import java.util.Scanner;

public class UseCase18TrainConsistMgmnt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println(" UC18 - Linear Search for Bogie ID");
        System.out.println("==================================================\n");

        // Array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Display available bogies
        System.out.print("Available Bogie IDs: ");
        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Accept search key
        System.out.print("\nEnter Bogie ID to Search: ");
        String searchId = scanner.nextLine();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(searchId)) {

                System.out.println("\nBogie "+bogieIds[i]+" found in train consist.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nBogie ID not found.");
        }

        System.out.println("\nUC18 linear search completed successfully.");

        scanner.close();
    }
}