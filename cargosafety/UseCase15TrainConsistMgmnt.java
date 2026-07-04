package com.trainconsistapp.cargosafety;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}

public class UseCase15TrainConsistMgmnt {

    // Inner Goods Bogie class
    static class GoodsBogie {

        String shape;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {

            try {

                // Business Rule:
                // Rectangular bogie cannot carry Petroleum
                if (shape.equalsIgnoreCase("Rectangular")
                        && cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }

                System.out.println("Cargo assigned successfully -> " + cargo);

            } catch (CargoSafetyException e) {

                System.out.println("Error: " + e.getMessage());

            } finally {

                System.out.println("Cargo validation completed for " + shape + " bogie");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC15 - Safe Cargo Assignment");
        System.out.println("==================================================\n");

        // Valid Assignment
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum");

        System.out.println();

        // Invalid Assignment
        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");
    }
}