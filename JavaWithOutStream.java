import java.util.ArrayList;
import java.util.List;

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

public class JavaWithOutStream {
    private static List<Product> productsList = new ArrayList<Product>();

    public static void main(String[] args) {

        // Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));
        // Without Java 8 Stream API'S
        withoutStreamAPI();
    }

    private static void withoutStreamAPI() {
        // without Stream API's
        List<Float> productPriceList = new ArrayList<Float>();
        // filtering data of list
        for (Product product : productsList) {
            if (product.getPrice() >= 30000) {
                // adding price to a productPriceList
                productPriceList.add(product.getPrice());
            }
        }

        // displaying data
        for (Float price : productPriceList) {
            System.out.println(price);
        }
    }
}



