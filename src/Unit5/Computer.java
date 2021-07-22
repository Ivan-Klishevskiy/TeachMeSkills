package Unit5;

import java.util.Random;

public class Computer {
    String processor;
    int ram;
    int hardDrive;
    int resourseCycles;
    int burn;               //сгорел - 1
    boolean offOn;          //off - 0, on - 1

    public Computer(String processor, int ram, int hardDrive, int resourseCycles) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.resourseCycles = resourseCycles;
        this.burn = 0;
        this.offOn = false;
    }

    void show() {
        System.out.println("Процессор: " + processor + "\nОперативка: " + ram + "\nЖесткий диск: " + hardDrive + "\nРесурс полных циклов работы: " + resourseCycles);
    }

    void turnOn(int inputUserNumber) {
        Random random = new Random();
        if (burn == 0) {
            if (!offOn) {
                if (random.nextInt(2) == inputUserNumber && resourseCycles >= 0) {
                    if (resourseCycles == 0) {
                        burn = 1;
                        System.out.println("Комп сгорел припопытке включения!");
                    } else {
                        resourseCycles--;
                        offOn = true;
                        System.out.println("Комп включен!");
                    }

                } else {
                    System.out.println("Комп сгорел припопытке включения!");
                    burn = 1;
                }
            } else {
                System.out.println("Комп уже включен!");
            }
        } else {
            System.out.println("Комп уже сгорел!");
        }
    }

    void turnOff(int inputUserNumber) {
        Random random = new Random();
        if (burn == 0) {
            if (offOn) {
                if (random.nextInt(2) == inputUserNumber && resourseCycles >= 0) {
                    if (resourseCycles == 0) {
                        burn = 1;
                        System.out.println("Комп сгорел припопытке выключения!");
                    } else {
                        resourseCycles--;
                        offOn = false;
                        System.out.println("Комп выключен!");

                    }
                } else {
                    System.out.println("Комп сгорел припопытке выключения!");
                    burn = 1;
                }

            } else {
                System.out.println("Комп уже выключен!");
            }
        } else {
            System.out.println("Комп уже сгорел!");
        }
    }
}
