
package designpattern.onlinestore;


public class NewMain {

    public static void main(String[] args) {
        
        Customer c1 = new Customer(1, "Raghad");
        ShopingCart cart1  =c1.cart;
        Products p  =new Products(5, "Phone");
        cart1.addProduct(p);
        System.out.println(cart1.cartId);
        
        
        Customer c2 = new Customer(1, "Mohammed");
        ShopingCart cart2 =c2.cart;
        System.out.println(cart2.cartId);
    }
    
}
