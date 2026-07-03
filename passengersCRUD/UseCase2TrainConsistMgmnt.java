package com.trainconsistapp.passengersCRUD;

import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================================
 * MAIN CLASS - UseCase2PassengerBogies
 * =========================================================================
 * * Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)

 * * Description:
 * This class introduces dynamic modifications to a train consist using
 * fundamental ArrayList operations like add(), remove(), and contains().
 * * At this stage, the application:
 * - Adds passenger bogies (Sleeper, AC Chair, First Class)
 * - Removes a specific bogie to simulate detachment
 * - Verifies the existence of a bogie within the consist
 * - Displays state transitions to the console
 */
public class UseCase2TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display header banner
        System.out.println("==========================================");
        System.out.println("   UC2 - Add Passenger Bogies to Train    ");
        System.out.println("==========================================\n");

        // Initialize an empty ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 1. Add Bogies (Create/Insert)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 2. Remove Bogie (Delete/Detach)
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // 3. Check Existence (Search/Inspect)
        System.out.println("Checking if 'Sleeper' exists:");
        boolean hasSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + hasSleeper + "\n");

        // 4. Print Final Consist State
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies + "\n");

        System.out.println("UC2 operations completed successfully...");
    }
}