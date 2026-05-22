package UML;

/**
 * Main class to test Food Delivery System
 * 
 * UML Concept:
 * - Shows instantiation of objects
 * - Demonstrates interaction between classes (Restaurant -> MenuItem)
 */
public class Main {

    public static void main(String[] args) {

        // Create a restaurant
        Restaurant r1 = new Restaurant("Happy Meals");

        // Create menu items
        MenuItem burger = new MenuItem("Burger", 5.99);
        MenuItem pizza = new MenuItem("Pizza", 8.99);
        MenuItem soda = new MenuItem("Soda", 1.99);

        // Add menu items to restaurant
        r1.addMenuItem(burger);
        r1.addMenuItem(pizza);
        r1.addMenuItem(soda);

        // Display restaurant menu
        r1.displayMenu();
    }
}
