package Unit8.Task1;

import Unit8.Task1.Jacket.IJacket;
import Unit8.Task1.Pants.IPants;
import Unit8.Task1.Shoes.IShoes;

public class Human {
    private String name;
    private IJacket jacket;
    private IPants pant;
    private IShoes shoes;

    public String getName() {
        return name;
    }

    public Human(String name, IJacket jacket, IPants pant, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pant = pant;
        this.shoes = shoes;
    }

    public void getDressed(){
        jacket.putOn();
        pant.putOn();
        shoes.putOn();
    }

    public void undress(){
        jacket.takeOff();
        pant.takeOff();
        shoes.takeOff();
    }
}
