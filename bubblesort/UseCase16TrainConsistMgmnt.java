package com.trainconsistapp.bubblesort;

public class UseCase16TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC16 - Manual Sorting usig bubble sort");
        System.out.println("==================================================\n");

        // Passenger bogie capacities
        int[] capacities = {72, 24, 56, 108, 48, 90};

        // Display original array
        System.out.print("Original Capacities: ");
        System.out.println();
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        // Bubble Sort Algorithm
        for (int i = 0; i < capacities.length - 1; i++) {

            for (int j = 0; j < capacities.length - 1 - i; j++) {

                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.print("\n\nSorted Capacities (Ascending): ");
        System.out.println();
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        System.out.println("\n\nUC16 bubble sort completed successfully.");
    }
}