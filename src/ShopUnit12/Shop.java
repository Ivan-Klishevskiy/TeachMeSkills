package ShopUnit12;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> list;

    public Shop() {
        this.list = new ArrayList<>();
    }

    public void sortByPriceAscending() {
        list.sort(Comparator.comparing(Product::getPrice));
    }

    public void sortByPriceDecreasing() {
        list.sort(Comparator.comparing(Product::getPrice).reversed());
    }

    public void sortByHistory() {
        list.sort(Comparator.comparing(Product::getHistoryOfAdding).reversed());
    }

    public void addProduct(Product product) {
        if (list.stream().noneMatch(x -> x.getId() == product.getId())) {
            product.setHistoryOfAdding(LocalTime.now());
            list.add(product);
            System.out.println("Добавление успешно");
        } else {
            System.out.println("Добавление не успешно");
        }
    }

    public void removeProduct(int id) {
        for (Product i : list) {
            if (i.getId() == id) {
                System.out.println("Удаление успешно");
                list.remove(i);
                return;
            }
        }
        System.out.println("Удаление не успешно");
    }

    public void editProduct(Product product) {
        list.stream().
                filter(i -> i.getId() == product.getId()).
                findFirst().
                ifPresentOrElse((i) -> {
                            i.setName(product.getName());
                            i.setPrice(product.getPrice());
                            System.out.println("Редактирование успешно");
                        },
                        () -> {
                            System.out.println("Редактирование не успешно");
                        });
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public List<Product> getList() {
        return list;
    }

    public List<Integer> getAllId() {
        List<Integer> saveId = new ArrayList<>();
        for (Product i : list) {
            saveId.add(i.getId());
        }
        return saveId;
    }

    public void printList() {
        System.out.println("Все товары:");
        System.out.println("| Название  | цена |  ID  |");
        for (Product i : list) {
            System.out.printf("|%10s | %5d| %5d|\n", i.getName(), i.getPrice(), i.getId());
        }
    }

    @Override
    public String toString() {
        return "Список товаров: " + "\n" + list;
    }
}