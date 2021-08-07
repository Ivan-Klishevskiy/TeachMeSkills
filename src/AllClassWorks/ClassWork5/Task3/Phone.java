package AllClassWorks.classwork5.Task3;

public class Phone {
    int number;
    String model;
    int weight;

    Phone() {
        this.number = 0;
        this.model = "def";
        this.weight = 0;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " номер " + number);
    }

    int getNumber() {
        return number;
    }

    void sendMessage(int ... number){
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]+" ");
        }
    }

}
