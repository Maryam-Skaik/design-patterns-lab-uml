/**
 * This class represents a Product in the online store.
 * 
 * UML Concept:
 * - Demonstrates basic class structure
 * - Multiple carts can reference the same product → Aggregation
 */
public class Product {

    // Attributes (private → encapsulation)
    private int id;
    private String name;
    private double price;

    /**
     * Constructor initializes a product object
     */
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Getter for product name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for product price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Method to update product price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Method to display product details
     */
    public void displayProduct() {
        System.out.println(name + " - $" + price);
    }
}
