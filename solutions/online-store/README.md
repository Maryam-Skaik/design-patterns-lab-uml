# 🛒 Activity 2: Online Store System - Solution

## 🎯 Objective

This solution demonstrates **UML relationships** and object design in Java:
- Association
- Aggregation
- Composition
- Clean class design

---

## 🧠 Solution Explanation

### Step 1: Identified Classes
- `Customer`
- `ShoppingCart`
- `Product`

### Step 2: Defined Relationships
- **Customer -> ShoppingCart**: Composition
  - Each Customer owns exactly one cart
  - Cart cannot exist independently
- **ShoppingCart -> Product**: Aggregation
  - Cart holds multiple Products
  - Products exist independently of cart

### Step 3: UML Diagram Representation
```
+-------------------+            owns / composition            +----------------------+
|     Customer      |◼────────────────────────────────────────>|     ShoppingCart     |
+-------------------+                                          +----------------------+
| - name            |                                          | - owner: Customer    |
| - cart            |                                          | - products: List<Product> |
+-------------------+                                          +----------------------+
| + addProduct()    |                                          | + addProduct()       |
| + removeProduct() |                                          | + removeProduct()    |
| + displayCart()   |                                          | + displayCart()      |
+-------------------+                                          +----------------------+
                                                                       |
                                                                       | contains / aggregation
                                                                       | *
                                                                       ▼
                                                           +----------------------+
                                                           |       Product        |
                                                           +----------------------+
                                                           | - id                 |
                                                           | - name               |
                                                           | - price              |
                                                           +----------------------+
                                                           | + displayProduct()   |
                                                           +----------------------+

```

### Step 4: Key Design Decisions
- Composition ensures **cart lifecycle depends on customer**
- Aggregation ensures **products can exist independently**
- Multiplicity:
  - Customer → ShoppingCart: 1..1
  - ShoppingCart → Product: 0..*

### Bonus
- `addProduct()` and `removeProduct()` methods
- Total price calculation in cart

### Key Concepts Demonstrated
- Classes, attributes, methods
- Encapsulation
- Composition vs Aggregation
- Multiplicity
- Object interaction
