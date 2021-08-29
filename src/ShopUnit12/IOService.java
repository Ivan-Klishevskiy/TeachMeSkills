package ShopUnit12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOService {
    private Scanner sc;

    public  void writeInFile(String way,String txt){
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(way))) {
            writer.write(txt);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


    public int getInt(int min, int max) {
        sc = new Scanner(System.in);
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Ошибка ввода. Введите число:");
                sc.next();
            }
            int number = sc.nextInt();
            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.println("Ошибка ввода. Число меньше чем  " + min + " или больше чем " + max);
            }
        }
    }

    public String getString() {
        sc = new Scanner(System.in);
        while (true) {
            while (!sc.hasNextLine()) {
                sc.next();
            }
            String str = sc.nextLine();
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < 'A' || str.charAt(i) > 'z') {
                    flag = false;
                    System.out.println("Ошибка ввода.");
                    break;
                }
            }
            if (flag) {
                return str;
            }
        }
    }
}
