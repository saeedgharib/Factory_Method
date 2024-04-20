/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FM_Example_2;

/**
 *
 * @author malik
 */
import java.util.HashMap;
import java.util.Map;

// Defines the interface of objects the factory method creates.
interface Product {
    void print();
}

// Implements the Product interface.
class ConcreteProductMINE implements Product {
    public void print() {
        System.out.println("this=" + this + " print MINE");
    }
}

// Implements the Product interface.
class ConcreteProductYOURS implements Product {
    public void print() {
        System.out.println("this=" + this + " print YOURS");
    }
}

// Declares the factory method, which returns an object of type Product.
class Creator {
    private final Map<ProductId, ProductFactory> factories = new HashMap<>();

    public Creator() {
        factories.put(ProductId.MINE, ConcreteProductMINE::new);
        factories.put(ProductId.YOURS, ConcreteProductYOURS::new);
        // Add more factories for other products if needed
    }

    public Product create(ProductId id) {
        ProductFactory factory = factories.get(id);
        if (factory != null) {
            return factory.create();
        }
        return null;
    }

    private interface ProductFactory {
        Product create();
    }
}
enum ProductId {MINE, YOURS}
public class Product_Example {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Product product = creator.create(ProductId.MINE);
        product.print();

        product = creator.create(ProductId.YOURS);
        product.print();
    }
}
