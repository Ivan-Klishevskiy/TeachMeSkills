package Unit5;

import java.util.Random;

public class Computer {
    String processor;
    int ram;
    int hardDrive;
    int resourseCycles;
    int burn;
    boolean offOn;          //off - 0, on - 1

    public Computer(String processor, int ram, int hardDrive, int resourseCycles) {
        Random random = new Random();
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
        if (this.burn == 0) {
            if (!this.offOn) {
                if (random.nextInt(2) == inputUserNumber && this.resourseCycles >= 0) {
                    if (this.resourseCycles == 0) {
                        this.burn = 1;
                        System.out.println("Комп сгорел припопытке включения!");
                    } else {
                        this.resourseCycles--;
                        this.offOn = true;
                        System.out.println("Комп включен!");
                    }

                } else {
                    System.out.println("Комп сгорел припопытке включения!");
                    this.burn = 1;
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
        if (this.burn == 0) {
            if (this.offOn) {
                if (random.nextInt(2) == inputUserNumber && this.resourseCycles >= 0) {
                    if (this.resourseCycles == 0) {
                        this.burn = 1;
                        System.out.println("Комп сгорел припопытке выключения!");
                    } else {
                        this.resourseCycles--;
                        this.offOn = false;
                        System.out.println("Комп выключен!");

                    }
                } else {
                    System.out.println("Комп сгорел припопытке выключения!");
                    this.burn = 1;
                }

            } else {
                System.out.println("Комп уже выключен!");
            }
        } else {
            System.out.println("Комп уже сгорел!");
        }
    }
}
