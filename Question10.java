interface Discountable {
    void giveDiscount();
}

interface Shippable {
    void ship();
}

interface Returnable {
    void returnProduct();
}

class PhysicalProduct implements Shippable, Returnable {
    public void ship() {
        System.out.println("Product is being shipped.");
    }

    public void returnProduct() {
        System.out.println("Physical product can be returned.");
    }
}

class DigitalProduct implements Discountable {
    public void giveDiscount() {
        System.out.println("Discount given on digital product.");
    }
}

class SpecialProduct implements Discountable, Shippable, Returnable {
    public void giveDiscount() {
        System.out.println("Discount given.");
    }

    public void ship() {
        System.out.println("Special product is being shipped.");
    }

    public void returnProduct() {
        System.out.println("Special product can be returned.");
    }
}

public class Question10 {
    public static void main(String[] args) {
        PhysicalProduct p1 = new PhysicalProduct();
        p1.ship();
        p1.returnProduct();

        DigitalProduct p2 = new DigitalProduct();
        p2.giveDiscount();

        SpecialProduct p3 = new SpecialProduct();
        p3.giveDiscount();
        p3.ship();
        p3.returnProduct();
    }
}