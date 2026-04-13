package activities.foodDelivery;

import java.util.*;

public class Restaurant {
    private String name;
    private String location;
    private List<MenuItem> menuItems;

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        menuItems = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        this.menuItems.add(new MenuItem(name, price));
    }

    public List<MenuItem> getMenuItems() {
        return new ArrayList<>(menuItems);
    }

    public void showDetails() {
        System.out.println(
                "Restaurant Name: " + name + "\nRestaurant Location: " + location + "\nMenuItems: " + getMenuItems());

    }

}