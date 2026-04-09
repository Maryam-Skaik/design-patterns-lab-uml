
package designpattern.onlinestore;

/**
 *
 * @author Raghad Saqallah
 * ID:220232444
 */
public class ShopingCart {
    int cartId ;   // بتم ادخاله من customer

    public ShopingCart(int cartId) {
        this.cartId = cartId;
    }
    
    
    
    public void addProduct(Products p ){   // Dependency Relation   تم استخدام بشكل مؤقت داخل مثود
        System.out.println(p.getProductName() +" has been added to the cart");
    }
    
}
