package Unit9.Additionally;

public class Product {
    private int id;
    private String name;
    private int price;
    private int historyNumber;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.historyNumber=0;
    }

    public int getHistoryNumber() {
        return historyNumber;
    }

    public void setHistoryNumber(int historyNumber) {
        this.historyNumber = historyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", historyNumber=" + historyNumber +
                '}';
    }
}
