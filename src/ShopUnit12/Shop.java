package ShopUnit12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> list;
    private int countHistoryNumber;

    public Shop() {
        this.list = new ArrayList<>();
        this.countHistoryNumber=0;
    }

    public void sortByPriceAscending(){
        list.sort(Comparator.comparing(Product::getPrice));
    }

    public void sortByPriceDecreasing(){
        list.sort(Comparator.comparing(Product::getPrice).reversed());
    }

    public void sortByHistory(){
        list.sort(Comparator.comparing(Product::getHistoryNumber).reversed());
    }

    public void addProduct(Product product) {
        for (Product i : list) {
            if (i.getId() == product.getId()) {
                System.out.println("Добавление не произошло");
                return;
            }
        }
        product.setHistoryNumber(countHistoryNumber);
        countHistoryNumber++;
        list.add(product);
        System.out.println("Добавление произошло");
    }

    public void removeProduct(int id) {
        for (Product i : list) {
            if (i.getId() == id) {
                System.out.println("Удаление произошло");
                list.remove(i);
                break;
            }
        }
    }

    public void editProduct(Product product) {
        for (Product i : list) {
            if (i.getId() == product.getId()) {
                System.out.println("Редактирование произошло");
                i.setName(product.getName());
                i.setPrice(product.getPrice());
            }
        }
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
        for (Product i : list) {
            System.out.println("ID: "+i.getId() + " Название: " + i.getName() + " Цена: "+ i.getPrice());
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "list=" + list +
                '}';
    }
}
