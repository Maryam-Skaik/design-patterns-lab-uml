package activities.onlineStore;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("Ahmad", "Gaza", "6312130003");
        Product p = new Product("Hoodie", "2FX34", 250);
        Product p2 = new Product("Jeans", "0YX89", 80);

        Product p3 = new Product("Sneakers", "2EEE4", 360);
        Product p4 = new Product("Jacket", "N27MK", 120);

        Product p5 = new Product("Air Fryer", "HSU92", 1900);
        Product p6 = new Product("Gaming Chair", "2L3D4", 5670);
        Product p7 = new Product("USB Flash Drive", "98H3X", 50);
        ShoppingCart sc = c.getShoppingCart();

        sc.addProduct(p);
        sc.addProduct(p5);

        sc.addProduct(p2);

        sc.addProduct(p3);
        sc.addProduct(p4);

        sc.addProduct(p6);
        sc.addProduct(p7);
        System.out.println("////////Shopping Cart//////////");
        System.out.println(sc);
        System.out.println("////////Customer//////////");
        System.out.println(c);
    }
}
