package Unit14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Phone{
    private String brand;
    private int price;

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Task1 {
    public static void main(String[] args) {
        Stream<Phone> p= Stream.of(new Phone("Iphone",800),
                new Phone("Samsung",400),
                new Phone("Xiaomi",200),new Phone("Motorolla",1000));
        p
                .flatMap(phone -> Stream.of(
                        String.format("Название %s цена без скидки: %d",phone.getBrand(),phone.getPrice()),
                        String.format("Название %s цена c скидкой: %d\n",phone.getBrand(),phone.getPrice()-(int)(phone.getPrice()*0.1))
                ))
                .forEach(System.out::println);

        List<String> list=new ArrayList<>();

    }
}
