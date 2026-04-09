
package designpattern.onlinestore;

/**
 * @author Raghad Saqallah
 * ID:220232444
 */
public class Customer {
    
    int customerId;
    String customerName;
    ShopingCart cart ; 
    static int counter =1; // auto counter
    
    
    
    public Customer(int customerId ,String customerName){
        this.customerId = customerId ;
        this.customerName = customerName;
        // Association (Composition) تم انشاء object 
        cart = new ShopingCart(counter++);     // each customer has his own cart
    }
}
