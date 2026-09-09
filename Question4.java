abstract class Vehicle {
    String registrationNumber;
    String brand;
    double rentalPrice;

    Vehicle(String registrationNumber, String brand, double rentalPrice) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.rentalPrice = rentalPrice;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    Car(String registrationNumber, String brand, double rentalPrice) {
        super(registrationNumber, brand, rentalPrice);
    }

    double calculateRentalCost(int days) {
        return rentalPrice * days;
    }
}

class Bike extends Vehicle {
    Bike(String registrationNumber, String brand, double rentalPrice) {
        super(registrationNumber, brand, rentalPrice);
    }

    double calculateRentalCost(int days) {
        return rentalPrice * days * 0.8;
    }
}

class Truck extends Vehicle {
    Truck(String registrationNumber, String brand, double rentalPrice) {
        super(registrationNumber, brand, rentalPrice);
    }

    double calculateRentalCost(int days) {
        return rentalPrice * days * 1.2;
    }
}

public class Question4 {
    public static void main(String[] args) {
        Vehicle vehicle;

        vehicle = new Car("DL01AB1234", "Honda", 2000);
        System.out.println("Car cost: " + vehicle.calculateRentalCost(3));

        vehicle = new Bike("DL02CD5678", "Yamaha", 1000);
        System.out.println("Bike cost: " + vehicle.calculateRentalCost(3));

        vehicle = new Truck("DL03EF9012", "Tata", 3000);
        System.out.println("Truck cost: " + vehicle.calculateRentalCost(3));
    }
}