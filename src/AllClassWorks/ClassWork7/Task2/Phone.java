package AllClassWorks.ClassWork7.Task2;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone() {
        this.number = 0;
        this.model = null;
        this.weight = 0;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name){
        System.out.println("Звонит "+name);
    }

    public void receiveCall(String name,int numberCall){
        System.out.println("Звонит "+name+" номер: "+numberCall);
    }

    public void sendMessage(int ... numberCall){
        for(int i:numberCall){
            System.out.println(i);
        }
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone phone1 =new Phone(123,"Sony",300);
        Phone phone2 =new Phone(456,"Iphone");
        Phone phone3 =new Phone();
        phone1.receiveCall("jora");
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        phone1.receiveCall("Fedor");
        phone2.receiveCall("Nikita",123456789);
        phone3.sendMessage(123,456,789,1011);

    }
}
