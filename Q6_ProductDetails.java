import java.util.ArrayList;

class ProductDetails {
    int productId;
    String productName;
    double price;

    ProductDetails(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
}

class ProductManager {
    public static void main(String[] args) {
        ArrayList<ProductDetails> productList = new ArrayList<>();

        productList.add(new ProductDetails(1, "Soap", 100));
        productList.add(new ProductDetails(2, "Gel", 300));
        productList.add(new ProductDetails(3, "Shampoo", 400));

        System.out.println("All products:");
        for (ProductDetails p : productList) {
            System.out.println("ID: " + p.productId + ", Name: " + p.productName + ", Price: " + p.price);
        }

        productList.remove(1);

        System.out.println("Updated list after removal:");
        for (ProductDetails p : productList) {
            System.out.println("ID: " + p.productId + ", Name: " + p.productName + ", Price: " + p.price);
        }
    }
}