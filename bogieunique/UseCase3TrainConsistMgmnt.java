package com.trainconsistapp.bogieunique;

import java.util.Set;
import java.util.HashSet;

public class UseCase3TrainConsistMgmnt {

    public static void main(String[] args) {

        /**
         * Main class - UseCase3TrainConsistMgmnt
         * UseCase3: Track unique bogie IDs
         *
         * Description: This class ensures that duplicate bogie IDs are not
         * added into the train formation using HashSet
         */

        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================");

        Set<String> bogies = new HashSet<String>();
        //add() insert bogie IDs
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // duplicate IDs adding
        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("Bogies after Insertion: ");
        System.out.println(bogies);

        System.out.println("Note: ");
        System.out.println("Duplicates are automatically ignored by HashSet");

        System.out.println("UC3 uniqueness validation completed");

    }
}
