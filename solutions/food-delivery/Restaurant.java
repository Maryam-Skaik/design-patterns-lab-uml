package UML;

/**
 * This class represents a Restaurant in the Food Delivery System.
 * 
 * UML Concept:
 * - Demonstrates a class with attributes and methods
 * - Shows one-to-many relationship with MenuItem (a restaurant has many menu items)
 */
import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    // Attributes
    private String name; // Name of the restaurant
    private String location; // Location of the restaurant

    // One-to-many relationship: Restaurant has many MenuItems
    private List<MenuItem> menuItems;

    /**
     * Constructor initializes the restaurant object
     */
    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.menuItems = new ArrayList<>();
    }

    /**
     * Method to add a menu item to the restaurant
     */
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    /**
     * Method to remove a menu item
     */
    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
    }

    /**
     * Getter for restaurant name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to display all menu items
     */
    public void displayMenu() {
        System.out.println("Menu for " + name + ":");
        for (MenuItem item : menuItems) {
            System.out.println("- " + item.getName() + " : $" + item.getPrice());
        }
    }
}
