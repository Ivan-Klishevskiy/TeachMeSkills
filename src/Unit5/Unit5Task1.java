package Unit5;

import java.util.Scanner;

public class Unit5Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer("Intel", 8000, 1000000, 5);
        computer.show();
        int forInput;
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print("Введите значение(1/0): ");
                if (scanner.hasNextInt()) {
                    forInput = scanner.nextInt();
                    if(forInput==0||forInput==1){
                        break;
                    }else {
                        System.out.println("Введено неверное значение");
                    }
                } else {
                    System.out.println("Error!");
                    scanner.next();
                }
            }
            if (i % 2 == 0) {
                computer.turnOn(forInput);
            } else {
                computer.turnOff(forInput);
            }
        }
    }
}
