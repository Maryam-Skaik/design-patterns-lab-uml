package activities.foodDelivery;

public class Main {
      public static void main(String[] args) throws Exception {
        Restaurant r = new Restaurant("The Family kitchen", "Gaza - Big street");
        r.addMenuItem("French Fries", 5);
        r.addMenuItem("Pizza", 35);
        r.addMenuItem("Steak", 40);
        r.addMenuItem("Burger", 30);
        r.addMenuItem("Shawarma", 15);
        r.addMenuItem("Salad", 7);
        r.showDetails();

    }
}
