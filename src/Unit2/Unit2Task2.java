package Unit2;

public class Unit2Task2 {
    public static void main(String[] args) {
        int countAmeba=1;
        int time=0;
        do {
            countAmeba*=2;
            System.out.println("Кол-во амеб чрез "+((time+1)*3)+" часов: "+countAmeba);
            time++;
        }while(time<8);
    }
}
