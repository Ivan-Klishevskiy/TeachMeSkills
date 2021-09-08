package AllClassWorks.ClassWork12Part2;

import java.util.HashMap;
import java.util.Map;

class Product {
    private int price;
    private String name;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Task4 {
    public static void main(String[] args) {
        Map<String, Product> map = new HashMap<>();
        map.put("bomba", new Product(100, "thisBomba"));
        map.put("monkey", new Product(200, "thisMonkey"));
        map.put("knife", new Product(300, "thisKnife"));
        map.entrySet().forEach(System.out::println);
        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);
    }
}
