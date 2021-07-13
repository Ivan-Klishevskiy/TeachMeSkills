package Unit3;

import java.util.Random;
import java.util.Scanner;

public class Unit3Task0 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Введите размер массива(целое число): ");
        int n=0;
        int flag=0;
        if(scanner.hasNextInt()){
            n=scanner.nextInt();
            int ms[] = new int[n];
            for (int i = 0; i < n; i++) {
                ms[i] = random.nextInt(100);
            }

            for (int i = 0; i < n; i++) {
                System.out.printf(ms[i] + " ");
            }
        }else{
            System.out.println("Введено не целое число!");
            flag=1;
        }
    }
}
