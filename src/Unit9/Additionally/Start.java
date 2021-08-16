package Unit9.Additionally;

public class Start {
    public static void main(String[] args) {
        Shop shop=new Shop();
        Product first=new Product(24,"Milk",700);
        Product second=new Product(55,"Bread",500);
        Product third=new Product(24,"Milk",400);
        Product four=new Product(27,"Snack",200);
        Product five=new Product(28,"lololo",400);
        shop.addProduct(first);
        shop.addProduct(second);
        shop.addProduct(third);
        shop.addProduct(four);
        shop.addProduct(five);
        System.out.println(shop);
        shop.sortByPrice();
        System.out.println(shop);
        shop.removeProduct(55);
        shop.sortByAddition();
        System.out.println(shop);
        shop.editProduct(new Product(28,"Vodka",300));
        System.out.println(shop);
    }
}
