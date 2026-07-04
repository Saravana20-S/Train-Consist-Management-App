package com.trainconsistapp.safetycompliance;

import java.util.ArrayList;
import java.util.List;

public class UseCase12TrainConsistMgmnt {

    // Inner Goods Bogie class
    static class GoodsBogie {

        String type;
        String cargo;

        public GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("==================================================\n");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grains"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display goods bogies
        System.out.println("Goods Bogies in train:");
        goodsBogies.forEach(System.out::println);

        // Safety compliance check
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie ->
                        !bogie.type.equalsIgnoreCase("Cylindrical")
                                || bogie.cargo.equalsIgnoreCase("Petroleum"));

        // Display result
        System.out.println("\nSafety Compliance Status: "+isSafe);

        if (isSafe) {
            System.out.println("Train formation is SAFE.");
        } else {
            System.out.println("Train formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety compliance validation successfully.");
    }
}