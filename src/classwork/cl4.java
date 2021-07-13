package classwork;

import java.util.Scanner;

public class cl4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a=scan.nextInt();
        int sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
