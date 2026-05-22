# 🍔 Activity 1: Food Delivery System - Solution

## 🎯 Objective

This solution demonstrates modeling a simple Food Delivery system using **UML Class Diagrams** and translating it into **Java code**.

---

## 🧠 Solution Explanation

### Step 1: Identified Classes
- `Restaurant`
- `MenuItem`

### Step 2: Defined Relationships
- **Restaurant has many MenuItems** (composition)
- Each MenuItem belongs to exactly one restaurant

### Step 3: UML Diagram Representation
```

+------------------+           1..* +------------------+
|    Restaurant    |<>-------------|    MenuItem      |
+------------------+               +------------------+
| - name: String   |               | - name: String   |
| - menu: List     |               | - price: double  |
+------------------+               +------------------+
| +addMenuItem()   |               | +displayItem()   |
| +displayMenu()   |               +------------------+
+------------------+

```

### Step 4: Java Implementation Highlights
- `Restaurant` uses `ArrayList<MenuItem>` to store menu items.
- `MenuItem` contains name and price with methods to display itself.
- `Main` class demonstrates object creation and interaction.

### Bonus
- `displayMenu()` method in `Restaurant` shows simple interaction between objects.

---

## ✅ Key Concepts Demonstrated
- Classes, attributes, and methods
- Encapsulation
- Composition (Restaurant "has many" MenuItems)
- Object creation and interaction
- Clean and readable Java implementation
