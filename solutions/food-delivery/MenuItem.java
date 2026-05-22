package UML;

/**
 * This class represents a MenuItem in the Food Delivery System.
 * 
 * UML Concept:
 * - Demonstrates encapsulation: private attributes + getters/setters
 * - Used to show aggregation (MenuItems belong to Restaurant)
 */
public class MenuItem {

    // Attributes
    private String name; // Name of the dish
    private double price; // Price of the dish
    private String description; // Optional description

    /**
     * Constructor initializes the menu item
     */
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    /**
     * Getter for menu item name
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
     * Setter to update price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Getter for description
     */
    public String getDescription() {
        return description;
    }
}
