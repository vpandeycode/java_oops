abstract class Ride {
    abstract double calculateFare(double distance);
}

class Bike extends Ride {
    double calculateFare(double distance) {
        return distance * 10;
    }
}

class Sedan extends Ride {
    double calculateFare(double distance) {
        return distance * 20;
    }
}

class SUV extends Ride {
    double calculateFare(double distance) {
        return distance * 30;
    }
}

public class Question12 {
    public static void main(String[] args) {
        double distance = 10;
        Ride ride;

        ride = new Bike();
        System.out.println("Bike fare: Rs. " + ride.calculateFare(distance));

        ride = new Sedan();
        System.out.println("Sedan fare: Rs. " + ride.calculateFare(distance));

        ride = new SUV();
        System.out.println("SUV fare: Rs. " + ride.calculateFare(distance));
    }
}