/**
 * This class represents a simple Product in the Online Store.
 * 
 * UML Concept:
 * - Demonstrates basic class structure:
 *   1. Attributes (data)
 *   2. Methods (behavior)
 */
public class Product {

    // Attributes (private → encapsulation)
    private int id;
    private String name;
    private double price;

    /**
     * Constructor initializes the product object
     */
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Getter for product ID
     */
    public int getId() {
        return id;
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
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    /**
     * Display product information
     */
    public void displayProduct() {
        System.out.println(name + " - $" + price);
    }
}
