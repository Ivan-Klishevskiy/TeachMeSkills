package AllClassWorks.ClassWork8.Task4;

public class User {
    private int password;
    private String login;
    private Basket basket;

    public User(int password, String login, Basket basket) {
        this.password = password;
        this.login = login;
        this.basket = basket;
    }

    public static void main(String[] args) {
        Product[] product = new Product[3];
        product[0]=new Product("meat",250,300);
        product[0]=new Product("fish",350,200);
        product[0]=new Product("milk",450,100);
        Basket basket=new Basket(product);
        User user=new User(123,"Lololo",basket);
    }
}
