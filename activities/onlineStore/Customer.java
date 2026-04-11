package activities.onlineStore;

public class Customer {
    private String name;
    private String location;
    private String mobileNumber;
    private ShoppingCart cart;

    public Customer(String name, String location, String mobileNumber) {
        this.name = name;
        this.location = location;
        this.mobileNumber = mobileNumber;
        cart = new ShoppingCart();
    }

    public ShoppingCart getShoppingCart() {
        return cart;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", location=" + location + ", Mobile Number=" + mobileNumber + ", cart="
                + cart
                + "]";
    }

}
