import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
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

public class ConvertListtoSet {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        // Converting product List into Set
        Set<Float> productPriceList = productsList.stream().filter(product -> product.getPrice() < 30000)
                .map(product -> product.getPrice()).collect(Collectors.toSet());
        System.out.println(productPriceList);

        // Converting Product List into a Map
        Map<Integer, String> productPriceMap = productsList.stream()
                .collect(Collectors.toMap(p -> p.getId(), p -> p.getName()));
        System.out.println(productPriceMap);

        // Method Reference in Stream
        List<Float> productPriceList1 = productsList.stream()
                .filter(p -> p.getPrice() > 30000) // filtering data
                .map(Product::getPrice) // fetching price by referring getPrice method
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList1);

    }
}
