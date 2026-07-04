package com.trainconsistapp.binarysearch;

import java.util.Scanner;

public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println(" UC19 - Binary Search for Bogie ID");
        System.out.println("==================================================\n");

        // Sorted array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG209",
                "BG309",
                "BG412",
                "BG550"
        };

        // Display available bogie IDs
        System.out.print("Sorted Bogie IDs: \n");

        for (String id : bogieIds) {
            System.out.println(id);
        }

        // Accept search key
        System.out.print("\nEnter Bogie ID to Search: ");
        String searchKey = scanner.nextLine();

        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchKey.compareTo(bogieIds[mid]);

            if (result == 0) {

                System.out.println("\nBogie "+bogieIds[mid]+" found using Binary Search.");
                found = true;
                break;

            } else if (result < 0) {

                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        if (!found) {
            System.out.println("\nBogie ID not found.");
        }

        System.out.println("\nUC19 binary search completed successfully.");

        scanner.close();
    }
}