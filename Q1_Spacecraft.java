class Spacecraft {
    int distance;
    int fuelEfficiency;

    void calculateFuel() {
        try {
            int requiredFuel = distance / fuelEfficiency;
            System.out.println("Required Fuel: " + requiredFuel);
        } catch (ArithmeticException e) {
            System.out.println("Invalid fuel efficiency!");
        }
    }
}