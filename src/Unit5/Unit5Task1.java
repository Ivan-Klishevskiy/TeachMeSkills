package Unit5;

import java.util.Scanner;

public class Unit5Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer("Intel", 8000, 1000000, 5);
        computer.show();
        computer.turnOn();
        computer.turnOff();
    }
}
