package com.trainconsistapp.regexvalidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseCase11TrainConsistMgmnt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes (Regex)");
        System.out.println("==================================================\n");

        // Read user input
        System.out.print("Enter Train ID (Example: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Example: PET-AB): ");
        String cargoCode = scanner.nextLine();

        System.out.println();

        // Define regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // Create matchers
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        System.out.print("Validation Results:");

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("\nTrain ID Valid: true");
        } else {
            System.out.println("\nTrain ID is Invalid.");
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code Valid: true");
        } else {
            System.out.println("Cargo Code is Invalid.");
        }

        System.out.println("\nUC11 regex validation completed.");

        scanner.close();
    }
}