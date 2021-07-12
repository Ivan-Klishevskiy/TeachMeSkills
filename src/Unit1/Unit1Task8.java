package Unit1;

import java.util.Scanner;

public class Unit1Task8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Введите 1-е число: ");
        int a=scan.nextInt();
        System.out.printf("Введите 2-е число: ");
        int b=scan.nextInt();
        System.out.print("Большее: ");
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
