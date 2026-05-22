package UML;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Shopping Cart.
 * 
 * UML Concept:
 * - Composition: Cart is owned by exactly one Customer
 * - Aggregation: Cart contains Products (products exist independently)
 */
public class ShoppingCart {

    // Attributes
    private Customer owner;          // Composition → ShoppingCart cannot exist without Customer
    private List<Product> products;  // Aggregation → Products can exist without cart

    /**
     * Constructor initializes the cart with its owner
     */
    public ShoppingCart(Customer owner) {
        this.owner = owner;
        this.products = new ArrayList<>();
    }

    /**
     * Method to add product to the cart
     */
    public void addProduct(Product product) {
        products.add(product);
    }

    /**
     * Method to remove a product from the cart
     */
    public void removeProduct(Product product) {
        products.remove(product);
    }

    /**
     * Method to calculate total price of products in cart
     */
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    /**
     * Method to display all products in cart
     */
    public void displayCart() {
        System.out.println("Shopping Cart of " + owner.getName());
        for (Product p : products) {
            p.displayProduct();
        }
        System.out.println("Total: $" + calculateTotal());
        System.out.println("--------------------------");
    }
}
