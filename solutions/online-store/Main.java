/**
 * Main class to test Online Store System
 * 
 * UML Concept:
 * - Demonstrates composition (Customer -> ShoppingCart)
 * - Demonstrates aggregation (ShoppingCart -> Product)
 */
public class Main {

    public static void main(String[] args) {

        // Create some products
        Product laptop = new Product(1, "Laptop", 1200.00);
        Product mouse = new Product(2, "Mouse", 25.50);
        Product keyboard = new Product(3, "Keyboard", 45.00);

        // Create a customer
        Customer customer1 = new Customer("Alice");

        // Add products to customer's cart
        ShoppingCart cart = customer1.getCart();
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        // Display cart
        cart.displayCart();

        // Remove an item
        cart.removeProduct(mouse);
        System.out.println("After removing mouse:");
        cart.displayCart();
    }
}
