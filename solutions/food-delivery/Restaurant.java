package UML;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Restaurant.
 * 
 * UML Concept:
 * - Shows composition: Restaurant contains many MenuItems
 * - Demonstrates encapsulation, constructors, and behavior methods
 */
public class Restaurant {

    // Attributes
    private String name;
    private List<MenuItem> menu; // Relationship: has many MenuItems

    /**
     * Constructor initializes restaurant and empty menu
     */
    public Restaurant(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    /**
     * Method to add a menu item
     */
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    /**
     * Method to display restaurant name and its menu
     */
    public void displayMenu() {
        System.out.println("Restaurant: " + name);
        System.out.println("Menu:");
        for (MenuItem item : menu) {
            item.displayItem();
        }
        System.out.println("--------------------------");
    }
}
