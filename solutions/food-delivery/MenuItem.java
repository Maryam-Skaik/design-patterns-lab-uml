package UML;

/**
 * Represents a Menu Item in a restaurant.
 * 
 * UML Concept:
 * - Basic class with attributes and methods
 * - Demonstrates encapsulation: private attributes, public getters/setters
 */
public class MenuItem {

    // Attributes (private → encapsulation)
    private int id;
    private String name;
    private double price;

    /**
     * Constructor initializes MenuItem object
     */
    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    /**
     * Getter for id
     */
    public int getId() {
        return id;
    }

    /**
     * Getter for name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Method to update the price of menu item
     */
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

    /**
     * Display menu item details
     */
    public void displayItem() {
        System.out.println("MenuItem ID: " + id + ", Name: " + name + ", Price: $" + price);
    }
}
