package Unit5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    String processor;
    int ram;
    int hardDrive;
    int resourceCycles;
    boolean burn;               //сгорел - 1
    boolean offOn;          //off - 0, on - 1

    public Computer(String processor, int ram, int hardDrive, int resourceCycles) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.resourceCycles = resourceCycles;
        this.offOn = false;
    }

    void show() {
        System.out.println("Процессор: " + processor + "\nОперативка: " + ram + "\nЖесткий диск: " + hardDrive + "\nРесурс полных циклов работы: " + resourceCycles);
    }

    void turnOn() {
        int inputUserNumber=0;
        inputUserNumber = this.getInputUserNumber();
        if (!burn) {
            if (!offOn) {
                if (random.nextInt(2) == inputUserNumber && resourceCycles > 0) {
                    resourceCycles--;
                    offOn=true;
                    System.out.println("Комп включен");
                } else {
                    System.out.println("Комп сгорел при попытке включения!");
                    burn = true;
                }
            } else {
                System.out.println("Комп уже включен!");
            }
        } else {
            System.out.println("Комп уже сгорел!");
        }
    }

     int getInputUserNumber() {
        int inputUserNumber;
        while (true) {
            System.out.print("Введите значение(1/0): ");
            if (scanner.hasNextInt()) {
                inputUserNumber = scanner.nextInt();
                if(inputUserNumber==0||inputUserNumber==1){
                    break;
                }else {
                    System.out.println("Введено неверное значение");
                }
            } else {
                System.out.println("Error!");
                scanner.next();
            }
        }
        return inputUserNumber;
    }

    void turnOff() {
        int inputUserNumber=0;
        inputUserNumber = this.getInputUserNumber();
        if (!burn) {
            if (offOn) {
                if (random.nextInt(2) == inputUserNumber && resourceCycles > 0) {
                    resourceCycles--;
                    offOn=false;
                    System.out.println("Комп выключен!");
                } else {
                    System.out.println("Комп сгорел припопытке выключения!");
                    burn = true;
                }

            } else {
                System.out.println("Комп уже выключен!");
            }
        } else {
            System.out.println("Комп уже сгорел!");
        }
    }
}
