import java.util.LinkedList;

class FoodOrder {
    public static void main(String[] args) {
        LinkedList<String> foodList = new LinkedList<>();

        foodList.addFirst("Pizza");
        foodList.addFirst("Burger");
        foodList.addFirst("Pasta");
        foodList.addFirst("Sandwich");

        System.out.println("First item: " + foodList.getFirst());

        foodList.removeLast();

        System.out.println("Updated list:");
        for (String item : foodList) {
            System.out.println(item);
        }
    }
}