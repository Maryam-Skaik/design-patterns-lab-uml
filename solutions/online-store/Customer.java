/**
 * This class represents a Customer.
 * 
 * UML Concept:
 * - Composition: Each customer owns exactly one ShoppingCart
 * - Demonstrates encapsulation and object creation
 */
public class Customer {

    // Attributes
    private String name;
    private ShoppingCart cart;  // Composition → lifecycle of cart depends on customer

    /**
     * Constructor initializes customer and their cart
     */
    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart(this); // Cart is created along with customer
    }

    /**
     * Getter for name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for cart
     */
    public ShoppingCart getCart() {
        return cart;
    }
}
