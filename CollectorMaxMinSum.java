import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

public class CollectorMaxMinSum {
    public static void main(String args[]) {
        List<Product> productsList = new ArrayList<Product>();
        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // Using Collectors's method to sum the prices.
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.getPrice()));
        System.out.println(totalPrice3);

        // max() method to get max Product price
        Product productA = productsList.stream()
                .max((product1, product2) -> product1.getPrice() > product2.getPrice() ? 1 : -1).get();

        System.out.println(productA.getPrice());
        // min() method to get min Product price
        Product productB = productsList.stream()
                .max((product1, product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1).get();
        System.out.println(productB.getPrice());
    }

}