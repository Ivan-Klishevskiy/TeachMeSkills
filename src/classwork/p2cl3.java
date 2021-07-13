package classwork;

import java.util.Scanner;

public class p2cl3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a=scan.nextInt();
        int sum=a%10;
        while(a>=10){
            a/=10;
        }
        sum+=a;
        System.out.println(sum);
    }
}
