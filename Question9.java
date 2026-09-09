interface DeliveryService {
    void deliver(String order);
}

class BikeDelivery implements DeliveryService {
    public void deliver(String order) {
        System.out.println("Delivering " + order + " by Bike");
    }
}

class CarDelivery implements DeliveryService {
    public void deliver(String order) {
        System.out.println("Delivering " + order + " by Car");
    }
}

class DroneDelivery implements DeliveryService {
    public void deliver(String order) {
        System.out.println("Delivering " + order + " by Drone");
    }
}

public class Question9 {
    public static void main(String[] args) {
        DeliveryService service;

        service = new BikeDelivery();
        service.deliver("Pizza");

        service = new CarDelivery();
        service.deliver("Groceries");

        service = new DroneDelivery();
        service.deliver("Medicine");
    }
}