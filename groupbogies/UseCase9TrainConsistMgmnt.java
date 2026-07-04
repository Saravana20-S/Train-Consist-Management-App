package com.trainconsistapp.groupbogies;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCase9TrainConsistMgmnt {

    // Inner Bogie class
    static class Bogie {

        String name;
        String type;
        int capacity;

        public Bogie(String name, String type, int capacity) {
            this.name = name;
            this.type = type;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Capacity -> " + capacity ;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC9 - Group Bogies by Type (Collectors.groupingBy)");
        System.out.println("==================================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Sleeper", "Goods", 70));
        bogies.add(new Bogie("AC Chair", "Goods", 60));

        System.out.println("All Bogies: ");
        for(Bogie bogie: bogies){
            System.out.println(bogie);
        }

        // Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped bogies
        System.out.println("Grouped Bogies:");

        for(Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()){

            System.out.println("Bogie Type: "+entry.getKey());
            for (Bogie bogie : entry.getValue()) {
                System.out.println("  " + bogie);
            }
            System.out.println();
        }

        System.out.println("\nUC9 grouping completed successfully.");
    }
}