package UML;

/**
 * This class represents a MenuItem offered by a Restaurant.
 * 
 * UML Concept:
 * - Demonstrates basic class structure
 * - Shows relationship: Restaurant "has many" MenuItems
 */
public class MenuItem {

    // Attributes (private → encapsulation)
    private String name;
    private double price;

    /**
     * Constructor initializes a menu item
     */
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
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
     * Method to display information about the menu item
     */
    public void displayItem() {
        System.out.println(name + " - $" + price);
    }
}
